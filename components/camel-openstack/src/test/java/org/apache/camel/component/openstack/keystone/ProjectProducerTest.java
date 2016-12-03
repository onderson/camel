/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.openstack.keystone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.camel.component.openstack.keystone.producer.ProjectProducer;
import org.apache.camel.component.openstack.neutron.NeutronConstants;

import org.junit.Before;
import org.junit.Test;

import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.model.network.Network;

import java.util.ArrayList;
import java.util.List;

public class ProjectProducerTest extends KeystoneProducerTestSupport {

	private Project dummyProject;

	@Mock
	private Project testOSproject;

	@Before
	public void setUp() {
		producer = new ProjectProducer(endpoint, client);
		
		when(projectService.create(any(Project.class))).thenReturn(testOSproject);
		when(projectService.get(anyString())).thenReturn(testOSproject);

		List<Project> getAllList = new ArrayList<>();
		getAllList.add(testOSproject);
		getAllList.add(testOSproject);
		doReturn(getAllList).when(projectService).list();
		
		dummyProject = createProject();

		when(testOSproject.getName()).thenReturn(dummyProject.getName());
		when(testOSproject.getDescription()).thenReturn(dummyProject.getDescription());
	}
	
	@Test
	public void createTest() throws Exception {
		msg.setHeader(KeystoneConstants.OPERATION, KeystoneConstants.CREATE);
		msg.setHeader(KeystoneConstants.NAME, dummyProject.getName());
		msg.setHeader(KeystoneConstants.DESCRIPTION, dummyProject.getDescription());
		msg.setHeader(KeystoneConstants.DOMAIN_ID, dummyProject.getDomainId());
		msg.setHeader(KeystoneConstants.PARENT_ID, dummyProject.getParentId());


		producer.process(exchange);

		ArgumentCaptor<Project> captor = ArgumentCaptor.forClass(Project.class);
		verify(projectService).create(captor.capture());

		assertEqualsProject(dummyProject, captor.getValue());
	}

	@Test
	public void getTest() throws Exception {
		final String id = "id";
		msg.setHeader(NeutronConstants.OPERATION, NeutronConstants.GET);
		msg.setHeader(NeutronConstants.ID, id);

		producer.process(exchange);

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(projectService).get(captor.capture());

		assertEquals(id, captor.getValue());
		assertEqualsProject(testOSproject, msg.getBody(Project.class));
	}

	@Test
	public void getAllTest() throws Exception {
		msg.setHeader(NeutronConstants.OPERATION, NeutronConstants.GET_ALL);

		producer.process(exchange);

		final List<Network> result = msg.getBody(List.class);
		assertTrue(result.size() == 2);
		assertEquals(testOSproject, result.get(0));
	}

	@Test
	public void updateTest() throws Exception {
		final String id = "myID";
		msg.setHeader(KeystoneConstants.OPERATION, KeystoneConstants.UPDATE);
		final String newName = "newName";

		when(testOSproject.getId()).thenReturn(id);
		when(testOSproject.getName()).thenReturn(newName);
		when(testOSproject.getDescription()).thenReturn("desc");

		when(projectService.update(any(Project.class))).thenReturn(testOSproject);
		msg.setBody(testOSproject);

		producer.process(exchange);

		ArgumentCaptor<Project> captor = ArgumentCaptor.forClass(Project.class);
		verify(projectService).update(captor.capture());

		assertEqualsProject(testOSproject, captor.getValue());
		assertNotNull(captor.getValue().getId());
		assertEquals(newName, msg.getBody(Project.class).getName());
	}
	
	@Test
	public void deleteTest() throws Exception {
		when(projectService.delete(anyString())).thenReturn(ActionResponse.actionSuccess());
		final String networkID = "myID";
		msg.setHeader(NeutronConstants.OPERATION, NeutronConstants.DELETE);
		msg.setHeader(NeutronConstants.ID, networkID);

		producer.process(exchange);

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(projectService).delete(captor.capture());
		assertEquals(networkID, captor.getValue());
		assertFalse(msg.isFault());

		//in case of failure
		final String failureMessage = "fail";
		when(projectService.delete(anyString())).thenReturn(ActionResponse.actionFailed(failureMessage, 404));
		producer.process(exchange);
		assertTrue(msg.isFault());
		assertTrue(msg.getBody(String.class).contains(failureMessage));
	}

	private void assertEqualsProject(Project old, Project newProject) {
		assertEquals(old.getName(), newProject.getName());
		assertEquals(old.getDescription(), newProject.getDescription());
		assertEquals(old.getDomainId(), newProject.getDomainId());
	}

	private Project createProject() {
		return Builders.project()
				.domainId("domain")
				.description("desc")
				.name("project Name")
				.parentId("parent").build();
	}

}

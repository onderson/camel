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
package org.apache.camel.language.xpath.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.LanguageConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To use XPath (XML) in Camel expressions or predicates.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.language.xpath")
public class XPathLanguageConfiguration
        extends
            LanguageConfigurationPropertiesCommon {

    /**
     * Name of class for document type The default value is org.w3c.dom.Document
     */
    private String documentType;
    /**
     * Whether to use Saxon.
     */
    private Boolean saxon = false;
    /**
     * References to a custom XPathFactory to lookup in the registry
     */
    private String factoryRef;
    /**
     * The XPath object model to use
     */
    private String objectModel;
    /**
     * Whether to log namespaces which can assist during trouble shooting
     */
    private Boolean logNamespaces = false;
    /**
     * Whether to enable thread-safety for the returned result of the xpath
     * expression. This applies to when using NODESET as the result type, and
     * the returned set has multiple elements. In this situation there can be
     * thread-safety issues if you process the NODESET concurrently such as from
     * a Camel Splitter EIP in parallel processing mode. This option prevents
     * concurrency issues by doing defensive copies of the nodes. It is
     * recommended to turn this option on if you are using camel-saxon or Saxon
     * in your application. Saxon has thread-safety issues which can be
     * prevented by turning this option on.
     */
    private Boolean threadSafety = false;
    /**
     * Whether to trim the value to remove leading and trailing whitespaces and
     * line breaks
     */
    private Boolean trim = true;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Boolean getSaxon() {
        return saxon;
    }

    public void setSaxon(Boolean saxon) {
        this.saxon = saxon;
    }

    public String getFactoryRef() {
        return factoryRef;
    }

    public void setFactoryRef(String factoryRef) {
        this.factoryRef = factoryRef;
    }

    public String getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(String objectModel) {
        this.objectModel = objectModel;
    }

    public Boolean getLogNamespaces() {
        return logNamespaces;
    }

    public void setLogNamespaces(Boolean logNamespaces) {
        this.logNamespaces = logNamespaces;
    }

    public Boolean getThreadSafety() {
        return threadSafety;
    }

    public void setThreadSafety(Boolean threadSafety) {
        this.threadSafety = threadSafety;
    }

    public Boolean getTrim() {
        return trim;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }
}
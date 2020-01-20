/*
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
package org.apache.camel.tooling.util;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.apache.camel.tooling.util.PackageHelper.JSON_SUFIX;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PackageHelperTest {

    @Test
    public void testFileToString() throws Exception {
        assertEquals("dk19i21)@+#(OR\n", PackageHelper.loadText(ResourceUtils.getResourceAsFile("filecontent/a.txt")));
    }

    @Test
    public void testFindJsonFiles() throws Exception {
        Set<File> jsons = PackageHelper.findJsonFiles(ResourceUtils.getResourceAsFile("json"));
        Map<String, File> jsonFiles = jsons.stream().collect(Collectors.toMap(
                file -> file.getName().replace(JSON_SUFIX, ""), file -> file));

        assertTrue("Files a.json must be found", jsonFiles.containsKey("a"));
        assertTrue("Files b.json must be found", jsonFiles.containsKey("b"));
        assertFalse("File c.txt must not be found", jsonFiles.containsKey("c"));
    }
}

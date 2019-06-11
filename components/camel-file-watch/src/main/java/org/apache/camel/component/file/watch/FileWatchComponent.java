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
package org.apache.camel.component.file.watch;

import java.util.Map;

import io.methvin.watcher.hashing.FileHasher;
import org.apache.camel.Endpoint;
import org.apache.camel.spi.Registry;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.DefaultComponent;

/**
 * Represents the component that manages {@link FileWatchEndpoint}.
 */
@Component("file-watch")
public class FileWatchComponent extends DefaultComponent {
    public static final String EVENT_TYPE_HEADER = "FileEventType";

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new FileWatchEndpoint(uri, remaining, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        Registry registry = getCamelContext().getRegistry();
        if (registry.lookupByNameAndType("murmur3FFileHasher", FileHasher.class) == null) {
            registry.bind("murmur3FFileHasher", FileHasher.class, FileHasher.DEFAULT_FILE_HASHER);
        }
        if (registry.lookupByNameAndType("lastModifiedTimeFileHasher", FileHasher.class) == null) {
            registry.bind("lastModifiedTimeFileHasher", FileHasher.class, FileHasher.LAST_MODIFIED_TIME);
        }
    }
}

/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.cosmosdb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("vcap.services.cosmosdb.credentials")
public class DocumentDbProperties {

    private String uri;
    private String key;
    private String database;

    private String cosmosdbHostEndpoint;
    private String cosmosdbMasterKey;
    private String cosmosdbDatabaseId;

    public String getUri() {
        return this.getCosmosdbHostEndpoint();
    }

    public String getKey() {
        return this.getCosmosdbMasterKey();
    }

    public String getDatabase() {
        return this.getCosmosdbDatabaseId();
    }
}

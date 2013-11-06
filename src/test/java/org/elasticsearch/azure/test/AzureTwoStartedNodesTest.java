/*
 * Licensed to ElasticSearch under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.azure.test;

import org.junit.Test;

public class AzureTwoStartedNodesTest extends AzureAbstractTest {

    public AzureTwoStartedNodesTest() {
        super(AzureComputeServiceTwoNodesMock.class);
    }

    @Test
    public void two_nodes_should_run() {
        // Then we start our node for tests
        nodeBuilder();
        nodeBuilder();

        // We expect having 2 nodes as part of the cluster, let's test that
        checkNumberOfNodes(2, false);
    }
}

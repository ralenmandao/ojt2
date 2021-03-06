package org.apache.maven.plugin.dependency.utils.filters;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */

import org.apache.maven.plugin.dependency.fromConfiguration.ArtifactItem;
import org.apache.maven.shared.artifact.filter.collection.ArtifactFilterException;

/**
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 * @version $Id: ArtifactItemFilter.java 1032021 2010-11-06 12:21:39Z bentmann $
 */
public interface ArtifactItemFilter
{

    boolean isArtifactIncluded( ArtifactItem item )
        throws ArtifactFilterException;
}

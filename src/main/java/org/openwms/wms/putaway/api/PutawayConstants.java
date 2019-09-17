/*
 * Copyright 2005-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openwms.wms.putaway.api;

/**
 * A PutawayConstants.
 *
 * @author Heiko Scherrer
 */
public final class PutawayConstants {

    /** API version. */
    public static final String API_VERSION = "v1";
    /** API root to hit a LocationGroup. */
    public static final String API_LOCATION_GROUP = "/" + API_VERSION + "/location-group";
    /** API root to hit LocationGroups (plural). */
    public static final String API_LOCATION_GROUPS = "/" + API_VERSION + "/location-groups";

    private PutawayConstants() {
    }
}

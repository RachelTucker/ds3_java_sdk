/*
 * ******************************************************************************
 *   Copyright 2014-2019 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ****************************************************************************
 */

// This code is auto-generated, do not modify
package com.spectralogic.ds3client.commands.internal;

import com.spectralogic.ds3client.networking.HttpVerb;
import com.spectralogic.ds3client.commands.interfaces.AbstractRequest;
import com.google.common.net.UrlEscapers;
import java.util.UUID;

public class PutUserInternalRequest extends AbstractRequest {

    // Variables
    
    private final String name;

    private String defaultDataPolicyId;

    private boolean force;

    private String id;

    private int maxBuckets;

    private String secretKey;

    // Constructor
    
    
    public PutUserInternalRequest(final String name) {
        this.name = name;
        
        this.updateQueryParam("name", name);

    }

    public PutUserInternalRequest withDefaultDataPolicyId(final UUID defaultDataPolicyId) {
        this.defaultDataPolicyId = defaultDataPolicyId.toString();
        this.updateQueryParam("default_data_policy_id", defaultDataPolicyId);
        return this;
    }


    public PutUserInternalRequest withDefaultDataPolicyId(final String defaultDataPolicyId) {
        this.defaultDataPolicyId = defaultDataPolicyId;
        this.updateQueryParam("default_data_policy_id", defaultDataPolicyId);
        return this;
    }


    public PutUserInternalRequest withForce(final boolean force) {
        this.force = force;
        if (this.force) {
            this.getQueryParams().put("force", null);
        } else {
            this.getQueryParams().remove("force");
        }
        return this;
    }


    public PutUserInternalRequest withId(final UUID id) {
        this.id = id.toString();
        this.updateQueryParam("id", id);
        return this;
    }


    public PutUserInternalRequest withId(final String id) {
        this.id = id;
        this.updateQueryParam("id", id);
        return this;
    }


    public PutUserInternalRequest withMaxBuckets(final int maxBuckets) {
        this.maxBuckets = maxBuckets;
        this.updateQueryParam("max_buckets", maxBuckets);
        return this;
    }


    public PutUserInternalRequest withSecretKey(final String secretKey) {
        this.secretKey = secretKey;
        this.updateQueryParam("secret_key", secretKey);
        return this;
    }



    @Override
    public HttpVerb getVerb() {
        return HttpVerb.POST;
    }

    @Override
    public String getPath() {
        return "/_rest_/user_internal";
    }
    
    public String getName() {
        return this.name;
    }


    public String getDefaultDataPolicyId() {
        return this.defaultDataPolicyId;
    }


    public boolean getForce() {
        return this.force;
    }


    public String getId() {
        return this.id;
    }


    public int getMaxBuckets() {
        return this.maxBuckets;
    }


    public String getSecretKey() {
        return this.secretKey;
    }

}
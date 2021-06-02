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
import com.spectralogic.ds3client.models.FeatureKeyType;
import com.google.common.net.UrlEscapers;
import java.util.Date;
import java.lang.Long;

public class PutFeatureKeyInternalRequest extends AbstractRequest {

    // Variables
    
    private final FeatureKeyType key;

    private String errorMessage;

    private Date expirationDate;

    private Long limitValue;

    // Constructor
    
    
    public PutFeatureKeyInternalRequest(final FeatureKeyType key) {
        this.key = key;
        
        this.updateQueryParam("key", key);

    }

    public PutFeatureKeyInternalRequest withErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
        this.updateQueryParam("error_message", errorMessage);
        return this;
    }


    public PutFeatureKeyInternalRequest withExpirationDate(final Date expirationDate) {
        this.expirationDate = expirationDate;
        this.updateQueryParam("expiration_date", expirationDate);
        return this;
    }


    public PutFeatureKeyInternalRequest withLimitValue(final Long limitValue) {
        this.limitValue = limitValue;
        this.updateQueryParam("limit_value", limitValue);
        return this;
    }



    @Override
    public HttpVerb getVerb() {
        return HttpVerb.POST;
    }

    @Override
    public String getPath() {
        return "/_rest_/feature_key";
    }
    
    public FeatureKeyType getKey() {
        return this.key;
    }


    public String getErrorMessage() {
        return this.errorMessage;
    }


    public Date getExpirationDate() {
        return this.expirationDate;
    }


    public Long getLimitValue() {
        return this.limitValue;
    }

}
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
package com.spectralogic.ds3client.commands.spectrads3;

import com.spectralogic.ds3client.networking.HttpVerb;
import com.spectralogic.ds3client.commands.interfaces.AbstractRequest;
import com.google.common.net.UrlEscapers;

public class GetBlobsOnDs3TargetSpectraS3Request extends AbstractRequest {

    // Variables
    
    private final String ds3Target;

    // Constructor
    
    
    public GetBlobsOnDs3TargetSpectraS3Request(final String ds3Target) {
        this.ds3Target = ds3Target;
        
        this.getQueryParams().put("operation", "get_physical_placement");

    }


    @Override
    public HttpVerb getVerb() {
        return HttpVerb.GET;
    }

    @Override
    public String getPath() {
        return "/_rest_/ds3_target/" + ds3Target;
    }
    
    public String getDs3Target() {
        return this.ds3Target;
    }

}
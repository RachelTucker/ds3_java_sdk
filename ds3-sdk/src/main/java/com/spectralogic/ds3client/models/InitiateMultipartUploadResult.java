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
package com.spectralogic.ds3client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(namespace = "InitiateMultipartUploadResult")
public class InitiateMultipartUploadResult {

    // Variables
    @JsonProperty("Bucket")
    private String bucket;

    @JsonProperty("Key")
    private String key;

    @JsonProperty("UploadId")
    private String uploadId;

    // Constructor
    public InitiateMultipartUploadResult() {
        //pass
    }

    // Getters and Setters
    
    public String getBucket() {
        return this.bucket;
    }

    public void setBucket(final String bucket) {
        this.bucket = bucket;
    }


    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }


    public String getUploadId() {
        return this.uploadId;
    }

    public void setUploadId(final String uploadId) {
        this.uploadId = uploadId;
    }

}
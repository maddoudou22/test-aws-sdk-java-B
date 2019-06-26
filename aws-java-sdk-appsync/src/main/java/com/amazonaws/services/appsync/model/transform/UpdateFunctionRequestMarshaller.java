/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFunctionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFunctionRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> FUNCTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("functionId").build();
    private static final MarshallingInfo<String> DATASOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceName").build();
    private static final MarshallingInfo<String> REQUESTMAPPINGTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestMappingTemplate").build();
    private static final MarshallingInfo<String> RESPONSEMAPPINGTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseMappingTemplate").build();
    private static final MarshallingInfo<String> FUNCTIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionVersion").build();

    private static final UpdateFunctionRequestMarshaller instance = new UpdateFunctionRequestMarshaller();

    public static UpdateFunctionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFunctionRequest updateFunctionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFunctionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFunctionRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getFunctionId(), FUNCTIONID_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getDataSourceName(), DATASOURCENAME_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getRequestMappingTemplate(), REQUESTMAPPINGTEMPLATE_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getResponseMappingTemplate(), RESPONSEMAPPINGTEMPLATE_BINDING);
            protocolMarshaller.marshall(updateFunctionRequest.getFunctionVersion(), FUNCTIONVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

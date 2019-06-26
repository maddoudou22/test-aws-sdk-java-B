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
package com.amazonaws.services.servicediscovery.model;

import javax.annotation.Generated;

/**
 * <p>
 * One or more specified values aren't valid. For example, a required value might be missing, a numeric value might be
 * outside the allowed range, or a string value might exceed length constraints.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInputException extends com.amazonaws.services.servicediscovery.model.AWSServiceDiscoveryException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

}

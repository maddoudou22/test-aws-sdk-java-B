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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * HsmClientCertificate StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HsmClientCertificateStaxUnmarshaller implements Unmarshaller<HsmClientCertificate, StaxUnmarshallerContext> {

    public HsmClientCertificate unmarshall(StaxUnmarshallerContext context) throws Exception {
        HsmClientCertificate hsmClientCertificate = new HsmClientCertificate();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return hsmClientCertificate;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("HsmClientCertificateIdentifier", targetDepth)) {
                    hsmClientCertificate.setHsmClientCertificateIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HsmClientCertificatePublicKey", targetDepth)) {
                    hsmClientCertificate.setHsmClientCertificatePublicKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    hsmClientCertificate.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    hsmClientCertificate.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return hsmClientCertificate;
                }
            }
        }
    }

    private static HsmClientCertificateStaxUnmarshaller instance;

    public static HsmClientCertificateStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HsmClientCertificateStaxUnmarshaller();
        return instance;
    }
}
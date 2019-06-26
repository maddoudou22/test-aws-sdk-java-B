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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output of the DescribeCertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the certificate.
     * </p>
     */
    private CertificateDescription certificateDescription;

    /**
     * <p>
     * The description of the certificate.
     * </p>
     * 
     * @param certificateDescription
     *        The description of the certificate.
     */

    public void setCertificateDescription(CertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    /**
     * <p>
     * The description of the certificate.
     * </p>
     * 
     * @return The description of the certificate.
     */

    public CertificateDescription getCertificateDescription() {
        return this.certificateDescription;
    }

    /**
     * <p>
     * The description of the certificate.
     * </p>
     * 
     * @param certificateDescription
     *        The description of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateResult withCertificateDescription(CertificateDescription certificateDescription) {
        setCertificateDescription(certificateDescription);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateDescription() != null)
            sb.append("CertificateDescription: ").append(getCertificateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateResult == false)
            return false;
        DescribeCertificateResult other = (DescribeCertificateResult) obj;
        if (other.getCertificateDescription() == null ^ this.getCertificateDescription() == null)
            return false;
        if (other.getCertificateDescription() != null && other.getCertificateDescription().equals(this.getCertificateDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateDescription() == null) ? 0 : getCertificateDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateResult clone() {
        try {
            return (DescribeCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

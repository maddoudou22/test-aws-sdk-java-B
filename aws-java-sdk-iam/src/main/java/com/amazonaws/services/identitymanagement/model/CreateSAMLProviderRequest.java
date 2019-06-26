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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateSAMLProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSAMLProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>
     * </p>
     */
    private String sAMLMetadataDocument;
    /**
     * <p>
     * The name of the provider to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String name;

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>
     * </p>
     * 
     * @param sAMLMetadataDocument
     *        An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     *        issuer's name, expiration information, and keys that can be used to validate the SAML authentication
     *        response (assertions) that are received from the IdP. You must generate the metadata document using the
     *        identity management software that is used as your organization's IdP.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     *        Federation</a> in the <i>IAM User Guide</i>
     */

    public void setSAMLMetadataDocument(String sAMLMetadataDocument) {
        this.sAMLMetadataDocument = sAMLMetadataDocument;
    }

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>
     * </p>
     * 
     * @return An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     *         issuer's name, expiration information, and keys that can be used to validate the SAML authentication
     *         response (assertions) that are received from the IdP. You must generate the metadata document using the
     *         identity management software that is used as your organization's IdP.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     *         Federation</a> in the <i>IAM User Guide</i>
     */

    public String getSAMLMetadataDocument() {
        return this.sAMLMetadataDocument;
    }

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>
     * </p>
     * 
     * @param sAMLMetadataDocument
     *        An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     *        issuer's name, expiration information, and keys that can be used to validate the SAML authentication
     *        response (assertions) that are received from the IdP. You must generate the metadata document using the
     *        identity management software that is used as your organization's IdP.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     *        Federation</a> in the <i>IAM User Guide</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSAMLProviderRequest withSAMLMetadataDocument(String sAMLMetadataDocument) {
        setSAMLMetadataDocument(sAMLMetadataDocument);
        return this;
    }

    /**
     * <p>
     * The name of the provider to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param name
     *        The name of the provider to create.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provider to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the provider to create.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the provider to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param name
     *        The name of the provider to create.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSAMLProviderRequest withName(String name) {
        setName(name);
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
        if (getSAMLMetadataDocument() != null)
            sb.append("SAMLMetadataDocument: ").append(getSAMLMetadataDocument()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSAMLProviderRequest == false)
            return false;
        CreateSAMLProviderRequest other = (CreateSAMLProviderRequest) obj;
        if (other.getSAMLMetadataDocument() == null ^ this.getSAMLMetadataDocument() == null)
            return false;
        if (other.getSAMLMetadataDocument() != null && other.getSAMLMetadataDocument().equals(this.getSAMLMetadataDocument()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSAMLMetadataDocument() == null) ? 0 : getSAMLMetadataDocument().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateSAMLProviderRequest clone() {
        return (CreateSAMLProviderRequest) super.clone();
    }

}

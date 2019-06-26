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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The StackEvent data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackEvent implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID name of the instance of the stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The unique ID of this event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The name associated with a stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The name or unique identifier associated with the physical instance of the resource.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Time the status was updated.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * Current status of the resource.
     * </p>
     */
    private String resourceStatus;
    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     */
    private String resourceStatusReason;
    /**
     * <p>
     * BLOB of the properties used to create the resource.
     * </p>
     */
    private String resourceProperties;
    /**
     * <p>
     * The token passed to the operation that generated this event.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The unique ID name of the instance of the stack.
     * </p>
     * 
     * @param stackId
     *        The unique ID name of the instance of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The unique ID name of the instance of the stack.
     * </p>
     * 
     * @return The unique ID name of the instance of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The unique ID name of the instance of the stack.
     * </p>
     * 
     * @param stackId
     *        The unique ID name of the instance of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The unique ID of this event.
     * </p>
     * 
     * @param eventId
     *        The unique ID of this event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The unique ID of this event.
     * </p>
     * 
     * @return The unique ID of this event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The unique ID of this event.
     * </p>
     * 
     * @param eventId
     *        The unique ID of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The name associated with a stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with a stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with a stack.
     * </p>
     * 
     * @return The name associated with a stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name associated with a stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with a stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @return The logical name of the resource specified in the template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name or unique identifier associated with the physical instance of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier associated with the physical instance of the resource.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier associated with the physical instance of the resource.
     * </p>
     * 
     * @return The name or unique identifier associated with the physical instance of the resource.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier associated with the physical instance of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier associated with the physical instance of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param resourceType
     *        Type of resource. (For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     *        AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @return Type of resource. (For more information, go to <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     *         AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"> AWS
     * Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param resourceType
     *        Type of resource. (For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     *        AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @param timestamp
     *        Time the status was updated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @return Time the status was updated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @param timestamp
     *        Time the status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @see ResourceStatus
     */

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @return Current status of the resource.
     * @see ResourceStatus
     */

    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public StackEvent withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @see ResourceStatus
     */

    public void setResourceStatus(ResourceStatus resourceStatus) {
        withResourceStatus(resourceStatus);
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public StackEvent withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @param resourceStatusReason
     *        Success/failure message associated with the resource.
     */

    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @return Success/failure message associated with the resource.
     */

    public String getResourceStatusReason() {
        return this.resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @param resourceStatusReason
     *        Success/failure message associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withResourceStatusReason(String resourceStatusReason) {
        setResourceStatusReason(resourceStatusReason);
        return this;
    }

    /**
     * <p>
     * BLOB of the properties used to create the resource.
     * </p>
     * 
     * @param resourceProperties
     *        BLOB of the properties used to create the resource.
     */

    public void setResourceProperties(String resourceProperties) {
        this.resourceProperties = resourceProperties;
    }

    /**
     * <p>
     * BLOB of the properties used to create the resource.
     * </p>
     * 
     * @return BLOB of the properties used to create the resource.
     */

    public String getResourceProperties() {
        return this.resourceProperties;
    }

    /**
     * <p>
     * BLOB of the properties used to create the resource.
     * </p>
     * 
     * @param resourceProperties
     *        BLOB of the properties used to create the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withResourceProperties(String resourceProperties) {
        setResourceProperties(resourceProperties);
        return this;
    }

    /**
     * <p>
     * The token passed to the operation that generated this event.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        The token passed to the operation that generated this event.</p>
     *        <p>
     *        All events triggered by a given stack operation are assigned the same client request token, which you can
     *        use to track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     *        <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     *        <code>ClientRequestToken</code> set as <code>token1</code>.
     *        </p>
     *        <p>
     *        In the console, stack operations display the client request token on the Events tab. Stack operations that
     *        are initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you
     *        easily identify the stack operation . For example, if you create a stack using the console, each stack
     *        event would be assigned the same token in the following format:
     *        <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The token passed to the operation that generated this event.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * 
     * @return The token passed to the operation that generated this event.</p>
     *         <p>
     *         All events triggered by a given stack operation are assigned the same client request token, which you can
     *         use to track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     *         <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     *         <code>ClientRequestToken</code> set as <code>token1</code>.
     *         </p>
     *         <p>
     *         In the console, stack operations display the client request token on the Events tab. Stack operations
     *         that are initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps
     *         you easily identify the stack operation . For example, if you create a stack using the console, each
     *         stack event would be assigned the same token in the following format:
     *         <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The token passed to the operation that generated this event.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        The token passed to the operation that generated this event.</p>
     *        <p>
     *        All events triggered by a given stack operation are assigned the same client request token, which you can
     *        use to track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     *        <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     *        <code>ClientRequestToken</code> set as <code>token1</code>.
     *        </p>
     *        <p>
     *        In the console, stack operations display the client request token on the Events tab. Stack operations that
     *        are initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you
     *        easily identify the stack operation . For example, if you create a stack using the console, each stack
     *        event would be assigned the same token in the following format:
     *        <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackEvent withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: ").append(getResourceStatus()).append(",");
        if (getResourceStatusReason() != null)
            sb.append("ResourceStatusReason: ").append(getResourceStatusReason()).append(",");
        if (getResourceProperties() != null)
            sb.append("ResourceProperties: ").append(getResourceProperties()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackEvent == false)
            return false;
        StackEvent other = (StackEvent) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getResourceStatusReason() == null ^ this.getResourceStatusReason() == null)
            return false;
        if (other.getResourceStatusReason() != null && other.getResourceStatusReason().equals(this.getResourceStatusReason()) == false)
            return false;
        if (other.getResourceProperties() == null ^ this.getResourceProperties() == null)
            return false;
        if (other.getResourceProperties() != null && other.getResourceProperties().equals(this.getResourceProperties()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode());
        hashCode = prime * hashCode + ((getResourceProperties() == null) ? 0 : getResourceProperties().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StackEvent clone() {
        try {
            return (StackEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity MongoDB Atlas sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbAtlasSink")
@Fluent
public final class MongoDbAtlasSink extends CopySink {
    /*
     * Specifies whether the document with same key to be overwritten (upsert)
     * rather than throw exception (insert). The default value is "insert".
     * Type: string (or Expression with resultType string). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Get the writeBehavior property: Specifies whether the document with same key to be overwritten (upsert) rather
     * than throw exception (insert). The default value is "insert". Type: string (or Expression with resultType
     * string). Type: string (or Expression with resultType string).
     *
     * @return the writeBehavior value.
     */
    public Object writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Specifies whether the document with same key to be overwritten (upsert) rather
     * than throw exception (insert). The default value is "insert". Type: string (or Expression with resultType
     * string). Type: string (or Expression with resultType string).
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the MongoDbAtlasSink object itself.
     */
    public MongoDbAtlasSink withWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbAtlasSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SqlServerStoredProcedureActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** SQL stored procedure activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServerStoredProcedure")
@Fluent
public final class SqlServerStoredProcedureActivity extends ExecutionActivity {
    /*
     * SQL stored procedure activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SqlServerStoredProcedureActivityTypeProperties innerTypeProperties =
        new SqlServerStoredProcedureActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: SQL stored procedure activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private SqlServerStoredProcedureActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the storedProcedureName property: Stored procedure name. Type: string (or Expression with resultType string).
     *
     * @return the storedProcedureName value.
     */
    public Object storedProcedureName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().storedProcedureName();
    }

    /**
     * Set the storedProcedureName property: Stored procedure name. Type: string (or Expression with resultType string).
     *
     * @param storedProcedureName the storedProcedureName value to set.
     * @return the SqlServerStoredProcedureActivity object itself.
     */
    public SqlServerStoredProcedureActivity withStoredProcedureName(Object storedProcedureName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerStoredProcedureActivityTypeProperties();
        }
        this.innerTypeProperties().withStoredProcedureName(storedProcedureName);
        return this;
    }

    /**
     * Get the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     *
     * @return the storedProcedureParameters value.
     */
    public Object storedProcedureParameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().storedProcedureParameters();
    }

    /**
     * Set the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the SqlServerStoredProcedureActivity object itself.
     */
    public SqlServerStoredProcedureActivity withStoredProcedureParameters(Object storedProcedureParameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerStoredProcedureActivityTypeProperties();
        }
        this.innerTypeProperties().withStoredProcedureParameters(storedProcedureParameters);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SqlServerStoredProcedureActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlServerStoredProcedureActivity.class);
}

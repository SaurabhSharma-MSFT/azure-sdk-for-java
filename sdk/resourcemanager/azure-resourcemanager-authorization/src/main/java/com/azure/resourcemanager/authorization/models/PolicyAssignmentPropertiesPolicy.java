// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Details of the policy. */
@Fluent
public final class PolicyAssignmentPropertiesPolicy {
    /*
     * Id of the policy
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the entity last modified it
     */
    @JsonProperty(value = "lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private Principal lastModifiedBy;

    /*
     * The last modified date time.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /**
     * Get the id property: Id of the policy.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the policy.
     *
     * @param id the id value to set.
     * @return the PolicyAssignmentPropertiesPolicy object itself.
     */
    public PolicyAssignmentPropertiesPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the lastModifiedBy property: The name of the entity last modified it.
     *
     * @return the lastModifiedBy value.
     */
    public Principal lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the lastModifiedDateTime property: The last modified date time.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The last modified date time.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the PolicyAssignmentPropertiesPolicy object itself.
     */
    public PolicyAssignmentPropertiesPolicy withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (lastModifiedBy() != null) {
            lastModifiedBy().validate();
        }
    }
}

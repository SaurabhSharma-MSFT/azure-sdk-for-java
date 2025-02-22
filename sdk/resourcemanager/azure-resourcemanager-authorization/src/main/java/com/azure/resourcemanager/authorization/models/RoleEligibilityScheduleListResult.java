// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.fluent.models.RoleEligibilityScheduleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** role eligibility schedule list operation result. */
@Fluent
public final class RoleEligibilityScheduleListResult {
    /*
     * role eligibility schedule list.
     */
    @JsonProperty(value = "value")
    private List<RoleEligibilityScheduleInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: role eligibility schedule list.
     *
     * @return the value value.
     */
    public List<RoleEligibilityScheduleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: role eligibility schedule list.
     *
     * @param value the value value to set.
     * @return the RoleEligibilityScheduleListResult object itself.
     */
    public RoleEligibilityScheduleListResult withValue(List<RoleEligibilityScheduleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleEligibilityScheduleListResult object itself.
     */
    public RoleEligibilityScheduleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

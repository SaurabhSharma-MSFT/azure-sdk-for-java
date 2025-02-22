// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Sets the CORS rules. You can include up to five CorsRule elements in the request. */
@Fluent
public final class CorsRules {
    /*
     * The List of CORS rules. You can include up to five CorsRule elements in
     * the request.
     */
    @JsonProperty(value = "corsRules")
    private List<CorsRule> corsRules;

    /**
     * Get the corsRules property: The List of CORS rules. You can include up to five CorsRule elements in the request.
     *
     * @return the corsRules value.
     */
    public List<CorsRule> corsRules() {
        return this.corsRules;
    }

    /**
     * Set the corsRules property: The List of CORS rules. You can include up to five CorsRule elements in the request.
     *
     * @param corsRules the corsRules value to set.
     * @return the CorsRules object itself.
     */
    public CorsRules withCorsRules(List<CorsRule> corsRules) {
        this.corsRules = corsRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (corsRules() != null) {
            corsRules().forEach(e -> e.validate());
        }
    }
}

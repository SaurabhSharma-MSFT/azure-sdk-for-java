// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed service identity (system assigned and/or user assigned identities). */
@Fluent
public class ServiceManagedIdentity {
    /*
     * Setting indicating whether the service has a managed identity associated
     * with it.
     */
    @JsonProperty(value = "identity")
    private ServiceManagedIdentityIdentity identity;

    /**
     * Get the identity property: Setting indicating whether the service has a managed identity associated with it.
     *
     * @return the identity value.
     */
    public ServiceManagedIdentityIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Setting indicating whether the service has a managed identity associated with it.
     *
     * @param identity the identity value to set.
     * @return the ServiceManagedIdentity object itself.
     */
    public ServiceManagedIdentity withIdentity(ServiceManagedIdentityIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}

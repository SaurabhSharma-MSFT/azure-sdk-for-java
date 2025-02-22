// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Properties of the deleted configuration store. */
@Immutable
public final class DeletedConfigurationStoreProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedConfigurationStoreProperties.class);

    /*
     * The resource id of the original configuration store.
     */
    @JsonProperty(value = "configurationStoreId", access = JsonProperty.Access.WRITE_ONLY)
    private String configurationStoreId;

    /*
     * The location of the original configuration store.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The deleted date.
     */
    @JsonProperty(value = "deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionDate;

    /*
     * The scheduled purged date.
     */
    @JsonProperty(value = "scheduledPurgeDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime scheduledPurgeDate;

    /*
     * Tags of the original configuration store.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Purge protection status of the original configuration store.
     */
    @JsonProperty(value = "purgeProtectionEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean purgeProtectionEnabled;

    /**
     * Get the configurationStoreId property: The resource id of the original configuration store.
     *
     * @return the configurationStoreId value.
     */
    public String configurationStoreId() {
        return this.configurationStoreId;
    }

    /**
     * Get the location property: The location of the original configuration store.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the deletionDate property: The deleted date.
     *
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the scheduledPurgeDate property: The scheduled purged date.
     *
     * @return the scheduledPurgeDate value.
     */
    public OffsetDateTime scheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    /**
     * Get the tags property: Tags of the original configuration store.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the purgeProtectionEnabled property: Purge protection status of the original configuration store.
     *
     * @return the purgeProtectionEnabled value.
     */
    public Boolean purgeProtectionEnabled() {
        return this.purgeProtectionEnabled;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

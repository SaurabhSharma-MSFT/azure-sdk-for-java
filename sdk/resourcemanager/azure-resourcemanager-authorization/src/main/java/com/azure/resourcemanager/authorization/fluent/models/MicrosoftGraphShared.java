// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** shared. */
@Fluent
public final class MicrosoftGraphShared {
    /*
     * identitySet
     */
    @JsonProperty(value = "owner")
    private MicrosoftGraphIdentitySet owner;

    /*
     * Indicates the scope of how the item is shared: anonymous, organization,
     * or users. Read-only.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * identitySet
     */
    @JsonProperty(value = "sharedBy")
    private MicrosoftGraphIdentitySet sharedBy;

    /*
     * The UTC date and time when the item was shared. Read-only.
     */
    @JsonProperty(value = "sharedDateTime")
    private OffsetDateTime sharedDateTime;

    /*
     * shared
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the owner property: identitySet.
     *
     * @return the owner value.
     */
    public MicrosoftGraphIdentitySet owner() {
        return this.owner;
    }

    /**
     * Set the owner property: identitySet.
     *
     * @param owner the owner value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withOwner(MicrosoftGraphIdentitySet owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the scope property: Indicates the scope of how the item is shared: anonymous, organization, or users.
     * Read-only.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Indicates the scope of how the item is shared: anonymous, organization, or users.
     * Read-only.
     *
     * @param scope the scope value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the sharedBy property: identitySet.
     *
     * @return the sharedBy value.
     */
    public MicrosoftGraphIdentitySet sharedBy() {
        return this.sharedBy;
    }

    /**
     * Set the sharedBy property: identitySet.
     *
     * @param sharedBy the sharedBy value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withSharedBy(MicrosoftGraphIdentitySet sharedBy) {
        this.sharedBy = sharedBy;
        return this;
    }

    /**
     * Get the sharedDateTime property: The UTC date and time when the item was shared. Read-only.
     *
     * @return the sharedDateTime value.
     */
    public OffsetDateTime sharedDateTime() {
        return this.sharedDateTime;
    }

    /**
     * Set the sharedDateTime property: The UTC date and time when the item was shared. Read-only.
     *
     * @param sharedDateTime the sharedDateTime value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withSharedDateTime(OffsetDateTime sharedDateTime) {
        this.sharedDateTime = sharedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: shared.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: shared.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (owner() != null) {
            owner().validate();
        }
        if (sharedBy() != null) {
            sharedBy().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.privatedns.models.ProvisioningState;
import com.azure.resourcemanager.privatedns.models.VirtualNetworkLinkState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the properties of the Private DNS zone. */
@Fluent
public final class VirtualNetworkLinkProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkLinkProperties.class);

    /*
     * The reference of the virtual network.
     */
    @JsonProperty(value = "virtualNetwork")
    private SubResource virtualNetwork;

    /*
     * Is auto-registration of virtual machine records in the virtual network
     * in the Private DNS zone enabled?
     */
    @JsonProperty(value = "registrationEnabled")
    private Boolean registrationEnabled;

    /*
     * The status of the virtual network link to the Private DNS zone. Possible
     * values are 'InProgress' and 'Done'. This is a read-only property and any
     * attempt to set this value will be ignored.
     */
    @JsonProperty(value = "virtualNetworkLinkState", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkLinkState virtualNetworkLinkState;

    /*
     * The provisioning state of the resource. This is a read-only property and
     * any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the virtualNetwork property: The reference of the virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: The reference of the virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the VirtualNetworkLinkProperties object itself.
     */
    public VirtualNetworkLinkProperties withVirtualNetwork(SubResource virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the registrationEnabled property: Is auto-registration of virtual machine records in the virtual network in
     * the Private DNS zone enabled?.
     *
     * @return the registrationEnabled value.
     */
    public Boolean registrationEnabled() {
        return this.registrationEnabled;
    }

    /**
     * Set the registrationEnabled property: Is auto-registration of virtual machine records in the virtual network in
     * the Private DNS zone enabled?.
     *
     * @param registrationEnabled the registrationEnabled value to set.
     * @return the VirtualNetworkLinkProperties object itself.
     */
    public VirtualNetworkLinkProperties withRegistrationEnabled(Boolean registrationEnabled) {
        this.registrationEnabled = registrationEnabled;
        return this;
    }

    /**
     * Get the virtualNetworkLinkState property: The status of the virtual network link to the Private DNS zone.
     * Possible values are 'InProgress' and 'Done'. This is a read-only property and any attempt to set this value will
     * be ignored.
     *
     * @return the virtualNetworkLinkState value.
     */
    public VirtualNetworkLinkState virtualNetworkLinkState() {
        return this.virtualNetworkLinkState;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. This is a read-only property and any
     * attempt to set this value will be ignored.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

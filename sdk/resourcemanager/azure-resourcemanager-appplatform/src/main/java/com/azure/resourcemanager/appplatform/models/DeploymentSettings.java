// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Deployment settings payload. */
@Fluent
public final class DeploymentSettings {
    /*
     * The requested resource quantity for required CPU and Memory. It is
     * recommended that using this field to represent the required CPU and
     * Memory, the old field cpu and memoryInGB will be deprecated later.
     */
    @JsonProperty(value = "resourceRequests")
    private ResourceRequests resourceRequests;

    /*
     * Collection of environment variables
     */
    @JsonProperty(value = "environmentVariables")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> environmentVariables;

    /*
     * Collection of addons
     */
    @JsonProperty(value = "addonConfigs")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Map<String, Object>> addonConfigs;

    /*
     * Container liveness and readiness probe settings
     */
    @JsonProperty(value = "containerProbeSettings")
    private ContainerProbeSettings containerProbeSettings;

    /**
     * Get the resourceRequests property: The requested resource quantity for required CPU and Memory. It is recommended
     * that using this field to represent the required CPU and Memory, the old field cpu and memoryInGB will be
     * deprecated later.
     *
     * @return the resourceRequests value.
     */
    public ResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Set the resourceRequests property: The requested resource quantity for required CPU and Memory. It is recommended
     * that using this field to represent the required CPU and Memory, the old field cpu and memoryInGB will be
     * deprecated later.
     *
     * @param resourceRequests the resourceRequests value to set.
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withResourceRequests(ResourceRequests resourceRequests) {
        this.resourceRequests = resourceRequests;
        return this;
    }

    /**
     * Get the environmentVariables property: Collection of environment variables.
     *
     * @return the environmentVariables value.
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Collection of environment variables.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the addonConfigs property: Collection of addons.
     *
     * @return the addonConfigs value.
     */
    public Map<String, Map<String, Object>> addonConfigs() {
        return this.addonConfigs;
    }

    /**
     * Set the addonConfigs property: Collection of addons.
     *
     * @param addonConfigs the addonConfigs value to set.
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withAddonConfigs(Map<String, Map<String, Object>> addonConfigs) {
        this.addonConfigs = addonConfigs;
        return this;
    }

    /**
     * Get the containerProbeSettings property: Container liveness and readiness probe settings.
     *
     * @return the containerProbeSettings value.
     */
    public ContainerProbeSettings containerProbeSettings() {
        return this.containerProbeSettings;
    }

    /**
     * Set the containerProbeSettings property: Container liveness and readiness probe settings.
     *
     * @param containerProbeSettings the containerProbeSettings value to set.
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withContainerProbeSettings(ContainerProbeSettings containerProbeSettings) {
        this.containerProbeSettings = containerProbeSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
        if (containerProbeSettings() != null) {
            containerProbeSettings().validate();
        }
    }
}

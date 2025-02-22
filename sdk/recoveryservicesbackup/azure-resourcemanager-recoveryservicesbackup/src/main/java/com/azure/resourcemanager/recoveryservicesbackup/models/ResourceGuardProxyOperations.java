// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceGuardProxyOperations. */
public interface ResourceGuardProxyOperations {
    /**
     * Returns ResourceGuardProxy under vault and with the name referenced in request.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ResourceGuardProxyBaseResource get(String vaultName, String resourceGroupName, String resourceGuardProxyName);

    /**
     * Returns ResourceGuardProxy under vault and with the name referenced in request.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ResourceGuardProxyBaseResource> getWithResponse(
        String vaultName, String resourceGroupName, String resourceGuardProxyName, Context context);

    /**
     * Add or Update ResourceGuardProxy under vault Secures vault critical operations.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ResourceGuardProxyBaseResource put(String vaultName, String resourceGroupName, String resourceGuardProxyName);

    /**
     * Add or Update ResourceGuardProxy under vault Secures vault critical operations.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ResourceGuardProxyBaseResource> putWithResponse(
        String vaultName, String resourceGroupName, String resourceGuardProxyName, Context context);

    /**
     * Delete ResourceGuardProxy under vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String vaultName, String resourceGroupName, String resourceGuardProxyName);

    /**
     * Delete ResourceGuardProxy under vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String vaultName, String resourceGroupName, String resourceGuardProxyName, Context context);

    /**
     * Secures delete ResourceGuardProxy operations.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of Unlock Delete API.
     */
    UnlockDeleteResponse unlockDelete(
        String vaultName, String resourceGroupName, String resourceGuardProxyName, UnlockDeleteRequest parameters);

    /**
     * Secures delete ResourceGuardProxy operations.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceGuardProxyName The resourceGuardProxyName parameter.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of Unlock Delete API along with {@link Response}.
     */
    Response<UnlockDeleteResponse> unlockDeleteWithResponse(
        String vaultName,
        String resourceGroupName,
        String resourceGuardProxyName,
        UnlockDeleteRequest parameters,
        Context context);
}

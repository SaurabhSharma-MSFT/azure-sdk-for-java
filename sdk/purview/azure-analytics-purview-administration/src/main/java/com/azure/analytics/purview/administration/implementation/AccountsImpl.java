// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Accounts. */
public final class AccountsImpl {
    /** The proxy service used to perform REST calls. */
    private final AccountsService service;

    /** The service client containing this operation class. */
    private final PurviewAccountClientImpl client;

    /**
     * Initializes an instance of AccountsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AccountsImpl(PurviewAccountClientImpl client) {
        this.service = RestProxy.create(AccountsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewAccountClientAccounts to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "PurviewAccountClient")
    private interface AccountsService {
        @Get("/")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> getAccountProperties(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Patch("/")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> updateAccountProperties(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData accountUpdateParameters,
                RequestOptions requestOptions,
                Context context);

        @Post("/listkeys")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> getAccessKeys(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Post("/regeneratekeys")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> regenerateAccessKey(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData keyOptions,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return an account along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getAccountPropertiesWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.getAccountProperties(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * Get an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return an account along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getAccountPropertiesWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.getAccountProperties(
                this.client.getEndpoint(), this.client.getServiceVersion().getVersion(), requestOptions, context);
    }

    /**
     * Get an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return an account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAccountPropertiesWithResponse(RequestOptions requestOptions) {
        return getAccountPropertiesWithResponseAsync(requestOptions).block();
    }

    /**
     * Updates an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     friendlyName: String
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param accountUpdateParameters The account properties that can be updated through data plane.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return account resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateAccountPropertiesWithResponseAsync(
            BinaryData accountUpdateParameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.updateAccountProperties(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                accountUpdateParameters,
                                requestOptions,
                                context));
    }

    /**
     * Updates an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     friendlyName: String
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param accountUpdateParameters The account properties that can be updated through data plane.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return account resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateAccountPropertiesWithResponseAsync(
            BinaryData accountUpdateParameters, RequestOptions requestOptions, Context context) {
        return service.updateAccountProperties(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                accountUpdateParameters,
                requestOptions,
                context);
    }

    /**
     * Updates an account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     friendlyName: String
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned)
     *     }
     *     location: String
     *     name: String
     *     properties: {
     *         cloudConnectors: {
     *             awsExternalId: String
     *         }
     *         createdAt: String
     *         createdBy: String
     *         createdByObjectId: String
     *         endpoints: {
     *             catalog: String
     *             guardian: String
     *             scan: String
     *         }
     *         friendlyName: String
     *         managedResourceGroupName: String
     *         managedResources: {
     *             eventHubNamespace: String
     *             resourceGroup: String
     *             storageAccount: String
     *         }
     *         privateEndpointConnections: [
     *             {
     *                 id: String
     *                 name: String
     *                 properties: {
     *                     privateEndpoint: {
     *                         id: String
     *                     }
     *                     privateLinkServiceConnectionState: {
     *                         actionsRequired: String
     *                         description: String
     *                         status: String(Unknown/Pending/Approved/Rejected/Disconnected)
     *                     }
     *                     provisioningState: String
     *                 }
     *                 type: String
     *             }
     *         ]
     *         provisioningState: String(Unknown/Creating/Moving/Deleting/SoftDeleting/SoftDeleted/Failed/Succeeded/Canceled)
     *         publicNetworkAccess: String(NotSpecified/Enabled/Disabled)
     *     }
     *     sku: {
     *         capacity: Integer
     *         name: String(Standard)
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     *     tags: {
     *         String: String
     *     }
     *     type: String
     * }
     * }</pre>
     *
     * @param accountUpdateParameters The account properties that can be updated through data plane.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return account resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateAccountPropertiesWithResponse(
            BinaryData accountUpdateParameters, RequestOptions requestOptions) {
        return updateAccountPropertiesWithResponseAsync(accountUpdateParameters, requestOptions).block();
    }

    /**
     * List the authorization keys associated with this account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getAccessKeysWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.getAccessKeys(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * List the authorization keys associated with this account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getAccessKeysWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getAccessKeys(
                this.client.getEndpoint(), this.client.getServiceVersion().getVersion(), requestOptions, context);
    }

    /**
     * List the authorization keys associated with this account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getAccessKeysWithResponse(RequestOptions requestOptions) {
        return getAccessKeysWithResponseAsync(requestOptions).block();
    }

    /**
     * Regenerate the authorization keys associated with this data catalog.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keyType: String(PrimaryAtlasKafkaKey/SecondaryAtlasKafkaKey)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param keyOptions A access key options used for regeneration.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> regenerateAccessKeyWithResponseAsync(
            BinaryData keyOptions, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.regenerateAccessKey(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                keyOptions,
                                requestOptions,
                                context));
    }

    /**
     * Regenerate the authorization keys associated with this data catalog.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keyType: String(PrimaryAtlasKafkaKey/SecondaryAtlasKafkaKey)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param keyOptions A access key options used for regeneration.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> regenerateAccessKeyWithResponseAsync(
            BinaryData keyOptions, RequestOptions requestOptions, Context context) {
        return service.regenerateAccessKey(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                keyOptions,
                requestOptions,
                context);
    }

    /**
     * Regenerate the authorization keys associated with this data catalog.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keyType: String(PrimaryAtlasKafkaKey/SecondaryAtlasKafkaKey)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     atlasKafkaPrimaryEndpoint: String
     *     atlasKafkaSecondaryEndpoint: String
     * }
     * }</pre>
     *
     * @param keyOptions A access key options used for regeneration.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the Account access keys along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> regenerateAccessKeyWithResponse(BinaryData keyOptions, RequestOptions requestOptions) {
        return regenerateAccessKeyWithResponseAsync(keyOptions, requestOptions).block();
    }
}

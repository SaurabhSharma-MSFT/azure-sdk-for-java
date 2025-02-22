// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appconfiguration.fluent.OperationsClient;
import com.azure.resourcemanager.appconfiguration.fluent.models.NameAvailabilityStatusInner;
import com.azure.resourcemanager.appconfiguration.fluent.models.OperationDefinitionInner;
import com.azure.resourcemanager.appconfiguration.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.appconfiguration.models.NameAvailabilityStatus;
import com.azure.resourcemanager.appconfiguration.models.OperationDefinition;
import com.azure.resourcemanager.appconfiguration.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NameAvailabilityStatus checkNameAvailability(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        NameAvailabilityStatusInner inner = this.serviceClient().checkNameAvailability(checkNameAvailabilityParameters);
        if (inner != null) {
            return new NameAvailabilityStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailabilityStatus> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        Response<NameAvailabilityStatusInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(checkNameAvailabilityParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<OperationDefinition> list() {
        PagedIterable<OperationDefinitionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationDefinition> list(String skipToken, Context context) {
        PagedIterable<OperationDefinitionInner> inner = this.serviceClient().list(skipToken, context);
        return Utils.mapPage(inner, inner1 -> new OperationDefinitionImpl(inner1, this.manager()));
    }

    public NameAvailabilityStatus regionalCheckNameAvailability(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        NameAvailabilityStatusInner inner =
            this.serviceClient().regionalCheckNameAvailability(location, checkNameAvailabilityParameters);
        if (inner != null) {
            return new NameAvailabilityStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailabilityStatus> regionalCheckNameAvailabilityWithResponse(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        Response<NameAvailabilityStatusInner> inner =
            this
                .serviceClient()
                .regionalCheckNameAvailabilityWithResponse(location, checkNameAvailabilityParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager() {
        return this.serviceManager;
    }
}

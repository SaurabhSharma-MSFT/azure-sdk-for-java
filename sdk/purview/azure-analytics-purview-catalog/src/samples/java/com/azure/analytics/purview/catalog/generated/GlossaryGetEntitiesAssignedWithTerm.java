// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryGetEntitiesAssignedWithTerm {
    public static void main(String[] args) {
        // BEGIN:
        // com.azure.analytics.purview.catalog.generated.glossarygetentitiesassignedwithterm.glossarygetentitiesassignedwithterm
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "-1");
        requestOptions.addQueryParam("offset", "0");
        requestOptions.addQueryParam("sort", "ASC");
        Response<BinaryData> response =
                glossaryClient.getEntitiesAssignedWithTermWithResponse(
                        "daf0ba4d-bc9a-4536-8a88-4b58e39dd3d4", requestOptions);
        // END:
        // com.azure.analytics.purview.catalog.generated.glossarygetentitiesassignedwithterm.glossarygetentitiesassignedwithterm
    }
}

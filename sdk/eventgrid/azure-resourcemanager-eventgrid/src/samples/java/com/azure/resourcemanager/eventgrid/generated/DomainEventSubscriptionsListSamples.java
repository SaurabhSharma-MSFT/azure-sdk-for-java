// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for DomainEventSubscriptions List. */
public final class DomainEventSubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/DomainEventSubscriptions_List.json
     */
    /**
     * Sample code: DomainEventSubscriptions_List.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void domainEventSubscriptionsList(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.domainEventSubscriptions().list("examplerg", "exampleDomain1", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleEligibilityScheduleInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleEligibilitySchedulesClient. */
public interface RoleEligibilitySchedulesClient {
    /**
     * Get the specified role eligibility schedule for a resource scope.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param roleEligibilityScheduleName The name (guid) of the role eligibility schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule for a resource scope along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleEligibilityScheduleInner>> getWithResponseAsync(String scope, String roleEligibilityScheduleName);

    /**
     * Get the specified role eligibility schedule for a resource scope.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param roleEligibilityScheduleName The name (guid) of the role eligibility schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule for a resource scope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleEligibilityScheduleInner> getAsync(String scope, String roleEligibilityScheduleName);

    /**
     * Get the specified role eligibility schedule for a resource scope.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param roleEligibilityScheduleName The name (guid) of the role eligibility schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule for a resource scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleEligibilityScheduleInner get(String scope, String roleEligibilityScheduleName);

    /**
     * Get the specified role eligibility schedule for a resource scope.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param roleEligibilityScheduleName The name (guid) of the role eligibility schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule for a resource scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleEligibilityScheduleInner> getWithResponse(
        String scope, String roleEligibilityScheduleName, Context context);

    /**
     * Gets role eligibility schedules for a resource scope.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role eligibility
     *     schedules at or above the scope. Use $filter=principalId eq {id} to return all role eligibility schedules at,
     *     above or below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleEligibilityScheduleInner> listForScopeAsync(String scope, String filter);

    /**
     * Gets role eligibility schedules for a resource scope.
     *
     * @param scope The scope of the role eligibility schedules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleEligibilityScheduleInner> listForScopeAsync(String scope);

    /**
     * Gets role eligibility schedules for a resource scope.
     *
     * @param scope The scope of the role eligibility schedules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedules for a resource scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleEligibilityScheduleInner> listForScope(String scope);

    /**
     * Gets role eligibility schedules for a resource scope.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role eligibility
     *     schedules at or above the scope. Use $filter=principalId eq {id} to return all role eligibility schedules at,
     *     above or below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedules for a resource scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleEligibilityScheduleInner> listForScope(String scope, String filter, Context context);
}

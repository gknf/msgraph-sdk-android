// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Iso_Ceiling Request Builder.
 */
public class BaseWorkbookFunctionsIso_CeilingRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIso_Ceiling
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsIso_CeilingRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsIso_CeilingRequest
     *
     * @return The IWorkbookFunctionsIso_CeilingRequest instance
     */
    public IWorkbookFunctionsIso_CeilingRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIso_CeilingRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsIso_CeilingRequest instance
     */
    public IWorkbookFunctionsIso_CeilingRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsIso_CeilingRequest request = new WorkbookFunctionsIso_CeilingRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.mBody.significance = getParameter("significance");
        }

        return request;
    }
}

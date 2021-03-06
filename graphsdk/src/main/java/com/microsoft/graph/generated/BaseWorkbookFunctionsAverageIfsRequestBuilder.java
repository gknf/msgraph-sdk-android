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
 * The class for the Base Workbook Functions Average Ifs Request Builder.
 */
public class BaseWorkbookFunctionsAverageIfsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAverageIfs
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsAverageIfsRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement averageRange, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("averageRange", averageRange);
        mBodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfsRequest
     *
     * @return The IWorkbookFunctionsAverageIfsRequest instance
     */
    public IWorkbookFunctionsAverageIfsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsAverageIfsRequest instance
     */
    public IWorkbookFunctionsAverageIfsRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsAverageIfsRequest request = new WorkbookFunctionsAverageIfsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("averageRange")) {
            request.mBody.averageRange = getParameter("averageRange");
        }

        if (hasParameter("values")) {
            request.mBody.values = getParameter("values");
        }

        return request;
    }
}

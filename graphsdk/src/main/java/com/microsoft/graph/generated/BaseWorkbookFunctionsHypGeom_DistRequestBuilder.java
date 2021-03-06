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
 * The class for the Base Workbook Functions Hyp Geom_Dist Request Builder.
 */
public class BaseWorkbookFunctionsHypGeom_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHypGeom_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsHypGeom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement sampleS, final com.google.gson.JsonElement numberSample, final com.google.gson.JsonElement populationS, final com.google.gson.JsonElement numberPop, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("sampleS", sampleS);
        mBodyParams.put("numberSample", numberSample);
        mBodyParams.put("populationS", populationS);
        mBodyParams.put("numberPop", numberPop);
        mBodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsHypGeom_DistRequest
     *
     * @return The IWorkbookFunctionsHypGeom_DistRequest instance
     */
    public IWorkbookFunctionsHypGeom_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHypGeom_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsHypGeom_DistRequest instance
     */
    public IWorkbookFunctionsHypGeom_DistRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsHypGeom_DistRequest request = new WorkbookFunctionsHypGeom_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sampleS")) {
            request.mBody.sampleS = getParameter("sampleS");
        }

        if (hasParameter("numberSample")) {
            request.mBody.numberSample = getParameter("numberSample");
        }

        if (hasParameter("populationS")) {
            request.mBody.populationS = getParameter("populationS");
        }

        if (hasParameter("numberPop")) {
            request.mBody.numberPop = getParameter("numberPop");
        }

        if (hasParameter("cumulative")) {
            request.mBody.cumulative = getParameter("cumulative");
        }

        return request;
    }
}

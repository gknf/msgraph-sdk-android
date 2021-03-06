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
 * The class for the Base Workbook Functions Hex2Dec Request Builder.
 */
public class BaseWorkbookFunctionsHex2DecRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHex2Dec
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsHex2DecRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsHex2DecRequest
     *
     * @return The IWorkbookFunctionsHex2DecRequest instance
     */
    public IWorkbookFunctionsHex2DecRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHex2DecRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsHex2DecRequest instance
     */
    public IWorkbookFunctionsHex2DecRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsHex2DecRequest request = new WorkbookFunctionsHex2DecRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        return request;
    }
}

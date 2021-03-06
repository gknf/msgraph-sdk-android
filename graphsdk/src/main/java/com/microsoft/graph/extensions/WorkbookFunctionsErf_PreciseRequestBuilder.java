// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Erf_Precise Request Builder.
 */
public class WorkbookFunctionsErf_PreciseRequestBuilder extends BaseWorkbookFunctionsErf_PreciseRequestBuilder implements IWorkbookFunctionsErf_PreciseRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsErf_Precise
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsErf_PreciseRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement x) {
        super(requestUrl, client, requestOptions, x);
    }
}

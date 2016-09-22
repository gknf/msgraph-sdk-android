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
 * The interface for the Base Shared Drive Item Request Builder.
 */
public interface IBaseSharedDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    ISharedDriveItemRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    ISharedDriveItemRequest buildRequest(final List<Option> requestOptions);

    /**
     * Gets the request builder for DriveItem.
     */
    IDriveItemRequestBuilder getRoot();

    IDriveItemCollectionRequestBuilder getItems();

    IDriveItemRequestBuilder getItems(final String id);

}
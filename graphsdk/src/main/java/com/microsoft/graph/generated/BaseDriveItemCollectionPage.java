// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Collection Page.
 */
public class BaseDriveItemCollectionPage extends BaseCollectionPage<DriveItem, IDriveItemCollectionRequestBuilder> implements IBaseDriveItemCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized BaseDriveItemCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseDriveItemCollectionPage(final BaseDriveItemCollectionResponse response, final IDriveItemCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

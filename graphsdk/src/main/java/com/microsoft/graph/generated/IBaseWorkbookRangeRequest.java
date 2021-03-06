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
 * The interface for the Base Workbook Range Request.
 */
public interface IBaseWorkbookRangeRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRange from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookRange> callback);

    /**
     * Gets the WorkbookRange from the service
     * @return The WorkbookRange from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRange get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookRange with a source
     * @param sourceWorkbookRange The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookRange sourceWorkbookRange, final ICallback<WorkbookRange> callback);

    /**
     * Patches this WorkbookRange with a source
     * @param sourceWorkbookRange The source object with updates
     * @return The updated WorkbookRange
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRange patch(final WorkbookRange sourceWorkbookRange) throws ClientException;

    /**
     * Posts a WorkbookRange with a new object
     * @param newWorkbookRange The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookRange newWorkbookRange, final ICallback<WorkbookRange> callback);

    /**
     * Posts a WorkbookRange with a new object
     * @param newWorkbookRange The new object to create
     * @return The created WorkbookRange
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRange post(final WorkbookRange newWorkbookRange) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookRangeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookRangeRequest expand(final String value);

}

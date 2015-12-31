package com.microsoft.bingads;

import com.microsoft.bingads.bulk.BulkServiceManager;

/**
 * The abstract base class for all authentication classes.
 *
 * @see ServiceClient
 * @see AuthorizationData
 * @see BulkServiceManager
 */
public abstract class Authentication {

    /**
     * Adds headers for HTTP operations such as calling the API or uploading a file.
     * @param headersImplementation Implementation that should be called to add headers.
     */
    public abstract void addHeaders(HeadersImpl headersImplementation);
}

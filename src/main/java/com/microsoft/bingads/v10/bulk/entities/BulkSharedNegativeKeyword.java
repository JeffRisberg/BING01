package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents a negative keyword that is shared in a negative keyword list.
 *
 * Each shared negative keyword can be read or written in a bulk file.
 * This class exposes the {@link BulkNegativeKeyword#setNegativeKeyword} and
 * {@link BulkNegativeKeyword#getNegativeKeyword} methods
 * that can be used to read and write fields of the Shared Negative Keyword record in a bulk file.
 *
 * <p>
 *     For more information, see Shared Negative Keyword at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620238">http://go.microsoft.com/fwlink/?LinkID=620238</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSharedNegativeKeyword extends BulkNegativeKeyword {

    /**
     * Gets the identifier of the negative keyword list through which the negative keyword is shared.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public long getNegativeKeywordListId() {
        return this.getParentId();
    }

    /**
     * Sets the identifier of the negative keyword list through which the negative keyword is shared.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setNegativeKeywordListId(long negativeKeywordListId) {
        this.setParentId(negativeKeywordListId);
    }
}

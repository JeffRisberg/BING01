/**
 * 
 */
package com.microsoft.bingads.reporting;

/**
 * Reporting Exception IF Download Could Not Be Completed.
 *
 */
public class ReportingOperationCouldNotBeCompletedException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ReportRequestStatusType status;

    public ReportingOperationCouldNotBeCompletedException(ReportRequestStatusType status) {
        this.status = status;
    }

    public ReportingOperationCouldNotBeCompletedException(ReportRequestStatusType status, String message) {
        super(message);
        this.status = status;
    }

    public ReportRequestStatusType getStatus() {
        return status;
    }
}

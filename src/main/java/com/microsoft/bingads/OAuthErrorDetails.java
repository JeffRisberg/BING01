package com.microsoft.bingads;

/**
 * Represents details of an error returned from the Microsoft Account authorization server.
 */
public class OAuthErrorDetails {
    
    private final String error;
    
    private final String description;

    /**
     * Creates a new instance of this class with the specified error code and description.
     *
     * @param error error code
     * @param description error description
     */
    public OAuthErrorDetails(String error, String description) {
        this.error = error;

        this.description = description;
    }
    
    /**
     * Gets the error code of the OAuth error.
     */
    public String getError() {
        return error;
    }        
    
    /**
     * Gets the description of the OAuth error.
     */
    public String getDescription() {
        return description;
    }
}

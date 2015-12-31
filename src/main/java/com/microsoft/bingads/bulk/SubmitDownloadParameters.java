package com.microsoft.bingads.bulk;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * Describes the service request parameters such as the type of entities and data scope that you want to download.
 */
public class SubmitDownloadParameters {

    private Collection<DataScope> dataScope;

    private Collection<BulkDownloadEntity> entities;

    private DownloadFileType fileType;

    private List<Long> campaignIds;

    private Calendar lastSyncTimeInUTC;

    private PerformanceStatsDateRange performanceStatsDateRange;

    private String locationTargetVersion;

    /**
     * Gets the scope or types of data to download. For possible values, see
     * DataScope Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=511670">http://go.microsoft.com/fwlink/?LinkId=511670</a>
     */
    public Collection<DataScope> getDataScope() {
        return dataScope;
    }
    
    public void setDataScope(Collection<DataScope> value) {
        dataScope = value;
    }

    /**
     * Gets the type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=511671>http://go.microsoft.com/fwlink/?LinkId=511671</a>
     */
    public Collection<BulkDownloadEntity> getEntities() {
        return entities;
    }

    /**
     * Sets the type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=511671">http://go.microsoft.com/fwlink/?LinkId=511671</a>
     */
    public void setEntities(Collection<BulkDownloadEntity> value) {
        entities = value;
    }

    /**
     * Gets the campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     */
    public List<Long> getCampaignIds() {
        return this.campaignIds;
    }

    /**
     * Sets the campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     */
    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Gets the extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=511672">http://go.microsoft.com/fwlink/?LinkId=511672</a>
     */
    public DownloadFileType getFileType() {
        return fileType;
    }

    /**
     * Sets the extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=511672">http://go.microsoft.com/fwlink/?LinkId=511672</a>
     */
    public void setFileType(DownloadFileType fileType) {
        this.fileType = fileType;
    }

    /**
     * Gets the last time that you requested a download. The date and time is
     * expressed in Coordinated Universal Time (UTC). Typically, you request a
     * full download the first time you call the operation by setting this
     * element to null. On all subsequent calls you set the last sync time to
     * the time stamp of the previous download. The download file contains the
     * time stamp of the download in the SyncTime column of the Account record.
     * Use the time stamp to set LastSyncTimeInUTC the next time that you
     * request a download. If you specify the last sync time, only those
     * entities that have changed (been updated or deleted) since the specified
     * date and time will be downloaded. However, if the campaign data has not
     * been previously downloaded, the operation performs a full download.     
     */
    public Calendar getLastSyncTimeInUTC() {
        return lastSyncTimeInUTC;
    }

    /**
     * Sets the last time that you requested a download. The date and time is
     * expressed in Coordinated Universal Time (UTC). Typically, you request a
     * full download the first time you call the operation by setting this
     * element to null. On all subsequent calls you set the last sync time to
     * the time stamp of the previous download. The download file contains the
     * time stamp of the download in the SyncTime column of the Account record.
     * Use the time stamp to set LastSyncTimeInUTC the next time that you
     * request a download. If you specify the last sync time, only those
     * entities that have changed (been updated or deleted) since the specified
     * date and time will be downloaded. However, if the campaign data has not
     * been previously downloaded, the operation performs a full download.
     */
    public void setLastSyncTimeInUTC(Calendar lastSyncTimeInUTC) {
        this.lastSyncTimeInUTC = lastSyncTimeInUTC;
    }

    /**
     * Gets the date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at <a href="http://go.microsoft.com/fwlink/?LinkId=511673">http://go.microsoft.com/fwlink/?LinkId=511673</a>
     */
    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }

    /**
     * Sets the date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at <a href="http://go.microsoft.com/fwlink/?LinkId=511673">http://go.microsoft.com/fwlink/?LinkId=511673</a>
     */
    public void setPerformanceStatsDateRange(
            PerformanceStatsDateRange performanceStatsDateRange) {
        this.performanceStatsDateRange = performanceStatsDateRange;
    }

    /**
     * Gets the location target version.
     */
    public String getLocationTargetVersion() {
        return locationTargetVersion;
    }

    /**
     * Sets the location target version.
     */
    public void setLocationTargetVersion(String locationTargetVersion) {
        this.locationTargetVersion = locationTargetVersion;
    }
}

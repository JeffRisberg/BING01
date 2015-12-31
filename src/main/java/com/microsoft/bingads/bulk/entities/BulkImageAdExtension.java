package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.campaignmanagement.ImageAdExtension;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an image ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Image Ad Extension record in a
 * bulk file.
 *
 * For more information, see Image Ad Extension at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=511909">http://go.microsoft.com/fwlink/?LinkID=511909</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkImageAdExtension extends BulkAdExtension<ImageAdExtension> {

    /**
     * Gets the image ad extension.
     */
    public ImageAdExtension getImageAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the image ad extension.
     */
    public void setImageAdExtension(ImageAdExtension imageAdExtension) {
        setAdExtension(imageAdExtension);
    }

    private static final List<BulkMapping<BulkImageAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkImageAdExtension>> m = new ArrayList<BulkMapping<BulkImageAdExtension>>();

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.DestinationUrl,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getImageAdExtension().getDestinationUrl());
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.AltText,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return c.getImageAdExtension().getAlternativeText();
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setAlternativeText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkImageAdExtension, Long>(StringTable.MediaId,
                new Function<BulkImageAdExtension, Long>() {
                    @Override
                    public Long apply(BulkImageAdExtension c) {
                        return c.getImageAdExtension().getImageMediaId();
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setImageMediaId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        ImageAdExtension extension = new ImageAdExtension();

        extension.setType("ImageAdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getImageAdExtension(), "ImageAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}

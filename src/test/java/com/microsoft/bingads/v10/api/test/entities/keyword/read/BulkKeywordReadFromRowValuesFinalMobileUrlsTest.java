package com.microsoft.bingads.v10.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v10.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v10.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v10.api.test.entities.keyword.BulkKeywordTest;

public class BulkKeywordReadFromRowValuesFinalMobileUrlsTest extends BulkKeywordTest{

	@Parameter(value = 1)
	public ArrayOfstring expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
		
		return Arrays.asList(new Object[][] {
			{"", null},
			{"http://www.test 1.com; https://www.test2.com", array},
		});
	}
	
	@Test
	public void testRead() {
		this.<ArrayOfstring>testReadProperty("Mobile Final Url", this.datum, this.expectedResult, new Function<BulkKeyword, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkKeyword c) {
				return c.getKeyword().getFinalMobileUrls();
			}
		}, new Supplier<BulkKeyword>() {
            @Override
            public BulkKeyword get() {
                return new BulkKeyword();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}

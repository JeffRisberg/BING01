package com.microsoft.bingads.v10.api.test.entities.campaign.read;

import com.microsoft.bingads.v10.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkCampaignReadFromRowValuesBudgetTypeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public BudgetLimitType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"MonthlyBudgetSpendUntilDepleted", BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED},
            {"DailyBudgetAccelerated", BudgetLimitType.DAILY_BUDGET_ACCELERATED},
            {"DailyBudgetStandard", BudgetLimitType.DAILY_BUDGET_STANDARD},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<BudgetLimitType>testReadProperty("Budget Type", this.datum, this.expectedResult, new Function<BulkCampaign, BudgetLimitType>() {
            @Override
            public BudgetLimitType apply(BulkCampaign c) {
                return c.getCampaign().getBudgetType();
            }
        });
    }
}

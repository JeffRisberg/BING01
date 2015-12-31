
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<CampaignCriterionType>>
{


    public Collection<CampaignCriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.CampaignCriterionTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignCriterionType> value) {
        return (com.microsoft.bingads.campaignmanagement.CampaignCriterionTypeConverter.convertToString(value));
    }

}

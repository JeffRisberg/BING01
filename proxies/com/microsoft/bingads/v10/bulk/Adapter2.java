
package com.microsoft.bingads.v10.bulk;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<DataScope>>
{


    public Collection<DataScope> unmarshal(String value) {
        return (com.microsoft.bingads.v10.bulk.DataScopeConverter.convertToList(value));
    }

    public String marshal(Collection<DataScope> value) {
        return (com.microsoft.bingads.v10.bulk.DataScopeConverter.convertToString(value));
    }

}

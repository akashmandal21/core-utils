package com.stanzaliving.website.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DynamicSeoConstants {

    public final String NAME_HYPER_LINK = "<p><a href=\"#SL_HOUSE_URL\">#SL_HOUSE_NAME</a></p><br/>";
    public final String HYPERLINK = "<p><a href=\"#SL_HOUSE_URL\">#SL_HOUSE_NAME</a></p><br/>";
    public final String HTML_HYPERLINK_PARA = "<p><a href=\"" + HYPERLINK + "\"></a>" + NAME_HYPER_LINK + "</p><br/>";

}

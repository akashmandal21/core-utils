package com.stanzaliving.core.electricity.constants;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum FAQType {

    GENERIC("Generic", 1),
    SPECIFIC("Specific", 2);

    private String faqTypeName;
    private Integer sequence;

    private static List<EnumListing<FAQType>> faqTypes = new ArrayList<>();
    static {
        for(FAQType faqtype: FAQType.values()){
            faqTypes.add(EnumListing.of(faqtype, faqtype.getFaqTypeName()));
        }
    }

    public static  List<EnumListing<FAQType>> getMeterTypes(){
        return faqTypes;
    }
}

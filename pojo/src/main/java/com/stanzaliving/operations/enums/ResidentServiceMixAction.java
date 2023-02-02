package com.stanzaliving.operations.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ResidentServiceMixAction {
    ACTIVATE(1, "Activate"),
    DROP(2, "Drop");

    private Integer sequence;
    private String action;

    private static List<EnumListing<ResidentServiceMixAction>> residentServiceMixActionEnumListing = new ArrayList<>();

    static {

        for (ResidentServiceMixAction residentServiceMixAction : ResidentServiceMixAction.values()) {
            residentServiceMixActionEnumListing.add(EnumListing.of(residentServiceMixAction, residentServiceMixAction.getAction()));
        }
    }

    public static List<EnumListing<ResidentServiceMixAction>> getServiceMixServiceSetListing() {
        return residentServiceMixActionEnumListing;
    }
}
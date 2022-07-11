package com.stanzaliving.support.enums;


import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum RelationType {
    FATHER("Father"), MOTHER("Mother"), UNCLE("Uncle"), BROTHER("Brother"), SISTER("Sister"), AUNT("Aunt"), SPOUSE("Spouse"), PARENT("Parent");

    private String name;

    private static List<EnumListing<RelationType>> relationTypes= new ArrayList<>();

    static {
        for (RelationType relationType : RelationType.values()) {
            relationTypes.add(EnumListing.of(relationType, relationType.getName()));
        }
    }

    public static List<EnumListing<RelationType>> getRelationTypes() {
        return relationTypes;
    }
}

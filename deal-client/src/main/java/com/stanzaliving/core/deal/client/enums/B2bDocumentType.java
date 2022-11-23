package com.stanzaliving.core.deal.client.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum B2bDocumentType {

    SELFIE("Resident Image"), ID_PROOF("Id Proof"), FRRO_DETAILS("Frro Details"),
    INSTITUTE_ID("Institute Id");

    private static final List<B2bDocumentType> indianDocumentTypes = new ArrayList<>();

    private static final List<B2bDocumentType> foreignDocumentTypes = new ArrayList<>();

    private String name;

    static {
        for (B2bDocumentType type : B2bDocumentType.values()) {
            if (!FRRO_DETAILS.equals(type)) {
                indianDocumentTypes.add(type);
            }
            foreignDocumentTypes.add(type);
        }
    }

    public static List<B2bDocumentType> getIndianDocumentTypes() {
        return indianDocumentTypes;
    }

    public static List<B2bDocumentType> getForeignDocumentTypes() {
        return foreignDocumentTypes;
    }

}
package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum DocumentDetail {

    SELFIE("Resident Image",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",
            "Resident Image",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",
            1),
    PAN("PAN Card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/contacts.svg",
            "PAN Card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            2),
    REFERRAL_PAN("Referral PAN Card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/contacts.svg",
            "Referral PAN Card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            2),
    ADHAAR_CARD("Aadhaar Card",
            "fingerprint",
            "Aadhaar Card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/description.svg",
            3),
    DRIVING_LICENSE("Driving License",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            "Driving License",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            3),
    VOTER_ID("Voter Id",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            "Voter Id",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            3),
    OTHERS("Others",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",
            "Others",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",
            4),
    ID_CARD("Id card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",
            "Id card",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",
            4),
    POLICE_VERIFICATION("Police Verification",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg",
            "Police Verification",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg",
            5),
    POLICE_VERIFICATION_FORM("Police Verification form",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg",
            "Police Verification",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg",
            5),
    VISA("VISA",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            "VISA",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            3),
    PASSPORT("Passport","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg", "Passport",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg",
            3);

    private final String displayName;
    private final String documentIcon;
    private final String category;
    private final String categoryIcon;
    private final Integer order;

    private static Map<String, DocumentDetail> documentDetailMap = new HashMap<>();

    static {
        for (DocumentDetail documentDetail : DocumentDetail.values()) {
            documentDetailMap.put(documentDetail.name(), documentDetail);
        }
    }

    public static DocumentDetail getDocumentDetail(String document){
        if(documentDetailMap.containsKey(document)){
            return documentDetailMap.get(document);
        }
        return null;
    }
}

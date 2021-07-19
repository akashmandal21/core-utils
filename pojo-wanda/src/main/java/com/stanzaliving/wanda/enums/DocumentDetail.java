package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum DocumentDetail {//todo: update

    PASSPORT("Passport","", "Address Proof","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/description.svg"),
    PAN("PAN Card", "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/contacts.svg","Id Proof","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg"),
    REFERRAL_PAN("Referral PAN Card","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/contacts.svg", "Id Proof","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/badge.svg"),
    ADHAAR_CARD("Aadhaar Card","fingerprint","Address Proof","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/description.svg"),
    DRIVING_LICENSE("Driving License","","Address Proof","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/description.svg"),
    OTHERS("Others", "","Others",""),
    POLICE_VERIFICATION("Police Verification","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg","Police Verification","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg"),
    VISA("VISA","","Address Proof",""),
    SELFIE("Resident Image", "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg","Resident Image","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg");

    private final String displayName;
    private final String documentIcon;
    private final String category;
    private final String categoryIcon;

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

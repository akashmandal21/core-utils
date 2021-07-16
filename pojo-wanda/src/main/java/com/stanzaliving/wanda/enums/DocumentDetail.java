package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum DocumentDetail {

    PASSPORT("Passport", "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg",""),
    PAN("PAN Card", "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/contacts.svg","ID Proof"),
    REFERRAL_PAN("Referral PAN Card", "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/contacts.svg","ID Proof"),
    ADHAAR_CARD("Aadhaar Card","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/description.svg","Address Proof"),
    DRIVING_LICENSE("Driving License","","ID Proof"),
    OTHERS("Others", "",""),
    POLICE_VERIFICATION("Police Verification","https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/local-police.svg","Police Verification"),
    VISA("VISA","",""),
    SELFIE("Resident Image", "https://res.cloudinary.com/stanza-living/image/upload/v1625048060/sigma-app/add-photo-alternate.svg","Resident Image");

    private final String displayName;
    private final String icon;
    private final String category;

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

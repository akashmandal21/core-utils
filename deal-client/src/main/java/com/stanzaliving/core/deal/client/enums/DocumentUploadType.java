package com.stanzaliving.core.deal.client.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DocumentUploadType {

    PASSPORT("Passport"),
    PAN("Pan"),
    REFERRAL_PAN("Referral Pan"),
    AADHAAR_CARD("Aadhaar Card"),
    DRIVING_LICENSE("Driving License"),
    OTHERS("Others"),
    VISA("Visa"),
    SELFIE("Selfie"),
    INSTITUTE_ID("Institute Id"),
    ID_CARD("Identification Card"),
    VOTER_CARD("Voter Card"),
    BIRTH_CERTIFICATE("Birth Certificate"),
    HIGH_SCHOOL_MARKSHEET("High School Marksheet"),
    SEP("Sep"),
    REG_CERTIFICATE("Registration Certificate");

    private static List<DocumentUploadType> indianDocumentTypes = new ArrayList<>();

    private static List<DocumentUploadType> foreignDocumentTypes = new ArrayList<>();

    private static List<DocumentUploadType> dualSideDocuments = new ArrayList<>();

    private String name;


    static {
        indianDocumentTypes.add(DRIVING_LICENSE);
        indianDocumentTypes.add(OTHERS);
        indianDocumentTypes.add(AADHAAR_CARD);
        indianDocumentTypes.add(PAN);
        indianDocumentTypes.add(REFERRAL_PAN);

        foreignDocumentTypes.add(PASSPORT);
        foreignDocumentTypes.add(VISA);

        dualSideDocuments.add(PASSPORT);
        dualSideDocuments.add(AADHAAR_CARD);
        dualSideDocuments.add(DRIVING_LICENSE);
    }


    public static List<EnumListing<DocumentUploadType>> getIndianDocuments() {
        return getEnumListings(indianDocumentTypes);
    }

    public static List<EnumListing<DocumentUploadType>> getForeignDocuments() {
        return getEnumListings(foreignDocumentTypes);
    }

    public static List<DocumentUploadType> getDualSidedDocuments() {
        return dualSideDocuments;
    }

    private static List<EnumListing<DocumentUploadType>> getEnumListings(List<DocumentUploadType> documentUploadTypes) {
        List<EnumListing<DocumentUploadType>> enumListings = new ArrayList<>();
        for (DocumentUploadType documentUploadType : documentUploadTypes) {
            enumListings.add(EnumListing.of(documentUploadType, documentUploadType.getName()));
        }
        return enumListings;
    }

}

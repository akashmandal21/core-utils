package com.stanzaliving.core.deal.client.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentUploadType {

    PASSPORT,PAN,AADHAAR_CARD,DRIVING_LICENSE,OTHERS,VISA,INSTITUTE,SELFIE;

    private static final List<DocumentUploadType> indianDocumentTypes = new ArrayList<>();

    private static final List<DocumentUploadType> foreignDocumentTypes = new ArrayList<>();

    private static final List<DocumentUploadType> commonDocumentTypes = new ArrayList<>();


    static {
        indianDocumentTypes.add(DRIVING_LICENSE);
        indianDocumentTypes.add(OTHERS);
        indianDocumentTypes.add(AADHAAR_CARD);
        indianDocumentTypes.add(PAN);

        foreignDocumentTypes.add(PASSPORT);
        foreignDocumentTypes.add(VISA);

        commonDocumentTypes.add(INSTITUTE);
        commonDocumentTypes.add(SELFIE);
    }


    public static List<DocumentUploadType> getIndianDocuments(){
        return indianDocumentTypes;
    }

    public static List<DocumentUploadType> getForeignDocuments(){
        return foreignDocumentTypes;
    }

    public static List<DocumentUploadType> getCommonSideDocuments(){
        return commonDocumentTypes;
    }
}

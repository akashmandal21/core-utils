package com.stanzaliving.core.base.enums;

public enum DocumentType {

    POLICE_VERIFICATION (0),
    KYC(1);

    int id;
    String name;

    DocumentType(int id){
        this.id=id;
    }

}

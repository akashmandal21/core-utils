package com.stanzaliving.agreement.dto.request;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DocumentRequestDTO {

    private String actionType;

    private String actionName;

    //addendum
    private String documentType;

    //booking uuid
    private String referenceId;

    //
    private String referenceId2;

    //service which is crea
    private String referenceType;

    private List<HashMap<String, String>> fields;

    private List<Invitee> invitees;

    private String file;

    private String documentId;

    private String expiryDate;

    private String parentDocumentId;


}

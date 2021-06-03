package com.stanzaliving.agreement.dto.request;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DocumentRequestDTO {

    private String actionType;

    private String actionName;

    private String documentType;

    private String referenceId;

    private List<HashMap<String, String>> fields;

    private List<Invitee> invitees;

    private String file;

    private String documentId;

    private String expiryDate;

    private String parentDocumentId;
}

package com.stanzaliving.core.document.dto;

import com.stanzaliving.core.base.enums.DocumentStatus;
import com.stanzaliving.core.base.enums.DocumentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class UserDocumentDto {

    private String uuid;

    private String cityId;

    private String cityName;

    private String micromarketId;

    private String micromarketName;

    private String residenceId;

    private String residenceName;

    private String userName;

    private String mobileNumber;

    private DocumentStatus documentStatus;

    private String documentId;

    private String imageUrl;

    private Date updloadedOn;

    private String uploadedBy;

    private String userCode;

    private String comment;

    private DocumentType documentType;
}
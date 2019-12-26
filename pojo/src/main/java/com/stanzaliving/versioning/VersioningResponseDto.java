package com.stanzaliving.versioning;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class VersioningResponseDto
{
    private String uuid;

    private Integer version ;

    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;

    private String contextId; //Property Id or Calling Service specific Entity identifier

    private String contextService;//Calling Service

    private String contextName;//Sub identifier Optional

    private String dataDocument;

    private String dataDocumentType;
}




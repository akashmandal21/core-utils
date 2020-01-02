package com.stanzaliving.versioning.dto;

import com.stanzaliving.versioning.enums.ContentType;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VersioningRequestDto {

    @NotEmpty(message = "contextId is Mandatory")
    private String contextId; //Property Id or Calling Service specific Entity identifier

    @NotEmpty(message = "context Service Name is Mandatory")
    private String contextService;//Calling Service

    @NotEmpty(message = "contextName is mandatory")
    private String contextName;//Sub identifier Optional

    @NotEmpty
    private String submittedBy;//Document submitted by

    @NotEmpty
    private String dataDocument;

    @NotNull
    private ContentType dataDocumentType;


}

package com.stanzaliving.versioning.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class VersioningResponseBaseDto
{
    private String uuid;

    private Integer version ;

    private String contextId; //Property Id or Calling Service specific Entity identifier

    private String contextService;//Calling Service

    private String contextName;//Sub identifier Optional

    private boolean status;

    private String errorMsg;
}

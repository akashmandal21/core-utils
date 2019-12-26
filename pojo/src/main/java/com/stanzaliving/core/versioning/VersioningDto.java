package com.stanzaliving.core.versioning;

import com.stanzaliving.core.dto.AbstractMongoDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)


public class VersioningDto extends AbstractMongoDto
{
    private String contextId; //Property Id or Calling Service specific Entity identifier
    private String contextName;//Sub identifier
    private String contextService;
    private Integer version ;
    private String dataDocument;
    private String dataDocumentType;
    private String submittedBy;

}


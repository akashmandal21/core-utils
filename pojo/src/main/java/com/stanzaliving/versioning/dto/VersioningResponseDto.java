package com.stanzaliving.versioning.dto;

import com.stanzaliving.versioning.enums.ContentType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@SuperBuilder
public class VersioningResponseDto extends VersioningResponseBaseDto
{

    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private String dataDocument;

    private ContentType dataDocumentType;
}




package com.stanzaliving.core.operations.dto.serviceset;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class VersionListResponseDto {

    private String contextId;

    private Integer version;

    private String createdBy;

    private Date createdAt;

    private String uuid;

}

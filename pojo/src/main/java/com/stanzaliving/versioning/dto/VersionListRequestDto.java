package com.stanzaliving.versioning.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class VersionListRequestDto {

    private String contextId;

    private String contextName;

    private String contextService;

}

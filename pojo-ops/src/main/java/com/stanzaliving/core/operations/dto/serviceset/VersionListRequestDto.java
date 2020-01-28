package com.stanzaliving.core.operations.dto.serviceset;

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

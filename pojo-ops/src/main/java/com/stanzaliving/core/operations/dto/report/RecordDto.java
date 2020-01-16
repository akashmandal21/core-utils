package com.stanzaliving.core.operations.dto.report;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RecordDto {
    String cityUuid;
    String micromarketUuid;
    String residenceUuid;
    String type;            //this will contain accessLevel
}

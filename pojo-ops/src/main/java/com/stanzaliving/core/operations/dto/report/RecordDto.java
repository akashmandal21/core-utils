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
    String cityName;
    String micromarketUuid;
    String micromarketName;
    String residenceUuid;
    String residenceName;
    String accessLevel;

    public RecordDto(RecordDto recordDto) {
        this.cityUuid = recordDto.getCityUuid();
        this.micromarketUuid = recordDto.getMicromarketUuid();
        this.residenceUuid = recordDto.getResidenceUuid();
        this.accessLevel = recordDto.getAccessLevel();
    }
}

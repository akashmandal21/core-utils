package com.stanzaliving.dashboard.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphRecordDto extends RecordDto {
    String frequencyValue;
}

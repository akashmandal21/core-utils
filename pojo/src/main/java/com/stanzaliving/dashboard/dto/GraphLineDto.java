package com.stanzaliving.dashboard.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphLineDto extends RecordDto {
    String name;
    Object value;
    Object data;        //Will be list of graphYpoint
}

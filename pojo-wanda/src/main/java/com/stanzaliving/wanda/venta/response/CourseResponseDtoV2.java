package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseResponseDtoV2 {

    private Long courseId;
    private String courseUuid;
    private String name;
    private boolean enabled;
}

package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceStatRDto {
    private String residenceId;
    private Integer count;
    private String name;
    private Map<LocalTime, List<String>> slots;
    private LocalTime nextSlot;

}

package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;

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
    private List<LocalTime> slots;
    private LocalTime nextSlot;

}

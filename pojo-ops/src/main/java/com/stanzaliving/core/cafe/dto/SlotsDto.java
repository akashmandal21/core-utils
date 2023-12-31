package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlotsDto extends AbstractDto {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Cafe is mandatory for slot")
    private String cafeId;

    @NotBlank(message = "Residence is mandatory for slot")
    private String residenceId;

    @NotBlank(message = "Slot Name is mandatory")
    private String slotName;

    @NotNull(message = "Slot Type is mandatory")
    private SlotType slotType;

    private LocalTime deliveryTime;

    @NotNull(message = "Ordering window start time is mandatory")
    private LocalTime orderingWindowStartTime;

    @NotNull(message = "Ordering window end time is mandatory")
    private LocalTime orderingWindowEndTime;

    private List<ChargesApplicableDto> applicableCharges;

    private boolean nextDayApplicable;

}
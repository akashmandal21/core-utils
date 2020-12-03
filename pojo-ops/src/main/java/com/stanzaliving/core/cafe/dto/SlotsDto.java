package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
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

    private String cafeId;

    private String residenceId;

    private String slotName;

    private SlotType slotType;

    private LocalTime deliveryTime;

    private LocalTime orderingWindowStartTime;

    private LocalTime orderingWindowEndTime;

    @Valid
    private List<ChargesApplicableDto> applicableCharges;


}

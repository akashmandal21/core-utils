package com.stanzaliving.generictaskservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.DayOfWeek;
import java.util.List;

/**
 * @author Vikas S T
 * @date 26-Sep-21
 **/

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkShiftAllocationRequestDto {

    @NotBlank(message = "Day is mandatory")
    private DayOfWeek shiftDay;

    private List<HkShiftRequestDto> shifts;

    private String uuid;

}

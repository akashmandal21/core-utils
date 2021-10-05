package com.stanzaliving.generictaskservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Vikas S T
 * @date 04-Oct-21
 **/

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkShiftRequestDto {
    @NotBlank(message = "ShiftId is mandatory")
    private String uuid;
    private List<HkSlotRequestDto> slots;
}

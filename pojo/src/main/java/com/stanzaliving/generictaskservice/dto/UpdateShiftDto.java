package com.stanzaliving.generictaskservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 22-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateShiftDto {

    @NotBlank(message = "Shift uuid is Mandatory.")
    private String uuid;

    private String module;

    private String shiftName;

    private String shiftCategory;

    @Min(value = 1, message = "Shift hour cannot be less than 1 hours")
    @Max(value = 24, message = "Shift hour cannot be more than 24 hours")
    private Double durationInHours;

    private List<String> tagsUuidList = new ArrayList<>();


}

package com.stanzaliving.generictaskservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;
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

    private LocalTime durationInHours;

    private List<String> tagsUuidList = new ArrayList<>();


}

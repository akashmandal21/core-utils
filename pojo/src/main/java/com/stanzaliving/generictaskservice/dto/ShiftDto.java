package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.List;
import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;

/**
 * @author Vikas S T
 * @date 27-Jul-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShiftDto extends AbstractDto {

    private String shiftUuid;

    @NotBlank(message = "Module is mandatory")
    private String module;

    @NotBlank(message = "Shift name is mandatory")
    private String shiftName;

    @NotNull(message = "Shift category is mandatory")
    private String shiftCategory;

    private Double durationInHours;

    @NotBlank(message = "StartingTime is mandatory")
    private LocalTime startingTime;

    @NotBlank(message = "EndingTime is mandatory")
    private LocalTime endingTime;

    private List<String> tagsUuidList;

    private List<TagResponseDto> tags;

    private ShiftCategoryDto category;

}

package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

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

    @NotNull(message = "Duration is mandatory")
    @Min(value = 1, message = "Shift hour cannot be less than 1 hours")
    @Max(value = 24, message = "Shift hour cannot be more than 24 hours")
    private Double durationInHours;

    private List<String> tagsUuidList = new ArrayList<>();

    private List<TagResponseDto> tags;

    private ShiftCategoryDto category;

}

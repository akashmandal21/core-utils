package com.stanzaliving.generictaskservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class ShiftDto {

    private String shiftUuid;

    @NotBlank(message = "Module mandatory")
    private String module;

    @NotBlank(message = "Shift name mandatory")
    private String shiftName;

    @NotNull(message = "Shift category is mandatory")
    private String shiftCategory;

    @NotNull(message = "Duration is mandatory")
    private Integer duration;

    private List<String> tagsUuidList;

    private List<TagResponseDto> tags;

}

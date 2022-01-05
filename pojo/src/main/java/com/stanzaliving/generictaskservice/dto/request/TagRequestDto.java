package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.enums.TagsCategoryType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagRequestDto {

    @NotBlank(message = "Tag Name Cannot be blank")
    private String tagName;

    @NotNull(message = "department is mandatory")
    private Department department;

    @NotNull(message = "Tag category is mandatory")
    private TagsCategoryType tagCategory;

    private String tagColor;

    private String tagIcon;
}

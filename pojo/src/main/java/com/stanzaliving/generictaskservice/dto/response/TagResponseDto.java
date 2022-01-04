package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.enums.TagsCategoryType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagResponseDto extends AbstractDto {

    private String tagName;

    private Department department;

    private TagsCategoryType tagCategory;

    private String tagColor;

    private String tagIcon;
}

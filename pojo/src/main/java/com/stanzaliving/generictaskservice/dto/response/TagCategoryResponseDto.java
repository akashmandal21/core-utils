package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Priyadarshini MB
 */
@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagCategoryResponseDto extends AbstractDto {

    private String tagCategoryName;

    private String parentUuid;

    private Department department;

    private String module;

    private List<TagCategoryResponseDto>  subTagCategories;
}

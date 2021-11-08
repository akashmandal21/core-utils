package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author Priyadarshini MB
 */
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagCategoryResponseDto extends AbstractDto {

    private String tagCategoryName;

    private String tagSubCategoryUuid;

    private Department department;
}

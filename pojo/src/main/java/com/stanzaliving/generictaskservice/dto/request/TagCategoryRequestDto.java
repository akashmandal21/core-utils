package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Priyadarshini MB
 */
@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagCategoryRequestDto {

    private String tagCategoryName;

    private String parentUuid;

    private Department department;

    private String module;

}

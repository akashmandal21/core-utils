package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

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

    private String tagSubCategoryUuid;

    private String module;

    private Department department;

}

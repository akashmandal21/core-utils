package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 13-Dec-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericTemplateSubCategoryResponseDto {

    private String uuid;

    private String categoryName;

    private List<TemplateSubCategoryResponseDto> genericTemplate;
}

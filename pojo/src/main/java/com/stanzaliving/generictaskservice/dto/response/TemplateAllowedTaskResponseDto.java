package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 14-Dec-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TemplateAllowedTaskResponseDto {
    private String templateName;
    private String attributeType;
    private String uuid;
    private String taskSubCategoryUuid;
    private String taskSubCategoryName;
    private Object data;
}

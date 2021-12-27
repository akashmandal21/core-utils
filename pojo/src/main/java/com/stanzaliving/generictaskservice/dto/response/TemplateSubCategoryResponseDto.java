package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

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
public class TemplateSubCategoryResponseDto {
    private String templateName;
    private String description;
    private String uuid;
}

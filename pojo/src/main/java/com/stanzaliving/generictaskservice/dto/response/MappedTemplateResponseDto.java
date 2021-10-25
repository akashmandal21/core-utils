package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;

/**
 * @author Vikas S T
 * @date 24-Oct-21
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MappedTemplateResponseDto {
    private String uuid;
    private String templateName;
}

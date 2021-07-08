package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateDetailDto {

    private String templateName;
    private String templateCode;
    private String templateDescription;
    private String uuid;

}

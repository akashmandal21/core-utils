package com.stanzaliving.approve.dto.mail_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailTemplateRequestDto {
    //todo: add validation
    // create a user defined validation for params - no repeated keys

    private String templateId;

    private List<MailParamsDto> params;

}

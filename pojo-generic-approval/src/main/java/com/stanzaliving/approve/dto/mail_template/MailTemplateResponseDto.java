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
public class MailTemplateResponseDto {
    private Long id;

    private String templateId;

    private List<Object> params;

    private String templateUUID;
}

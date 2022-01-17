package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateActionDto {
    private String level;
    private TemplateStatus templateStatus;
    private Date actionAt;
    private String actionBy;
}

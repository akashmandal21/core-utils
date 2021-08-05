package com.stanzaliving.support.dto;

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
    private String l1ActionedBy;
    private Date l1ActionAt;
    private String l2ActionedBy;
    private Date l2ActionAt;
    private String l3ActionedBy;
    private Date l3ActionAt;
    private String l4ActionedBy;
    private Date l4ActionAt;
    private String l5ActionedBy;
    private Date l5ActionAt;
}

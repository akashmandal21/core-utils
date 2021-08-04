package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateActionDto {
    private String l1ActionedBy;
    private LocalDate l1ActionAt;
    private String l2ActionedBy;
    private LocalDate l2ActionAt;
    private String l3ActionedBy;
    private LocalDate l3ActionAt;
    private String l4ActionedBy;
    private LocalDate l4ActionAt;
    private String l5ActionedBy;
    private LocalDate l5ActionAt;
}

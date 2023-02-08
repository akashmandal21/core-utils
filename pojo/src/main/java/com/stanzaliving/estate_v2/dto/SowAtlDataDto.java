package com.stanzaliving.estate_v2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SowAtlDataDto {
    private String section;
    private String subSection;
    private String clauseDescription;
    @Builder.Default
    private String clauseAnswer="Yes";
    private String proposedTerm;
    private String reason;
}

package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DownloadCsvDto {
    private String group;
    @Builder.Default
    private String category = "";
    @Builder.Default
    private String subCategory = "";
    @Builder.Default
    private String subTicketType = "";
    @Builder.Default
    private String feedbackReasons = "";
}

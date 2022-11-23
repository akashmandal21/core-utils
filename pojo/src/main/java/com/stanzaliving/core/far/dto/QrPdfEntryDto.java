package com.stanzaliving.core.far.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrPdfEntryDto {
    private String itemUrl;
    private String itemName;
    private String date;
    private String time;
}

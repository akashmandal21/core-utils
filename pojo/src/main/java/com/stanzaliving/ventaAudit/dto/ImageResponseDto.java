package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageResponseDto {
    private String filePath;
    private String fileUrl;
}

package com.stanzaliving.core.far.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetUploadedFilesResponseDto {
    private String insuranceDocUrl;
    private String amcDocUrl;
    private List<String> imageWithoutQrCodeUrl;
    private List<String> imageWithQrCodeUrl;
}
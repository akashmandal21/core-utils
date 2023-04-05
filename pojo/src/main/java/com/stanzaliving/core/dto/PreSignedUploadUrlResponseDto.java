package com.stanzaliving.core.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PreSignedUploadUrlResponseDto {

    private String preSignedUploadUrl;
    private String documentName;
    private String signedUploadUrl;

}

package com.stanzaliving.wanda.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KYCDocumentDto {

    private String filePath;

    private String fileName;

    private String fileUrl;
}

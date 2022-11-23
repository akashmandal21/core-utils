package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.DocumentSideType;
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

    private DocumentSideType documentSideType;
}

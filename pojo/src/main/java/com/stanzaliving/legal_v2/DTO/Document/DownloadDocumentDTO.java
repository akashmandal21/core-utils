package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;
import org.springframework.core.io.ByteArrayResource;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DownloadDocumentDTO {

    String fileName;

    ByteArrayResource resource;

}

package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DownloadDocumentDTO {

    String fileName;

    byte[] resource;

}

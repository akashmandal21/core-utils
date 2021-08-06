package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QRCodeDetails {

    private int pageNumber;

    private String qrCode;

    private String filePath="";

}

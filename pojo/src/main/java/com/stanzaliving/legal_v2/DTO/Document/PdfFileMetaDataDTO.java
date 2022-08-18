package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import java.io.ByteArrayOutputStream;
import java.util.List;
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PdfFileMetaDataDTO {

    private ByteArrayOutputStream stream;

    private int pageNumbers;

    private List<QRCodeDetails> qrCodeList;

}

package com.stanzaliving.legal_v2.DTO.Document;

import com.stanzaliving.core.dto.AbstractMongoDto;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DocumentVersionsDto extends AbstractMongoDto {

    private String documentName;

    private String docPath;

    private String emailUuid;

    private String url;

    private int version;

    private boolean isFinal;

    private List<ChecklistDTO> checklistDTOList;

    private PdfFileMetaDataDTO pdfMetaData;

    private boolean buttonStatus = true;

}

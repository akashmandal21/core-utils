package com.stanzaliving.legal_v2.DTO;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.DTO.CityDocumentsCofig.FoldersAndDocumentsDTO;
import com.stanzaliving.legal_v2.DTO.Document.Folders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class DocumentListDto {

    private String propertyName;
    private String city;
    private String microMarket;
    private Integer noOfBeds;
    private Integer noOfRooms;
    private List<Folders> folders;
}

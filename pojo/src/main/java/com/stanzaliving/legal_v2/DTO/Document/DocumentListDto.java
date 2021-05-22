package com.stanzaliving.legal_v2.DTO.Document;

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
    private List<Folders> folders;
}

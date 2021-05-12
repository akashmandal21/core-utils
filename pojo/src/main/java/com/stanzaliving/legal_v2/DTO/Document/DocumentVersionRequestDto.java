package com.stanzaliving.legal_v2.DTO.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DocumentVersionRequestDto {

    private String docUrl;

    private String docStatus;

    private String emailUuid;

    private Boolean status;

    private Integer version;

    private Boolean isFinal;


}

package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Folders {
    private String folder;

    private List<DocumentMap> documents;
    
}

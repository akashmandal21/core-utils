package com.stanzaliving.legal_v2.DTO.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Folders {
    private String folder;
    
    private List<Documents> documents;
    
}

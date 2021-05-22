package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Folders {
    private String folder;
    
    private List<Map<String,List<Object>>> documents;
    
}

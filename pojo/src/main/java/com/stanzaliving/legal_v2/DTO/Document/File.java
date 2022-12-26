package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class File {
    private String name;
    private String file;
    private String fields;
    private String additionalFiles;
}

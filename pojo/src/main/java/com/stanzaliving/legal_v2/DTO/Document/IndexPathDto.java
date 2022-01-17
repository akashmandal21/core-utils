package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class IndexPathDto {

    private int Index;

    private String s3Path;
}

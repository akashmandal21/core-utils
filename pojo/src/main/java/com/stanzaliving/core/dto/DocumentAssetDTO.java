package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.DocumentSide;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentAssetDTO {
    private Long id;

    private String uuid;

    private String documentUuid;

    private String url;

    private DocumentSide documentSide;
}
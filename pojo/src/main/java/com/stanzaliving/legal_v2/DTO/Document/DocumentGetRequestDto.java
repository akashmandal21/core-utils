package com.stanzaliving.legal_v2.DTO.Document;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DocumentGetRequestDto extends PaginationRequest {
    
    private String type;
}

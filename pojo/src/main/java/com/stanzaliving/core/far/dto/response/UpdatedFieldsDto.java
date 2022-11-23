package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dhruv.mathur
 * @date 05/04/21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatedFieldsDto {
    private String oldValue;
    private String newValue;
    private  String contextId;
}

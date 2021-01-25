package com.stanzaliving.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailAttachmentDto {
    private String attachmentName;
    private Map<String, Object> params;

}

package com.stanzaliving.core.client.dto;

import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestDto {
    private String referenceId;

    private String referenceType;

    private Map<String, String> metadata;

    private String requestStatus;

    private String requestType;
    
    private String rejectReason;
    
    private Date createdAt;
    
    private Date updatedAt;

}

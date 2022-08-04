package com.stanzaliving.audit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditLogResponseDto {

    private Date createdAt;

    private String createdBy;

    private String status;
}

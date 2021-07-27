package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TagDto {
    private String tag;
    private String uuid;
    private String ticketUuid;
    private boolean active;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdAt;
    private Date lastUpdatedAt;
}

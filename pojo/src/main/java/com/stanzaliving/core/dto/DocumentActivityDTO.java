package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ActivityType;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentActivityDTO {
    private Long id;
    private String uuid;

    private Date createdAt;

    private String createdBy;

    private ActivityType activityType;

    private String description;
}
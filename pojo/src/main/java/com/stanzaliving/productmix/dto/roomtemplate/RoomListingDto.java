package com.stanzaliving.productmix.dto.roomtemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomListingDto {
    private String templateId;

    private String uuid;

    private String templateName;

    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;

    private LocalDateTime updatedAt;

    private String approvedBy;

    private LocalDateTime approvedAt;

    private List<String> features;

    private List<String> consumables;

    private String templateStatus;

    private String backgroundColor;

    private String textColor;
}

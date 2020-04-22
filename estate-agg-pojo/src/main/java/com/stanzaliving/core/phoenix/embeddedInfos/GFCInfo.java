package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.core.projectservice.enums.GFCStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GFCInfo {
    private String gfcUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private LocalDate scheduledDueDate;
    private GFCStatus gfcStatus;
    private LocalDate dueDate;
}

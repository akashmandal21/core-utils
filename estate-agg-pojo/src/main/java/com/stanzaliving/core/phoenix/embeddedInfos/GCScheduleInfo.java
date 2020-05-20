package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.gcservice.enums.GcScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GCScheduleInfo {
    private String gcSchedStatusUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private GcScheduleStatus gcScheduleStatus;
    private Integer fileVersion;
    private String filePath;
}

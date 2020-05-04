package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.asis.enums.SiteVisitStatus;
import com.stanzaliving.core.projectservice.enums.AsIsStatus;
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
public class AsIsInfo {
    private String asisUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private LocalDate dueDate;
    private String delayReason;
    private LocalDate siteVisitDate;
    private SiteVisitStatus siteVisitStatus;
    private LocalDate asIsStartsOn;
    private AsIsStatus asIsStatus;
}

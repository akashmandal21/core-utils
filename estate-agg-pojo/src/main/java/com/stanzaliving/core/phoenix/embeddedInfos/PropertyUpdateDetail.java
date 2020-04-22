package com.stanzaliving.core.phoenix.embeddedInfos;

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
public class PropertyUpdateDetail {
    private String uuid;
    private Date createdAt;
    private String createdBy;
}

package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoqInfo {
    private String boqUuid;
    private BoqStatus boqStatus;
    private Date boqCreatedAt;
    private Date boqUpdatedAt;
    private String boqCreatedby;
    private String boqUpdatedby;
}

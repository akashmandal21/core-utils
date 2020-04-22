package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.po.enums.PoStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoInfo {
    private Date updatedAt;
    private String updatedBy;
    private PoStatus poStatus;
    private Date approvalDate;
}

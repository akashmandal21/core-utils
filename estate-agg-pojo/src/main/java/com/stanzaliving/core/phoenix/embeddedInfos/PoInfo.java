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
    private String poUuid;
    private PoType poType;
    private Date updatedAt;
    private String updatedBy;
    private PoStatus poStatus;
    private Date approvalDate;
    private Boolean isRejected;
    private String vendorPocUuid;
    private String vendorDetailsUuid;

    public PoInfo(String uuid){
        this.poUuid = uuid;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        PoInfo other = (PoInfo) obj;
        if(this.poUuid.equals(other.getPoUuid()))
            return true;

        return false;
    }
}

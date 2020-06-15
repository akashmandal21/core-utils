package com.stanzaliving.core.phoenix.embeddedinfos;

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
    private String poType; // Changed from PoType enum to String
    private Date updatedAt;
    private String updatedBy;
    private String poStatus; // Changed from PoStatus enum to String
    private Date approvalDate;
    private Boolean isRejected;
    private String vendorPocUuid;
    private String vendorDetailsUuid;
    private Boolean isWarehouseVendor;

    public PoInfo(String uuid){
        this.poUuid = uuid;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + poUuid.hashCode();

        return result;
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

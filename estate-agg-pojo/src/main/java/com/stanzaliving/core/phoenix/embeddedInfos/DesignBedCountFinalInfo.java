package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.agg.commons.EnumDecoder;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DesignBedCountFinalInfo {
    
    private Date createdAt;

    
    private String createdBy;

    
    private Date updatedAt;

    
    private String updatedBy;

    private String bedCountUuid;

    private Integer phoenixRooms;

    private Integer primaBeds;

    private Integer summaBeds;

    private Integer magnaBeds;

    private Integer noOfFloors;

    private String phoenixDesignStatus; //Changed from PhoenixDesignStatus enum to String

    private boolean commercialApproved = false;

    private String phoenixDesignRemark;

    public PhoenixDesignStatus getPhoenixDesignStatusEnum(){
        return EnumDecoder.getEnum(phoenixDesignStatus,PhoenixDesignStatus.class);
    }
}

package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.projectservice.enums.BedCountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhoenixBedCountInfo {
    
    private Date createdAt;

    
    private String createdBy;

    
    private Date updatedAt;

    
    private String updatedBy;

    
    String bedCountUuid;

    
    private Integer primaBedCount;

    
    private Integer designBedCount;

    
    private Integer designRoomCount;

    
    private Integer deviationInBedCount;

    
    private String bedCountStatus; //Changed from BedCountStatus enum to String

    
    private String deviationReason;


}

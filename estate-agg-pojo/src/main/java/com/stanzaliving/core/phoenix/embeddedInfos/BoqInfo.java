package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.agg.commons.EnumDecoder;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
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
    private String boqStatus; // Changed from BoqStatus enum to String
    private Date boqCreatedAt;
    private Date boqUpdatedAt;
    private String boqCreatedby;
    private String boqUpdatedby;

    public BoqStatus getBoqStatusEnum(){
        return EnumDecoder.getEnum(boqStatus,BoqStatus.class);
    }
}

package com.stanzaliving.core.electricity.constants;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum PrepaidMeterRunningStatus {

    ON("On", 1),
    OFF("Off", 2);

    private String runningStatus;
    
    private int sequence;

    private static List<EnumListing<PrepaidMeterRunningStatus>> prepaidMeterRunningStatus = new ArrayList<>();
    static {
        for(PrepaidMeterRunningStatus runningStatus: PrepaidMeterRunningStatus.values()){
        	prepaidMeterRunningStatus.add(EnumListing.of(runningStatus, runningStatus.getRunningStatus()));
        }
    }

    public static  List<EnumListing<PrepaidMeterRunningStatus>> getPrepaidMeterRunningStatus(){
        return prepaidMeterRunningStatus;
    }
}

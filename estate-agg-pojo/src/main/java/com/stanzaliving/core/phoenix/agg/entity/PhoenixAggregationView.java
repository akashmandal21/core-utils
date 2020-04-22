package com.stanzaliving.core.phoenix.agg.entity;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.estate.embeddedInfos.DesignBedInfo;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.phoenix.embeddedInfos.*;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoenixAggregationView extends AbstractMongoEntity {

    PropertyBasicInfo propertyBasicInfo;
    Map<Department,Map<UserType,PropertyResponsibleInfo>> stakeholders;
    Map<PropertyUpdateEnum,List<PropertyUpdateDetail>> propertyUpdateTracker;
    BoqInfo masterBoqInfo;
    //Map<String,BoqInfo> extraBoqInfos; //boqPrUuid -> ExtraBoqs
    ProjectSchedule projectSchedule;
    HotoInfo hotoInfo;
    GFCInfo gfcInfo;
    AsIsInfo asIsInfo;
    PhoenixBedCountInfo phoenixBedCountInfo;
    DesignBedInfo designBedInfo;
    GCScheduleInfo gcScheduleInfo;
    Map<PoType,Map<String,PoInfo>> poDetails;
    AnalyticKeys analyticKeys;
}

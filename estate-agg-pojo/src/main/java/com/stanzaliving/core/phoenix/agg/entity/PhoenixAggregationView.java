package com.stanzaliving.core.phoenix.agg.entity;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.estate.embeddedInfos.DesignBedInfo;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.phoenix.embeddedInfos.*;
import com.stanzaliving.core.projectservice.enums.GFCStatus;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import com.stanzaliving.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("phoenixAggregationViewEntity")
@TypeAlias("phoenixAggregationViewEntity")
public class PhoenixAggregationView extends AbstractMongoEntity {

    private PropertyBasicInfo propertyBasicInfo;
    private Map<Department,Map<UserType,String>> stakeholders;
    private Map<PropertyUpdateEnum,List<PropertyUpdateDetail>> propertyUpdateTracker;
    private BoqInfo masterBoqInfo;
    //Map<String,BoqInfo> extraBoqInfos; //boqPrUuid -> ExtraBoqs
    private ProjectSchedule projectSchedule;
    private HotoInfo hotoInfo;
    private GFCStatus gfcStatus;
    private List<GFCInfo> gfcInfo;
    private AsIsInfo asIsInfo;
    private PhoenixBedCountInfo phoenixBedCountInfo;
    private DesignBedCountFinalInfo designBedCountFinalInfo;
    private DesignBedInfo initialBedCountInfo;
    private GCScheduleInfo gcScheduleInfo;
    private List<PoInfo> poDetails; //Po Details Uuid to PoInfo Mapping.
    private AnalyticKeys analyticKeys;
}

package com.stanzaliving.core.phoenix.agg.entity;

import com.stanzaliving.core.agg.commons.EnumDecoder;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.estate.embeddedInfos.DesignBedInfo;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.phoenix.embeddedinfos.*;
import com.stanzaliving.core.projectservice.enums.GFCStatus;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
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
    Map<String,Object> estateAttributes;
    /*
    Map of Department to Map of UserType and stakeholders uuid
     */
    private Map<Department,Map<UserType,String>> stakeholders;
    /*
    Map of PropertyUpdateEnum to List of PropertyUpdateDetail
     */
    private Map<PropertyUpdateEnum,List<PropertyUpdateDetail>> propertyUpdateTracker;//Changed from Map<PropertyUpdateEnum,List<PropertyUpdateDetail>> to  Map<String,List<PropertyUpdateDetail>>

    private BoqInfo masterBoqInfo;
    //Map<String,BoqInfo> extraBoqInfos; //boqPrUuid -> ExtraBoqs
    private ProjectSchedule projectSchedule;
    private HotoInfo hotoInfo;
    private String gfcStatus; //Changed GFCStatus ENum to String
    private List<GFCInfo> gfcInfo;
    private AsIsInfo asIsInfo;
    private PhoenixBedCountInfo phoenixBedCountInfo;
    private DesignBedCountFinalInfo designBedCountFinalInfo;
    private DesignBedInfo initialBedCountInfo;
    private GCScheduleInfo gcScheduleInfo;
    private List<PoInfo> poDetails; //Po Details Uuid to PoInfo Mapping.
    private AnalyticKeys analyticKeys;

    public GFCStatus getGFCStatusEnum(){
        return EnumDecoder.getEnum(gfcStatus,GFCStatus.class);
    }

}

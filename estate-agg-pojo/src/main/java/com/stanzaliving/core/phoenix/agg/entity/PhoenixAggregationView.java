package com.stanzaliving.core.phoenix.agg.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import com.stanzaliving.core.agg.commons.EnumDecoder;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.estate.embeddedinfos.DesignBedInfo;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.phoenix.embeddedinfos.AnalyticKeys;
import com.stanzaliving.core.phoenix.embeddedinfos.AsIsInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.BoqInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.DesignBedCountFinalInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.GCScheduleInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.GFCInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.HotoInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.PhoenixBedCountInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.PoInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.ProjectSchedule;
import com.stanzaliving.core.phoenix.embeddedinfos.PropertyBasicInfo;
import com.stanzaliving.core.phoenix.embeddedinfos.PropertyUpdateDetail;
import com.stanzaliving.core.projectservice.enums.GFCStatus;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import com.stanzaliving.core.user.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("phoenixAggregationViewEntity")
@TypeAlias("phoenixAggregationViewEntity")
public class PhoenixAggregationView extends AbstractMongoEntity {

    private static final long serialVersionUID = -7144380402153965095L;
	private PropertyBasicInfo propertyBasicInfo;
    /*
    Map of Department to Map of UserType and stakeholders uuid
     */
    private Map<Department,Map<UserType,String>> stakeholders;
    /*
    Map of PropertyUpdateEnum to List of PropertyUpdateDetail
     */
    private Map<PropertyUpdateEnum,List<PropertyUpdateDetail>> propertyUpdateTracker;//Changed from Map<PropertyUpdateEnum,List<PropertyUpdateDetail>> to  Map<String,List<PropertyUpdateDetail>>

    private BoqInfo masterBoqInfo;
    private List<BoqInfo> extraBoqInfos;
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
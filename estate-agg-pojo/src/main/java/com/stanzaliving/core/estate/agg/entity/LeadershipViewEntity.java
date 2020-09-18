package com.stanzaliving.core.estate.agg.entity;

import com.stanzaliving.core.estate.embeddedinfos.*;
import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("leadershipViewEntity")
@TypeAlias("leadershipViewEntity")
public class LeadershipViewEntity extends AbstractMongoEntity {

    boolean status=true;

    EstateInfo estateInfo;

    Map<String,Object> estateAttributes;

    LeadershipInfo leadershipInfo;

    DesignBedInfo designBedInfo;

    Map<EstateStatus, EstateStatusStruct> estateStatusHistory;

    AnalyticsKeys analyticsKeys;

    List<EstateStatusTimeLineStruct> estateStatusTimeLine;
}

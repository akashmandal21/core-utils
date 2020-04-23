package com.stanzaliving.core.phoenix.agg.entity;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.estate.embeddedInfos.DesignBedInfo;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.phoenix.embeddedInfos.*;
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
@Document("phoenixUserWiseFrequentContactsEntity")
@TypeAlias("phoenixUserWiseFrequentContactsEntity")
public class PhoenixUserWiseFrequentContacts extends AbstractMongoEntity {

    String propertyUuid;
    String userUuid;
    List<FrequentContacts> frequentContacts;
}

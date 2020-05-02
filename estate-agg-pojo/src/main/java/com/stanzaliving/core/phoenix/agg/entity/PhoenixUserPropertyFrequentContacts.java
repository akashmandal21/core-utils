package com.stanzaliving.core.phoenix.agg.entity;

import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.phoenix.embeddedInfos.FrequentContacts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("phoenixUserPropertyFrequentContactsEntity")
@TypeAlias("phoenixUserPropertyFrequentContactsEntity")
public class PhoenixUserPropertyFrequentContacts extends AbstractMongoEntity {

    String propertyUuid;
    String userUuid;
    List<FrequentContacts> frequentContacts;
}

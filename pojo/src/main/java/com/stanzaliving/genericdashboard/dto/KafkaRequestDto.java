package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KafkaRequestDto {

    String userId;

    String eventName;

    String eventCategory;

    Date eventTime;

    Map<String , KafkaTemplateDto> attributes;
}

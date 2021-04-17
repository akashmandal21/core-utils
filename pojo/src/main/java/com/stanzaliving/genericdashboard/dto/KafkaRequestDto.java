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

    private String userId;

    private String eventName;

    private String eventCategory;

    private Date eventTime;

    private Map<String, String> attributes;


}

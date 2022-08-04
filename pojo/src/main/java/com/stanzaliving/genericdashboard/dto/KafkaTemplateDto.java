package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.EventDataType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KafkaTemplateDto {

    private EventDataType eventDataType;

    private boolean metaDataApplicable = true;

    private Object value;
}
package com.stanzaliving.legal_v2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CamundaDto {
    String serviceName;
    String businessKey;
    String propertyStatus;
    boolean approved;
    Map<String, String> metaData;
}
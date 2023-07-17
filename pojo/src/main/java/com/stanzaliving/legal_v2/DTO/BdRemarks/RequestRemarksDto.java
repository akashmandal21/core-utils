package com.stanzaliving.legal_v2.DTO.BdRemarks;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RequestRemarksDto {

    private String propertyId;
    private List<String> variableNames;
}

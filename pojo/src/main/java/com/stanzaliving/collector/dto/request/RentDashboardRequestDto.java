package com.stanzaliving.collector.dto.request;

import com.stanzaliving.collector.enums.AdjustedType;
import com.stanzaliving.collector.enums.DataValueType;
import com.stanzaliving.collector.enums.LabelType;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.dashboard.dto.BaseRequestDto;

import java.time.LocalDate;

public class RentDashboardRequestDto extends BaseRequestDto {

    ResidenceType residenceType;
    LocalDate fromDate;
    AdjustedType adjustedType;
    LabelType labelType;
    DataValueType dataValueType;
}

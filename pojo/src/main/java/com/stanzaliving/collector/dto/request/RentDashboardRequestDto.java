package com.stanzaliving.collector.dto.request;

import com.stanzaliving.collector.enums.AdjustedType;
import com.stanzaliving.collector.enums.DataValueType;
import com.stanzaliving.collector.enums.LabelType;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.dashboard.dto.BaseRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RentDashboardRequestDto extends BaseRequestDto {


    @NotNull
    List<ResidenceType> residenceTypeList;
    @NotNull
    AdjustedType adjustedType;
    @NotNull
    LabelType labelType;
}

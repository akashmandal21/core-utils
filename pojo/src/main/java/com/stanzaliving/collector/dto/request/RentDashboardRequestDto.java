package com.stanzaliving.collector.dto.request;

import com.stanzaliving.collector.enums.AdjustedType;
import com.stanzaliving.collector.enums.LabelType;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.dashboard.dto.BaseRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class RentDashboardRequestDto extends BaseRequestDto {


    @NotNull
    List<ResidenceType> residenceTypeList;
    @NotNull
    AdjustedType adjustedType;
    @NotNull
    LabelType labelType;
    Boolean inUSD;
}

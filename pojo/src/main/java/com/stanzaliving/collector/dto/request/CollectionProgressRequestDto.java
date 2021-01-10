package com.stanzaliving.collector.dto.request;

import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.dashboard.dto.BaseRequestDto;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString(callSuper = true)
public class CollectionProgressRequestDto extends BaseRequestDto {
    @NotNull(message = "ResidenceTypeList must not be null")
    List<ResidenceType> residenceTypeList;
}

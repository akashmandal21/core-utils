package com.stanzaliving.collector.dto.request;

import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.dashboard.dto.BaseRequestDto;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@ToString(callSuper = true)
public class IssueProgressRequestDto extends CollectionProgressRequestDto {
    @NotNull
    LocalDate inputDate;
}

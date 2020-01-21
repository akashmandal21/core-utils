package com.stanzaliving.core.operations.dto.request.report.food;

import com.stanzaliving.core.operations.dto.request.report.ReportRequestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodReportRequestDto extends ReportRequestDto {

    List<String> mealUuid;

    List<String> vendorUuid;

}

package com.stanzaliving.core.operations.dto.request.report.food;

import com.stanzaliving.core.operations.dto.request.report.ReportRequestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodReportRequestDto extends ReportRequestDto {

    List<String> mealType;

    List<String> vendorUuid;

}

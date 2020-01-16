package com.stanzaliving.core.operations.dto.request.report.food;

import com.stanzaliving.core.operations.dto.request.report.ReportRequestDto;

import java.util.List;

public class FoodReportRequestDto extends ReportRequestDto {

    List<String> mealType;

    List<String> vendorUuid;

}

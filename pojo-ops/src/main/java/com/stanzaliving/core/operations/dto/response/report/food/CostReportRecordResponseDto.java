package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CostReportRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostReportRecordResponseDto extends RecordDto {

	private FeElementDto onTimeOrder;

	private MealResponseDto costInThousand;

	public CostReportRecordResponseDto(CostReportRecordDto costReportRecordDto) {
		super(costReportRecordDto);

		this.onTimeOrder = new FeElementDto(costReportRecordDto.getOnTimeOrder());

		this.costInThousand = MealResponseDto.builder()
				.overall(new FeElementDto(costReportRecordDto.getCost().getOverall() / 1000, FeElementType.CURRENCY_INTEGER))
				.breakfast(new FeElementDto(costReportRecordDto.getCost().getBreakfast() / 1000, FeElementType.CURRENCY_INTEGER))
				.lunch(new FeElementDto(costReportRecordDto.getCost().getLunch() / 1000, FeElementType.CURRENCY_INTEGER))
				.snacks(new FeElementDto(costReportRecordDto.getCost().getSnacks() / 1000, FeElementType.CURRENCY_INTEGER))
				.dinner(new FeElementDto(costReportRecordDto.getCost().getDinner() / 1000, FeElementType.CURRENCY_INTEGER))
				.brunch(new FeElementDto(costReportRecordDto.getCost().getBrunch() / 1000, FeElementType.CURRENCY_INTEGER))
				.build();
	}

}
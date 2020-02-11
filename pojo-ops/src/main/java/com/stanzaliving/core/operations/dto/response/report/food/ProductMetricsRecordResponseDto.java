package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.ProductMetricsRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProductMetricsRecordResponseDto extends RecordDto {

	private FeElementDto meals;

	private FeElementDto menuCreated;

	private FeElementDto ordersCreated;

	private FeElementDto foodReceived;

	private FeElementDto shortageFilled;

	private FeElementDto leftoverFilled;

	private FeElementDto feedbackGiven;

	private String mealUuid;

	private String mealName;

	public ProductMetricsRecordResponseDto(ProductMetricsRecordDto productMetricsRecordDto) {
		super(productMetricsRecordDto);
		this.meals = new FeElementDto(productMetricsRecordDto.getMealsCount());
		this.menuCreated = new FeElementDto(productMetricsRecordDto.getMenuCreated(), productMetricsRecordDto.getMealsCount());
		this.ordersCreated = new FeElementDto(productMetricsRecordDto.getOrderCreated(), productMetricsRecordDto.getMealsCount());
		this.foodReceived = new FeElementDto(productMetricsRecordDto.getFoodReceived(), productMetricsRecordDto.getMealsCount());
		this.shortageFilled = new FeElementDto(productMetricsRecordDto.getShortageFilled(), productMetricsRecordDto.getMealsCount());
		this.leftoverFilled = new FeElementDto(productMetricsRecordDto.getLeftoverFilled(), productMetricsRecordDto.getMealsCount());
		this.feedbackGiven = new FeElementDto(productMetricsRecordDto.getRcFeedbackGiven(), productMetricsRecordDto.getMealsCount());
		this.mealUuid = productMetricsRecordDto.getMealUuid();
		this.mealName = productMetricsRecordDto.getMealName();
	}
}
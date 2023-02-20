package com.stanzaliving.core.food.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.food.dto.request.AdditionalItemsRequestDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderDetailDto {

	private MealType mealType;

	private String mealId;

	private String mealGroup;

	private String mealName;

	private String vendorId;

	private String vendorName;

	private Integer mir;

	@NotNull(message = "Veg Pax are mandatory")
	private Integer vegPax;

	@NotNull(message = "Non-Veg Pax are mandatory")
	private Integer nonVegPax;

	@Builder.Default
	private Double vegCost = 0d;

	@Builder.Default
	private Double nonVegCost = 0d;

	@NotNull(message = "Stanza Staff Pax are mandatory")
	private Integer stanzaStaffVegPax;

	@Builder.Default
	private Integer stanzaStaffNonVegPax = 0;

	@Builder.Default
	private Double stanzaStaffVegCost = 0d;

	@Builder.Default
	private Double stanzaStaffNonVegCost = 0d;

	@NotNull
	private Integer nonStanzaStaffVegPax;

	private Integer nonStanzaStaffNonVegPax;

	@Builder.Default
	private Double nonStanzaStaffVegCost = 0d;

	@Builder.Default
	private Double nonStanzaStaffNonVegCost = 0d;

	@Builder.Default
	private Double additionalItemsCost = 0d;

	@Builder.Default
	private Double totalCost = 0d;

	private Integer sequence;

	private List<AdditionalItemsRequestDto> additionalItemsDtos;

	private List<FoodOrderBasePreferenceDto> foodOrderBasePreferenceDto;

	@Builder.Default
	private Double plannesUtilization = 0d;

	@Builder.Default
	private Double actualUtilization = 0d;

	private boolean packaged;

	private String comments;

	@Builder.Default
	private boolean extraFoodOrderWindowClosed = true;

	private Date extraFoodOrderWindowCloseTime;

	private boolean foodOrderWindowClosed;

	private LocalDate foodOrderWindowCloseDate;

	private LocalTime foodOrderWindowCloseTime;

	private LocalDate cutoffDate;

	private LocalTime cutoffTime;

	@Builder.Default
	private boolean cutOffTimeExpired = true;

	private UserPreferenceCountDto userPreferenceCountDto;

	@Builder.Default
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<ExtraFoodOrderDetail> slStaffDetails = new ArrayList<>();

}

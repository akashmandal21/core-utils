/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.stanzaliving.campaign.dto.request.FoodFeedbackCampaignRequestDto;
import com.stanzaliving.campaign.dto.request.GenericCampaignRequestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "categoryName", visible = true)
//@JsonSubTypes({
//		@JsonSubTypes.Type(value = AuditCategoryDto.class, name = "audit"),
////		@JsonSubTypes.Type(value = BuildMaintenanceCategoryDto.class, name = "FOOD_FEEDBACK"),
//		@JsonSubTypes.Type(value = EquipmentRentalCategoryDto.class, name = "equipment"),
//		@JsonSubTypes.Type(value = FoodCategoryDto.class, name = "food"),
//		@JsonSubTypes.Type(value = HouseKeepingCategoryDto.class, name = "hk"),
//		@JsonSubTypes.Type(value = InternetCategoryDto.class, name = "internet"),
//		@JsonSubTypes.Type(value = LaundryCostCategoryDto.class, name = "laundry"),
//		@JsonSubTypes.Type(value = OeCategoryDto.class, name = "oe"),
//		@JsonSubTypes.Type(value = PersonnelCategoryDto.class, name = "personnel"),
//		@JsonSubTypes.Type(value = RcCategoryDto.class, name = "rc"),
////		@JsonSubTypes.Type(value = RepairAndMaintenanceCategoryDto.class, name = "repair"),
//		@JsonSubTypes.Type(value = RepairCategoryDto.class, name = "repair"),
//		@JsonSubTypes.Type(value = SecurityCategoryDto.class, name = "security"),
//		@JsonSubTypes.Type(value = SubscriptionAndSuppliesCategoryDto.class, name = "subscription"),
//		@JsonSubTypes.Type(value = TransportCategoryDto.class, name = "transport"),
//		@JsonSubTypes.Type(value = UtilitiesCategoryDto.class, name = "utilities")
//})
public abstract class CategoryDto implements Cloneable {

	protected String categoryName;
	protected int costPerAvailableBed;
	protected int costPerOccupiedBed;
	protected double contribution;

	@Builder.Default
	protected boolean enabled = true;		//default all services enabled

	public void clearValues() {
		this.costPerAvailableBed = 0;
		this.costPerOccupiedBed = 0;
		this.contribution = 0d;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}

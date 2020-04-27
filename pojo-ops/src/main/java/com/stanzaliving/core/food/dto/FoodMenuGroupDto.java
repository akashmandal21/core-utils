/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodMenuStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 23-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuGroupDto extends AbstractDto {

	private String microMarketId;

	private String microMarketName;

	private String menuCategoryId;

	private String menuCategoryName;

	private LocalDate weekStartDate;

	private List<DateWiseFoodMenuDto> dateWiseFoodMenus;

	private boolean compositionRulesSatisfied;

	private boolean budgetUtilizationInLimit;

	private boolean vendorSelected;

	private FoodMenuStatus menuStatus;

	private boolean editingAllowed;

	private String residenceIds;

	private String submittedBy;

	private Date submittedAt;
}
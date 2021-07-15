package com.stanzaliving.food.v2.menu.dto;


import com.stanzaliving.approval.dto.ApprovalListingDto;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.menu.constants.MenuStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuSearchRDto extends AbstractDto {
	private static final long serialVersionUID = 726075754816567584L;
	private String vendorId;
	private String cityId;
	private String cityName;
	private String vendorName;
	private LocalDate startDate;
	private String categoryUuid;
	private String versionId;
	private String categoryId;
	private MenuType menuType;
	private FoodServeType foodServeType;
	private String mealWiseName;
	private String fullName;
	private Double mealPrice;
	private ApprovalStatus approvalStatus;
	private List<String> pendingApprovers;
	private List<UserContactDetailsResponseDto> pendingUsers;
	private ApprovalListingDto approvalData;
	private Date approvalRequestedOn;
	private String approvalRequestedBy;
	private MenuStatus menuStatus;
	private Double menuRating;
	private Double mmRating;
	private boolean rulesViolated;
	private int fpsScore;
	private boolean fpsScorePassed;
	private boolean newnessAdherence;
	private Double currentWeekBudget;
	private Double currentWeekCogs;
	private int currentWeekBudgetDeviation;
	private Double mtdBudget;
	private Double mtdCogs;
	private int mtdBudgetDeviation;
	private Long mealsWithRatingLessThanFour;
	private Long dayWithRatingLessThanFour;
	private Double averageRating;
	private String multiOptionMeals;
	private String menuWeek;
	private Integer averageMIR;
	private List<MicromarketRDto> micromarkets;
}

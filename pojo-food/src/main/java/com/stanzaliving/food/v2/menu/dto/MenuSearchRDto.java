package com.stanzaliving.food.v2.menu.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
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
	private String vendorId;
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
	private Date approvalRequestedOn;
	private String approvalRequestedBy;
	private MenuStatus menuStatus;
	private Double menuRating;
	private Double mmRating;
	private boolean rulesViolated;
	private int fpsScore;
	private boolean fpsScorePassed;
}

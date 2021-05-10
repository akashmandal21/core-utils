package com.stanzaliving.food.v2.menu.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.menu.constants.MenuStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
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
	private String mealWiseName;
	private String fullName;
	private Double mealPrice;
	private ApprovalStatus approvalStatus;
	private List<String> pendingApprovers;
	private MenuStatus menuStatus;
	private Double menuRating;
	private Double mmRating;
	private boolean rulesViolated;
}

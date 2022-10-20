package com.stanzaliving.food.v2.menu.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.food.v2.menu.constants.MenuStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuSearchPDto {

	private String vendorId;

	private String cityId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;

	private boolean residenceView;

	private List<String> residenceIds;

	private MenuStatus menuStatus;

	private List<ApprovalStatus> approvalStatus;

	private Boolean rulesViolated;

	private Boolean approvalDashboard;

	private Boolean approvalDataRequired;

	private String name;

}

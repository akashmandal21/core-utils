package com.stanzaliving.banner.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import com.stanzaliving.banner.dto.request.SpecificUsersOf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PromotionResponseDto implements Comparable<PromotionResponseDto> {
	
	private Long id;
	
	private String uuid;
	
	private String createdBy;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

	private String updatedBy;
	
	private Long dashboardId;
	
	private String promotionName;

	private String promotionIcon;
	
	private String promotionIconName;

	private Integer priorityOrder;

	private Boolean isForAllUsers;
	
	private Boolean isForUsersCsvfile;
	
	private Boolean isForSpecificLocations;
	
	private String userListFilePath;
	
	private Boolean isSchedule;

	private LocalDateTime scheduledDate;

	private Boolean isActive;
	
	private Boolean isDraft;

	private LocalDateTime expiryDate;

	private int totalCreatives;
	
	private List<CreativeResponseDto> creatives;
	
	private SpecificUsersOf specificUsersOf;

	@Override
	public int compareTo(PromotionResponseDto secondDto) {

		int compareTo = this.getPriorityOrder().compareTo(secondDto.getPriorityOrder());
		
		if(compareTo == 0)
			return this.getCreatedAt().compareTo(secondDto.getCreatedAt());
		
		return compareTo;
	}
}

package com.stanzaliving.banner.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardEntityResponseDto {

	private Long id;

	private String uuid;

	private String createdBy;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	private String updatedBy;

	private String appPage;

	private String pageSection;

	private String sectionType;

	private String creativeDimensions;

	private String creativeFileSize;

	private int promotionsLive;
}

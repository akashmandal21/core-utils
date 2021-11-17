package com.stanzaliving.gamificationservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.gamificationservice.enums.ContestStatus;
import lombok.*;

import java.time.LocalDate;

/**
 * @author Keshav Singh
 * @date 10/28/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestFilterDto {

	private String uuid;

	private String description;

	private String contestTitle;

	private String createdBy;

	private int duration;

	private LocalDate startDate;

	private LocalDate endDate;

	private LocalDate dateOfJoining;

	private String contestType;

	private String contestTypeId;

	private String location;

	private String zone;

	private String cluster;

	private String pair;

	private ContestStatus contestStatus;

	private PaginationRequest pageRequest;
}

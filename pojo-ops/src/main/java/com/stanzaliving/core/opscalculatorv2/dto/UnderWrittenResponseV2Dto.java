package com.stanzaliving.core.opscalculatorv2.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.constants.UnderwrittenTemplate;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UnderWrittenResponseV2Dto extends UnderWrittenV2Dto {

	private UnderwrittenTemplate underWrittenTemplateId;

	private String underWrittenUuid;

	@NotBlank(message = "ServiceMixUuid can't be blank")
	private String serviceMixUuid;

	@NotBlank(message = "ResidenceUuid can't be blank")
	private String residenceUuid;

	private UnderWrittenStatus currentStatus;

	@NotNull(message = "FinalStatus can't be null")
	private UnderWrittenStatus finalStatus;

	@NotNull(message = "fromDate can't be null")
	private LocalDate fromDate;

	@NotNull(message = "toDate can't be null")
	private LocalDate toDate;

	private LocalDate plannedHotoDate;

	private LocalDate actualHotoDate;

	@NotNull(message = "RoomCount can't be null")
	@Min(value = 1)
	private Integer roomCount;

	@NotNull(message = "BedCount can't be null")
	@Min(value = 1)
	private Integer bedCount;

	private ResidenceBrand residenceBrand;

	@NotBlank(message = "SeasonUuid can't be blank")
	private String seasonUuid;

	private String versionName;

	private Integer versionNumber;

	@NotBlank(message = "CommentUuid can't be blank")
	private String commentUuid;

	private String approvedCommentUuid;

	private ApprovalStatus approvalStatus;

	@Builder.Default
	protected List<LocalDate> holidays = new ArrayList<>();

	protected List<LocalDate> specialDays;

}

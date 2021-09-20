package com.stanzaliving.housekeepingservice.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 8/5/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPlansDto {
	private String uuid;

	private String planningTemplateId;

	private List<String> shiftAllocationIds;

	private String createdBy;

	private Date createdDate;
}

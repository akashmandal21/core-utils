package com.stanzaliving.housekeepingservice.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 8/19/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPersonDto {

	private String uuid;

	private String person;

	private String day;

	private List<String> shiftAllocationId = new ArrayList<>();

	private String taskId;

	private String createdBy;

	private Date createdDate;

}

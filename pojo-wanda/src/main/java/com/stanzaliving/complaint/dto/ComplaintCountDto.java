package com.stanzaliving.complaint.dto;

import com.stanzaliving.complaint.enums.EnumComplaintStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class ComplaintCountDto {

	private EnumComplaintStatus value;

	private Long count;
}
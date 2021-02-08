package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.dtos.StudentDetailDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StudentDetailResponse {

	private StudentDetailDto student;
	private String message;
	private boolean status;
}

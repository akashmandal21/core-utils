package com.stanzaliving.wanda.response;


import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.wanda.enums.ResidentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomMateDetailsResponseDto {

	private String firstName;
	private String middleName;
	private String lastName;
	private String profilePic;
	private String gender;
	private Integer age;
	private String companyName;
	private String educationalInstitute;
	private String educationalInstituteId;
	private String degree;
	private String degreeId;
	private String course;
	private String courseId;
	private String batch;
	private Address address;
	private ResidentType residentType;
}

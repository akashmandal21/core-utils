package com.stanzaliving.wanda.response;

import java.util.Date;

import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.transformations.ui.pojo.Country;
import com.stanzaliving.website.request.dto.AddressRequestDTO;
import com.stanzaliving.website.response.dto.AddressResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetailsResponseDto {
	private String userUuid; 
	private String studentIdd;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String nationality;
	private Date dateOfBirth;
	private Gender gender;
	private String cityUuid;
	private String cityName; 
	private String micromarketUuid; 
	private String micromarketName; 
	private String residenceUuid; 
	private String residenceName; 
	private AddressResponseDTO address;
	private AddressResponseDTO localGuardianAddress;
	private String bookingUuid; 
	private int bookingId;
	private String bookingStatus;
	private Date moveInDate;
	private Date contractStartDate;
	private Date contractEndDate;
}

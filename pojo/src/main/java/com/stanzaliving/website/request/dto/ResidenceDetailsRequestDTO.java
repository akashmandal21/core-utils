package com.stanzaliving.website.request.dto;

import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceDetailsRequestDTO {

	private int residenceId;
	private String name;
	private Gender gender;
	private int micromarketId;
	private String micromarketName;
	private int cityId;
	private String cityName;
	private String residenceType;
	private String mobileNo;
	private String phoneNo;
	private Integer preBookingAmount;
	private Integer unlockDiscountAmount;
	private Integer sortOrder;
	private boolean virtualTour;
	private Integer cardCTAId;
	private String cardCTAName;
	private Integer leadFormModeId;
	private String leadFormModeName;
	private FomoTag fomoTag;
	private String virtualTourImage;
	private String videoLink;
}

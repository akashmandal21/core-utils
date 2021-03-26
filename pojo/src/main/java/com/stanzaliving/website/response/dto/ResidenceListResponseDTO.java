package com.stanzaliving.website.response.dto;

import java.io.Serializable;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;
import com.stanzaliving.website.enums.Status;

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
public class ResidenceListResponseDTO implements Serializable {

	private static final long serialVersionUID = 1635296868115644218L;
	
	private int residenceId;
	private String name;
	private int micromarketId;
	private String micromarketName;
	private int cityId;
	private String cityName;
	private Gender gender;
	private String genderName;
	private Integer preBookingAmount;
	private FomoTag fomoTag;
	private String fomoTagName;
	private String fomoTagcolour;
	private int priorityOrder;
	private boolean enabled;
	private String slug;
	private String residenceType;
	private String mobileNo;
	private String phoneNo;
	private String virtualTourImage;
	private boolean virtualTour;
	private String cardCTA;
	private String genderSlug;
	private String citySlug;
	private String micromarketSlug;
	EnumListing<PropertyEntityType> propertType;
	
	
}

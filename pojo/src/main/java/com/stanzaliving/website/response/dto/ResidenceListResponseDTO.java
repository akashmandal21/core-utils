package com.stanzaliving.website.response.dto;

import java.io.Serializable;

import com.stanzaliving.core.enums.PropertyEntityType;
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
public class ResidenceListResponseDTO implements Serializable {

	private static final long serialVersionUID = 1635296868115644218L;
	
	private int residenceId;
	private String name;
	private String slug;
	private int micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private int cityId;
	private String cityName;
	private String citySlug;
	private Gender gender;
	private String genderName;
	private String genderSlug;
	private Integer preBookingAmount;
	private Integer unlockDiscountAmount;
	private int startingPrice;
	private FomoTag fomoTag;
	private String fomoTagName;
	private String fomoTagcolour;
	private int sortOrder;
	private boolean enabled;
	private String cardCTA;
	private String propertyCode;
	private String floorNumber;
	private Double area;
	
	private PropertyEntityType propertyEntityType;
}

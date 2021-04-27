package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadRequestDto {

	private Integer leadId;
	private String firstName;
	private String lastName;
	private String email;
	
	private String phone;
	private String otp;
	
	private boolean phoneVerified;

	private String leadSource;
	private String source;
	
	private int residenceId;
	private String residenceName;
	private String residenceNameUuid;

	private String leadOwnerId;

	private Integer cityId;
	private String cityName;
	private String cityNameUuid;

	private Integer micromarketId;
	private String micromarketName;
	private String micromarketNameUuid;

	private String micromarketAliasName;

	private String otherMicromarketName;

	private String referralCode;

	private String durationOfStay;

	private String durationTime;
	private String college;
	private String occupancy;
	private String leadType;
	private String stanzaPOCEmail;
	private String qualification;
	private String status;
	private String zohoId;
	private String zohoStatus;
	
	private String referralId;
	private String referralCategory;
	private String utmSource;
	private String utmMedium;
	private String utmCampaign;
	private String utmTerm;
	private String utmAdgroup;
	private String gclId;
	private String utmContent;
	private String utmTarget;
	private String utmAdformat;
	private int commissionEarned;
	
	private String gender;
	private String profession;
	private String dateOfVisit;
	private String moveInDateRange;
	
	private int leadModeId;
	private String leadMode;
	private String leadSubMode;
	private String moveInDate;
	private Double reserveAmount;

	private String category;
	private String fbclId;
	private String creative;
	private String gClientId;
	private String gSessionId;
	
	
	@Default
	private boolean lastQuestion = false;

	@Default
	private boolean isHotLead = false;
	@Default
	private boolean whatsappnotification = false;
	@Default
	private boolean qrCodeFlag = false;
	
	private boolean leadQualificationForm;
	
	@Default
	private boolean otpVerified = false;

}

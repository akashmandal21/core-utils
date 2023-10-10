package com.stanzaliving.website.response.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.stanzaliving.website.enums.SeoUrlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeadRequestDto implements Serializable {

	private static final long serialVersionUID = 1L;

	//private Integer leadId;
	private Long leadId;
	private String leadUuid;

	private String redisUuidKey;
	private String abVersion;

	private String userIpAddress;
	
	private String firstName;
	private String lastName;
	private String email;
	private String leadEmail;
	private String phone;
	private String otp;

	private boolean phoneVerified;

	private String leadSource;
	private String leadCreationInterface;
	private String source;
	private String leadSourceDesc;
	private int residenceId;
	private String residenceName;
	private String residenceNameUuid;

	private String leadOwnerId;
	
	private String createdBy;
	private String visitScheduledBy;

	private Integer cityId;
	private String cityName;
	private String cityNameUuid;

	private Integer micromarketId;
	private String micromarketName;
	private String micromarketNameUuid;

	private String cityUuid;
	private String micromarketUuid;
	private String residenceUuid;
	
	private String micromarketAliasName;

	private String otherMicromarketName;

	private String referralCode;

	private String durationOfStay;

	private String preBookingDate;

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

	@JsonAlias("gclid")
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

	private Integer preBookingAmount;
	private Integer unlockDiscountAmount;

	private String category;
	private String fbclId;
	private String creative;

	@JsonProperty("gClientId")
	private String gClientId;

	@JsonProperty("gSessionId")
	private String gSessionId;

	private String razorpayPaymentId;

	private String razorPayOrderId;

	private String razorpaySignature;

	@Default
	private boolean lastQuestion = false;
	private String errorMessage;
	private int bookingId;
	@Default
	private boolean isHotLead = false;
	@Default
	private boolean whatsappnotification = false;
	@Default
	private boolean qrCodeFlag = false;

	private boolean leadQualificationForm;

	@Default
	private boolean otpVerified = false;

	@Default
	private boolean ignoreScheduleVisit = false;

	private String accommodationType;

	private boolean createHotLead;

	private String extendDurationMessage;

	private boolean isLeadBooked;
	
	private Integer placeId;
	private String placeName;

	private String timeSlot;

	private String budget;

	private String platformOs;
	private String preferredLanguage;

	private String seoUrlType;
	private String url;

	private String formSource;
	private String locateMe;

	public String getEmail() {
		return Objects.nonNull(this.email) ? this.email.trim(): null;
	}

	public void setEmail(String email) {
		this.email = Objects.nonNull(email) ? email.trim(): null;
	}

	public String getPhone() {
		return Objects.nonNull(this.phone) ? this.phone.trim(): null;
	}

	public void setPhone(String phone) {
		this.phone = Objects.nonNull(phone) ? phone.trim(): null;
	}
	private String leadTag;
}

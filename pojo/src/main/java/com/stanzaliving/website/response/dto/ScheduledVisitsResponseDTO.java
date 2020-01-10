/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import java.util.Date;

import com.stanzaliving.core.user.enums.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
public class ScheduledVisitsResponseDTO {

	private int leadId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean phoneVerified;
	private String leadOwnerName;
	private int residenceId;
	private String residenceName;
	private String leadOwnerId;
	private MicromarketResponseDTO micromarket;
	private CityResponseDTO city;
	private String college;
	private String occupancy;
	private String leadType;
	private String stanzaPOCEmail;
	private String qualification;
	private String zohoStatus;
	private String status;
	private String source;
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
	private Gender gender;
	private Date visitDate;
	private Date created;
	private int leadModeId;
	private String leadMode;
	private String leadSubMode;
	private boolean cancelledBookingExists;
	private int bookingId;

}
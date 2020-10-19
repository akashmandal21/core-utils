/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.request.dto;

import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ScheduledVisitsRequestDTO {

	private int leadId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean phoneVerified;
	private int residenceId;
	private String residenceName;
	private String leadOwnerId;
	private int micromarketId;
	private String micromarketName;
	private int cityId;
	private String cityName;
	private String college;
	private String occupancy;
	private String leadType;
	private String stanzaPOCEmail;
	private String qualification;
	private String status;
	private String zohoId;
	private String zohoStatus;
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
	private String visitDate;
	private int leadModeId;
	private String leadMode;
	private String leadSubMode;
	private boolean createHotLead;
	private String moveInDate;
	private Double reserveAmount;
	private String category;
	private String fbclId;
	private String creative;
	@Builder.Default
	private Boolean whatsappnotification = false;

}

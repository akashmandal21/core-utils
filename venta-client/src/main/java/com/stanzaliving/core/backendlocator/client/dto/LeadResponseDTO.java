package com.stanzaliving.core.backendlocator.client.dto;

import com.stanzaliving.core.dto.CityResponseDTO;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.website.response.dto.MicromarketResponseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class LeadResponseDTO {

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

    private String category;

    private String fbclId;

    private String creative;

    private int commissionEarned;

    private int prebookingCommission;

    private Gender gender;

    private Date visitDate;

    private Date created;

    private int leadModeId;

    private String leadMode;

    private String leadSubMode;

    private boolean cancelledBookingExists;

    private int bookingId;

    private String razorPayOrderId;

    private String errorMessage;

    private String gClientId;

    private String gSessionId;

    private boolean apiStatus;

    private Date bookedOn;

    private String leadTag;

    private String referralCode;

    // InProgress, Booked, Disqualified, PreBooked
    private String leadStatus;

    private int  preBookedLeadsCount;

    private int bookedLeadsCount;

    private int disquailifiedLeadsCount;

    private int inProgressLeadsCount;

    // booking or pre booking Incentive paid to broker
    private Date paidOn;

    private boolean leadQualificationForm;

}
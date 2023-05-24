package com.stanzaliving.core.security.pv.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentCommonPVDetailsDto {
    
	private String userUuid;
	private String residentFirstName;
	private String residentLastName;
	private String residentName;
    private String residentAge;
    private String residentGender;
    private String residentFatherName;
    private String residentSpouseName;
    private String residentPhoneNumber;
    private String residentCaste;
	private String residentNationality;
	private String residentIdentificationDetail;
	private String residentOccupation;
	private String dateOfLeaving;
    
    
    private String residentPresentAddress;
    private String residentPermanentAddress;
    private String residentRentedAddress;
	
	private String residentPermanentHouseNo;
	private String residentPermanentSociety;
	private String residentPermanentPoliceStation;
	private String residentPermanentDistrict;
	private String residentPermanentState;
	private String residentPermanentPolicePost;
	
	private String residentPresentHouseNo;
	private String residentPresentSociety;
	private String residentPresentPoliceStation;
	private String residentPresentDistrict;
	private String residentPresentState;
	private String residentPresentPolicePost;
		
	private String residentRentedHouseNo;
	private String residentRentedSociety;
	private String residentRentedPoliceStation;
	private String residentRentedDistrict;
	private String residentRentedState;
	private String residentRentedPolicePost;

	private String landlordName;
	private String landlordFatherName;
	private String landlordPhoneNumber;
	
	private String landlordOccupation;
	private String landlordOfficeAddress;
	private String landlordHomeAddress;
	private String landlordHomePoliceStation;
	
	
	private String residentFamilyMemberName1;
	private String residentFamilyMemberAge1;
	private String residentRlationWithFamilyMember1;
	private String residentFamilyMember1Gender;
	
	private String residentFamilyMemberName2;
	private String residentFamilyMemberAge2;
	private String residentRlationWithFamilyMember2;
	private String residentFamilyMember2Gender;
	

	private String residentOfficeName;
	private String residentOfficeAddress;
	
	private String residentCollegeName;
	private String residentCollegeAddress;
	
	private String residentLocalRelativeAddress;
	private String residentLocalRelativeName;
	private String residentLocalRelativeMobile;
	private String residentLocalRelativeIdentifier;
	
	
	
}

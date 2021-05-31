package com.stanzaliving.core.dto;

import com.stanzaliving.core.user.enums.BloodGroup;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.transformations.ui.pojo.Country;
import com.stanzaliving.website.response.dto.AddressResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInventoryDTO {
    private String studentId;

    private int bookingId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private LocalDate dateOfBirth;

    private int homeTownId;

    private String homeTownName;

    private int year;

    private String coachingCenter;

    private String companyName;

    private String designation;

    private Gender gender;

    private AddressResponseDTO address;

    private BloodGroup bloodGroup;

    private String medicalConditions;

    private String primaryGuardianRelationToStudent;

    private String primaryGuardianName;

    private String primaryGuardianMobile;

    private String primaryGuardianEmail;

    private String additionalContactRelationToStudent;

    private String additionalContactName;

    private String additionalContactMobile;

    private String additionalContactEmail;

    private Country country;

    private String localGuardianRelationToStudent;

    private String localGuardianName;

    private String localGuardianMobile;

    private String qrLink;

    private String vaNumber;

    private AddressResponseDTO localGuardianAddress;

    private float numberOfBeds;

    private Date created = new Date();

    private Date updated = new Date();

    private String image;

    private String upiHandle;

    private String userUuid;
}

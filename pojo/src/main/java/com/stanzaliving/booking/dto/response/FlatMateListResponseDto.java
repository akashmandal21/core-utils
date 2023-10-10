package com.stanzaliving.booking.dto.response;

import com.stanzaliving.core.residenceservice.enums.ResidentType;
import com.stanzaliving.core.user.dto.Address;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlatMateListResponseDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private String profilePic;
    private String gender;
    private Integer age;
    private String companyName;
    private String educationalInstitute;
    private String educationalInstituteId;
    private String degree;
    private String degreeId;
    private String course;
    private String courseId;
    private String batch;
    private Address address;
    private ResidentType residentType;
    private String phone;
    private String email;
    private Date moveInDate;
    private Boolean hasActiveBooking;
    private Date invitationSentOn;
}
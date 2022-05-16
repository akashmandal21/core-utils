package com.stanzaliving.core.bookingservice.dto.response;

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
}

package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.user.enums.Gender;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer employeeId;
    private String employeeName;
    private String contactNumber;
    private String email;
    private Gender gender;
    private String designationName;

    @Builder.Default
    private Set<TeamResponseDto> teams = new HashSet<TeamResponseDto>();

    private String imgurl;
    private String about;
    private Integer priority;

}

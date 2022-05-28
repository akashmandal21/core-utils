package com.stanzaliving.core.base.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoommateFilterDto {

    private String name;
    private String collegeName;
    private String degree;
    private String companyName;
    private String city;
    private String gender;
    private int yearOfStudy;
}

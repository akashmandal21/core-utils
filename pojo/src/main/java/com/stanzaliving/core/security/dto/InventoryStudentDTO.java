package com.stanzaliving.core.security.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.dto.CountryDTO;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryStudentDTO {
    private String primaryGuardianRelationToStudent;

    private String primaryGuardianName;

    private String primaryGuardianMobile;

    private String primaryGuardianEmail;

    private String localGuardianMobile;

    private CountryDTO countryDTO;

    private String firstName;

    private String lastName;

    private String phone;

    private Date dateOfBirth;

    private String gender;
}

package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.dto.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentInventoryDTO {
    private String studentId;

    private String bookingId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Date dateOfBirth;

    private AddressResponseDTO address;

    private CountryDTO country;

    private AddressResponseDTO localGuardianAddress;

    private Date created = new Date();

    private Date updated = new Date();

    private String image;

    private String upiHandle;

    private String userUuid;
}
package com.stanzaliving.core.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDTO {
    private int addressId;

    private String line1;

    private String line2;

    private String landmark;

    private int zipCode;

    private String stateId;

    private String stateName;

    private String cityId;

    private String cityName;

    private double latitude;

    private double longitude;
}

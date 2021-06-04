package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.estate_v2.annotation.constraint.DoubleZeroOrNull;
import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyOnboardDto extends AbstractMongoDto {
    @EmptyOrNull(message = "Property name cannot be empty or null")
    @Size(max = 30, message = "Property name should be less than 30 characters")
    private String name;
    @EmptyOrNull(message = " Property type Uuid cannot be empty or null")
    private String propertyTypeUuid;
    @EmptyOrNull(message = "Property type name cannot be empty or null")
    private String propertyTypeName;
    @EmptyOrNull(message = "City Name cannot be empty or null")
    private String cityName;
    @EmptyOrNull(message = "Micro market Name cannot be empty or null")
    private String microMarketName;
    @EmptyOrNull(message = "Property Status cannot be empty or null")
    private String propertyStatus;
    @EmptyOrNull(message = "Status cannot be empty or null")
    private String status;
    @EmptyOrNull(message = "Address cannot be empty or null")
    @Size(max = 200, message = "Address should be less than 200 characters")
    private String address;
    @DoubleZeroOrNull(message = "Latitude cannot be zero or null")
    private Double latitude;
    @DoubleZeroOrNull(message = "Longitude cannot be zero or null")
    private Double longitude;
    private String phoneNumber;
    private String mapLink;
    private String mappedProperty;
    private String color;
}

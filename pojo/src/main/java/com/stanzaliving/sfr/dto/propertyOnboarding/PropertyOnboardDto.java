package com.stanzaliving.sfr.dto.propertyOnboarding;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.sfr.annotation.constraint.DoubleZeroOrNull;
import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.List;

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
    private String propertyTypeName;
    private String parentUuid;
    @EmptyOrNull(message = "City Name cannot be empty or null")
    private String cityName;
    @EmptyOrNull(message = "Micro market Name cannot be empty or null")
    private String microMarketName;
    private String propertyStatus;
    private String statusDescription;
    private String status;
    private Address address;
    @DoubleZeroOrNull(message = "Latitude cannot be zero or null")
    private Double latitude;
    @DoubleZeroOrNull(message = "Longitude cannot be zero or null")
    private Double longitude;
    private String phoneNumber;
    private String mapLink;
    private String mappedProperty;
    private String color;
    private List<PropertyTypeValueDto> propertyTypeValue;
    private String parentName;

}

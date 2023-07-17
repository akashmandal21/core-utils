package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.estate_v2.annotation.constraint.DoubleZeroOrNull;
import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyOnboardDto extends AbstractMongoDto {
    @JsonProperty("name")
    @EmptyOrNull(message = "Property name cannot be empty or null")
    @Size(max = 50, message = "Property name should be less than 50 characters")
    private String name;

    @JsonProperty("propertyTypeUuid")
    @EmptyOrNull(message = " Property type Uuid cannot be empty or null")
    private String propertyTypeUuid;

    @JsonProperty("propertyTypeName")
    private String propertyTypeName;

    @JsonProperty("parentUuid")
    private String parentUuid;

    @JsonProperty("cityName")
    @EmptyOrNull(message = "City Name cannot be empty or null")
    private String cityName;

    @JsonProperty("microMarketName")
    @EmptyOrNull(message = "Micro market Name cannot be empty or null")
    private String microMarketName;

    @JsonProperty("propertyStatus")
    private String propertyStatus;

    @JsonProperty("statusDescription")
    private String statusDescription;

    @JsonProperty("status")
    private String status;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("latitude")
    @DoubleZeroOrNull(message = "Latitude cannot be zero or null")
    private Double latitude;

    @JsonProperty("longitude")
    @DoubleZeroOrNull(message = "Longitude cannot be zero or null")
    private Double longitude;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("mapLink")
    private String mapLink;

    @JsonProperty("mappedProperty")
    private String mappedProperty;

    @JsonProperty("color")
    private String color;

    @JsonProperty("propertyTypeValue")
    private List<PropertyTypeValueDto> propertyTypeValue;

    @JsonProperty("parentName")
    private String parentName;

}

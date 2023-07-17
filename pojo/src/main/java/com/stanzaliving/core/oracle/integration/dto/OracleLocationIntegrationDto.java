package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.transformations.enums.LocationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleLocationIntegrationDto extends AbstractOracleDto {


    @NotNull
    @JsonProperty("stanzaId")
    private String addressUuid;

    @NotNull
    @JsonProperty("name")
    private String name;

    @JsonProperty("sublocationOf")
    private String sublocationOf;

    @JsonProperty("createdat")
    private String locationCreatedAt;

    @NotNull
    @JsonProperty("locationType")
    private LocationType locationType;

    @NotNull
    @JsonProperty("locationIsInactive")
    private Boolean locationIsInactive;

    @JsonProperty("vendorUUID")
    private String locationVendorId;

    @JsonProperty("micromarketUUID")
    private String locationMicromarketId;

    @JsonProperty("updatedat")
    private String locationUpdatedAt;

    @JsonProperty("updatedby")
    private String locationUpdatedBy;

    @JsonProperty("createdby")
    private String locationCreatedBy;

    @JsonProperty("mainAddress_Addressee")
    private String locationName;

    @JsonProperty("mainAddress_Phone")
    private String Phone;

    @JsonProperty("mainAddress1")
    private  String addressLine1;

    @JsonProperty("mainAddress2")
    private String addressLine2;

    @NotNull
    @JsonProperty("mainAddress_city")
    private String addressCity;

    @NotNull
    @JsonProperty("mainAddress_state")
    private  String addressState;

    @NotNull
    @JsonProperty("mainAddress_country")
    private  String addressCountry;

    @NotNull
    @JsonProperty("mainAddress_zip")
    private String pincode;

    /*@JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("documentNumberPrefix")
    private String documentNumberPrefix;

    @JsonProperty("returnAddress_Addressee")
    private String returnAddressLocation;

    @JsonProperty("returnAddress_Phone")
    private String returnAddressPhone;

    @JsonProperty("returnAddress1")
    private String returnAddress1;

    @JsonProperty("returnAddress2")
    private String returnAddress2;

    @JsonProperty("returnAddress_city")
    private  String returnAddressCity;

    @JsonProperty("returnAddress_state")
    private String returnAddressState;

    @JsonProperty("returnAddressCountry")
    private String returnAddressCountry;

    @JsonProperty("returnAddress_zip")
    private  String returnAddressPincode;*/

}

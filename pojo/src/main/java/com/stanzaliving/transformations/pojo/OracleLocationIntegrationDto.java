package com.stanzaliving.transformations.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.transformations.enums.LocationType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
@Builder
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

    @JsonProperty("locationType")
    private LocationType locationType;

    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("documentNumberPrefix")
    private String documentNumberPrefix;

    @NotNull
    @JsonProperty("locationIsInactive")
    private Boolean locationIsInactive;

    @JsonProperty("mainAddress_Addressee")
    private String mainAddress_Addressee;

    @JsonProperty("mainAddress_Phone")
    private String mainAddressPhone;

    @JsonProperty("mainAddress1")
    private  String mainAddress1;

    @JsonProperty("mainAddress2")
    private String mainAddress2;

    @NotNull
    @JsonProperty("mainAddress_city")
    private String mainAddressCity;

    @NotNull
    @JsonProperty("mainAddress_state")
    private  String mainAddressState;

    @NotNull
    @JsonProperty("mainAddress_country")
    private  String mainAddressCountry;

    @NotNull
    @JsonProperty("mainAddress_zip")
    private String mainAddressZip;

    @JsonProperty("returnAddress_Addressee")
    private String returnAddressAddressee;

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
    private  String returnAddressZip;

    @JsonProperty("locationCreatedAt")
    private Date locationCreatedAt;

    @JsonProperty("locationUpdatedAt")
    private Date locationUpdatedAt;

    @JsonProperty("locationCreatedBy")
    private String locationCreatedBy;

    @JsonProperty("locationUpdatedBy")
    private String locationUpdatedBy;

    @JsonProperty("locationVendorId")
    private String locationVendorId;

    @JsonProperty("locationMicromarketId")
    private String locationMicromarketId;






}

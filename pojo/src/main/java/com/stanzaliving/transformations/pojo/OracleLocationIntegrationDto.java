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
    private String name;

    private String sublocationOf;

    private LocationType locationType;

    private Double latitude;

    private Double longitude;

    private String documentNumberPrefix;

    @NotNull
    private Boolean locationIsInactive;

    private String mainAddress_Addressee;

    private String mainAddress_Phone;

    private  String mainAddress1;

    private String mainAddress2;

    @NotNull
    private String mainAddress_city;

    @NotNull
    private  String mainAddress_state;

    @NotNull
    private  String mainAddress_country;

    @NotNull
    private String mainAddress_zip;

    private String returnAddress_Addressee;

    private String returnAddress_Phone;

    private String returnAddress1;

    private String returnAddress2;

    private  String returnAddress_city;

    private String returnAddress_state;

    private String returnAddress_country;

    private  String returnAddress_zip;

    private Date locationCreatedAt;

    private Date locationUpdatedAt;

    private String locationCreatedBy;

    private String locationUpdatedBy;

    private String locationVendorId;

    private String locationMicromarketId;






}

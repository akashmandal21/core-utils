package com.stanzaliving.core.projectservice.dto;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyInfoDto {
    private String propertyUuid;
    private String propertyName;
    private String estateName;
    private Long cityId;
    private String cityName;
    private String micromarketName;
    private Long micromarketId;
    private LocalDate liveDate;
    private BrandName brandName;
    private SubBrandName subBrandName;
    private GenderAllowed gender;
    private Double leasedArea;
    private int bdBedCount;
    private int roomCount;

    private String addressLine1;
    private String addressLine2;
    private String landmark;
    private String postalCode;
    private String bdUserId;
    private double latitude;
    private double longitude;
}

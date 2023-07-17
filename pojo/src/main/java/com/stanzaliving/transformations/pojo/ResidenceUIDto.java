package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.enums.PropertyDealType;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.core.estate.enums.EstateGender;
import com.stanzaliving.internet.enums.InternetVendor;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceUIDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private long allowedVisitDays;

    @NotBlank(message = "Residence UUID is Mandatory")
    private String uuid;

    @NotBlank(message = "Residence Name is Mandatory")
    private String residenceName;

    private Long cityId;

    @NotBlank(message = "Residence City is Mandatory")
    private String cityUuid;

    private String cityName;

    private Long microMarketId;

    @NotBlank(message = "Residence Micro Market is Mandatory")
    private String microMarketUuid;

    private String microMarketName;

    @NotNull(message = "Residence Type is Mandatory")
    private ResidenceType residenceType;

    @NotNull(message = "Residence Brand is Mandatory")
    private ResidenceBrand brandName;

    @NotNull(message = "Residence Gender is Mandatory")
    private EstateGender estateGender;

    private boolean status;

    @NotNull(message = "Residence Number of Beds is Mandatory")
    @Min(value = 1, message = "Number of Beds cannot be less than 1")
    private Integer numberOfBeds;

    @NotNull(message = "Residence Number of Rooms is Mandatory")
    @Min(value = 1, message = "Number of Rooms cannot be less than 1")
    private Integer numberOfRooms;

    private Integer coreResidenceId;

    private String coreResidenceName;

    private CityUIDto cityUIDto;

    private MicroMarketUIDto microMarketUIDto;

    private String parentResidenceId;

    private PropertyEntityType propertyEntityType;

    private String estateUuid;

    private String phoenixPropertyUuid;

    private Double premiseArea;

    private String apartmentFloorNumber;

    private Double latitude;

    private Double longitude;

    private String code;

    private String category;

    private String company;

    private String addressUuid;

    private String addressLine1;

    private String addressLine2;

    private String apartmentType;

    private InternetVendor internetVendor;

    private PropertyDealType propertyDealType;

}
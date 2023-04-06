package com.stanzaliving.website.response.dto;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.LocationType;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationListResponseDTO extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private LocationType locationType;
    private String locationTypeName;
    private String slug;
    private double latitude;
    private double longitude;
    private int micromarketId;
    private String micromarketName;
    private String micromarketSlug;
    private String apartmentMicromarketSlug;
    private int cityId;
    private String cityName;
    private String citySlug;
    private String apartmentCitySlug;
    private Integer preBookingAmount;
    private Integer unlockDiscountAmount;
}

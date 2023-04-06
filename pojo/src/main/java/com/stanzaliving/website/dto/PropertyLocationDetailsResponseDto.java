package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.LocationType;
import com.stanzaliving.website.response.dto.AddressResponseDTO;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationDetailsResponseDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer sortOrder;
    private String nearbyArea;
    private AddressResponseDTO addressResponseDTO;
    private LocationType locationType;
    private String locationTypeName;
    private String googleMapLink;
    private String seoTitle;
    private String seoContent;
    private String seoDescription;
    private String seoFaq;
    private Integer preBookingAmount;
    private Integer unlockDiscountAmount;
    private int micromarketId;
    private String micromarketName;
    private String micromarketSlug;
    private int cityId;
    private String cityName;
    private String citySlug;
    private Double latitude;
    private Double longitude;
    private String slug;
}

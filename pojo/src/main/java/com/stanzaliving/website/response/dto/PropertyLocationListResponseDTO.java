package com.stanzaliving.website.response.dto;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationListResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long locationId;
    private String name;
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
    private boolean status;
}

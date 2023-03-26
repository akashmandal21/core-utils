package com.stanzaliving.website.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationDetailsResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long locationId;
    private String googleMapLink;
    private String seoTitle;
    private String description;
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

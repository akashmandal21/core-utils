package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LeadFormCityDropDownDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int cityId;
    private String name;
    private String code;
    private String slug;
    private String campaignSlug;
    private String apartmentCitySlug;
    private String iconImageUrl;
    private String iconImageUrlAltTag;
    private int websiteDisplayOrder;
    private boolean enabled;
    private boolean comingSoonPg;
    private boolean comingSoonApartment;
    private String transformationUuid;

    private boolean pgLpDropdownVisible;
    private boolean apartmentLpDropdownVisible;
    private boolean pgWebsiteDropdownVisible;
    private boolean apartmentWebsiteDropdownVisible;
}

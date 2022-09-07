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
    private String iconImageUrl;
    private int websiteDisplayOrder;
    private boolean enabled;
    private boolean comingSoonPg;
    private boolean comingSoonApartment;
    private String transformationUuid;

    @Builder.Default
    private boolean pgLpDropdownVisible = false;
    @Builder.Default
    private boolean apartmentLpDropdownVisible = false;
    @Builder.Default
    private boolean pgWebsiteDropdownVisible = false;
    @Builder.Default
    private boolean apartmentWebsiteDropdownVisible = false;
}

package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LeadFormMicroMarketDropDownDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int micromarketId;
    private String micromarketName;
    private int cityId;
    private String slug;
    private boolean enabled;
    private String campaignSlug;
    private String apartmentMMSlug;
    private boolean comingSoonPg;
    private boolean comingSoonApartment;
    private Integer micromarketAliasId;
    private String micromarketAliasName;
    private String displayName;

    private boolean pgLpDropdownVisible;
    private boolean apartmentLpDropdownVisible;
    private boolean pgWebsiteDropdownVisible;
    private boolean apartmentWebsiteDropdownVisible;
}

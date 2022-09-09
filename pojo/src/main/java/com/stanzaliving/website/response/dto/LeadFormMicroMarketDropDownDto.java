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
    private String name;
    private int cityId;
    private String cityName;
    private String slug;
    private String citySlug;
    private boolean enabled;
    private boolean comingSoonApartment;
    private Integer micromarketAliasId;
    private String displayName;
}

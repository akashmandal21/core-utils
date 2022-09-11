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
    private String slug;
    private boolean enabled;
    private Integer micromarketAliasId;
    private String displayName;
}

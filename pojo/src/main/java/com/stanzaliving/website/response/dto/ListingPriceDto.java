package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListingPriceDto implements Serializable {

    private static final long serialVersionUID = 1L;

    PriceDTO singleRoomPrice;
    PriceDTO entireFlatPrice;
}

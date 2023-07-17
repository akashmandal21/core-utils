package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomMapCardDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String roomId;
    private String name;
    private Integer startingPrice;
    private Integer discountedPrice;
    private Boolean soldOut;
}

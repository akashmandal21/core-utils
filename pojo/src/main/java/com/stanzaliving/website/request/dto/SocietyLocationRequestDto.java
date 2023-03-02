package com.stanzaliving.website.request.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SocietyLocationRequestDto {

    private Long locationId;
    private String googleMapLink;
}

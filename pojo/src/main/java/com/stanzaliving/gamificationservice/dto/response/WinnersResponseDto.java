package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WinnersResponseDto {

    private String uuid;

    private String name;

    private String year;

    private String imageUrl;

    private int points;

    private String contestType;

}

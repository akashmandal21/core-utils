package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.gamificationservice.enums.BadgeType;
import com.stanzaliving.gamificationservice.enums.Type;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BadgesResponseDto {
    private String uuid;

    private String badgeName;

    private String description;

    private Type type;

    private int points;

    private BadgeType badgeType;

    private List<String> contests = new ArrayList<>();


}

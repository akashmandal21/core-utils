package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.gamificationservice.enums.BadgeType;
import com.stanzaliving.gamificationservice.enums.Type;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BadgesRequestDto extends AbstractDto {
    @NotBlank(message = "badge name is Mandatory.")
    private String badgeName;

    private String description;

    private Type type;

    private int points;

    private BadgeType badgeType;

    private List<String> contests = new ArrayList<>();


}

package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.housekeepingservice.enums.AreaTagStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 17-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAreaTagDto {

    @NotBlank(message = "Area tags uuid is Mandatory.")
    private String uuid;

    private String areaCategoryUuid;

    private AreaTagStatus areaTagStatus;
}

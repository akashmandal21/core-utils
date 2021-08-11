package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class AreaResponseDto extends AbstractDto {

    private String areaName;
    private List<String> rooms;
    private List<String> tags;
    private String categoryID;
    private String residenceID;
}

package com.stanzaliving.core.residenceservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoomAttributesListDto {

    private List<AttributesResponseDto> attributes;
    private List<AttributesResponseDto> consumables;
}

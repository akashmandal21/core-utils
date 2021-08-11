package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AreaRequestDto  extends AbstractDto {

    private String areaName;
    private List<String> rooms;
    private List<String> tags;
    private String categoryID;
    private String residenceID;

}

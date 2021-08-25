package com.stanzaliving.generictaskservice.dto;

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
public class AreaCommonDto  extends AbstractDto {

    private String areaName;

    private List<String> tags;

    private Double sizes;

    private Integer cleaningTimeInMinutes;

    private Integer sanitizationTimeInMinutes;

    private String areaRoomId;

    private String areaId;

    //private String areaUuid;

}

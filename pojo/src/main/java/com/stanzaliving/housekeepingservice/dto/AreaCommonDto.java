package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AreaCommonDto{

    @NotBlank(message = "Area name is Mandatory.")
    private String areaName;

    @Min(value = 1, message = "Room size in sqFt must be greater zero")
    private int sizeInSqFt;

    @Min(value = 1, message = "Cleaning time min must be greater than zero")
    private int cleaningTimeInMinutes;

    @NotBlank(message = "Residence uuid is mandatory")
    private String residenceId;

    private String categoryId;

    private String areaCommonUuid;

    @NotBlank(message = "Area tag uuid is mandatory")
    private String areaTagUuid;

    private AreaTagsDto areaTagsDto;

    private AreaCategoryDto areaCategory;

}
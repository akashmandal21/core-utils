package com.stanzaliving.website.response.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomTagDto {

    private String leadUuid;
    private List<CustomTagCategoryDto> categoryDto;
    private String createdBy;
    private String updatedBy;

}
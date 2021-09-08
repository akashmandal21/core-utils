package com.stanzaliving.website.response.dto;

import lombok.Data;

@Data
public class CustomTagCategoryDto {

    private String tagCategory;
    private String tag;
    private String colorCode;
    private String tagUuid;
    private String existingSelectedUuid;
}
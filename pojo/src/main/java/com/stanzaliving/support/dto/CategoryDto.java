package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private int position;
    private String uuid;
    private String name;
    private String description;
    private boolean active;
    private List<SubCategoryDto> subCategories = new ArrayList<>();
}

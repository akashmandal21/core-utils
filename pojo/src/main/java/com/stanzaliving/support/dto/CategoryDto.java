package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto implements Serializable {
    private int position;
    private String uuid;
    private String name;
    private String description;
    private boolean active;
    private int faqCount;
    private List<SubCategoryDto> subCategories = new ArrayList<>();
    private List<ResidenceDto> residences = new ArrayList<>();

    public CategoryDto(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }
}

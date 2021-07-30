package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private String uuid;

    private String parentCategoryUuid;

    @NotBlank(message = "Category name is Mandatory.")
    private String categoryName;

    private List<CategoryDto> subCategoryList;

}

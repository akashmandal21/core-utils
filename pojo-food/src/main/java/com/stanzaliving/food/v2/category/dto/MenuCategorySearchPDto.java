package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategorySearchPDto implements Serializable {
    private List<String> mmIds;
    private List<String> residenceIds;
    private CategoryStatus categoryStatus;
    private String name;
    private List<String> tagId;
    @NotBlank(message = "Empty Vendor Id")
    private String vendorId;
}

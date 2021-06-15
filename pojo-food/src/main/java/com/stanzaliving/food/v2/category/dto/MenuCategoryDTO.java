package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryDTO extends AbstractDto {
    private String categoryId;
    private String vendorId;
    private String vendorName;
    private VendorType vendorType;
    private String publishedVersion;
}

package com.stanzaliving.core.vendor.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class VendorListingDto {
    @EqualsAndHashCode.Include
    private String vendorUuid;

    private String vendorCode;
    private String vendorType;

    private String companyName;

    private String brandName;

    private String itemCategories;

    private String createdBy;

    private Date createdAt;

    private String vendorStatus;

    private String textColor;

    private String backgroundColor;

    private List<UIKeyValue> approverNames;
}

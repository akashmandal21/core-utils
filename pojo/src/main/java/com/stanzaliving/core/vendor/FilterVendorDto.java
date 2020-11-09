package com.stanzaliving.core.vendor;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.vendor.enums.VendorClassification;
import lombok.*;

import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FilterVendorDto {
    private String vendorUuid;
    private Department department;
    private VendorClassification vendorClassification;
    private Collection<String> cityUuids;
    private Collection<String> itemUuids;
    private Collection<String> itemCodes;
    private boolean includeInactive;
}

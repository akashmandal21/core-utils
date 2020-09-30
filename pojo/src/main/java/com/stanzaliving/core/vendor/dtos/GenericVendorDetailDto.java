package com.stanzaliving.core.vendor.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.vendor.enums.VendorStatusEnum;
import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GenericVendorDetailDto {
    private String vendorUuid;

    private String vendorCode;

    private VendorType vendorType;

    private VendorStatusEnum vendorStatus;

    private Department creatorDept;

    private String companyName;

    private String companyWebsite;

    private AddressInformation registeredAddress;

    private String createdBy;

    private String updatedBy;
}

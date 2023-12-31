package com.stanzaliving.core.vendor.dtos;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.vendor.enums.VendorType;
import com.stanzaliving.core.vendor.enums.VendorUpdateType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VendorUpdateInfoDto {
    private String vendorUuid;
    private String vendorCode;
    private VendorType vendorType;
    private Department creatorDept;
    private VendorUpdateType vendorUpdateType;
    private String companyName;
    private List<VendorGstDto> vendorGstDtos;
    private List<VendorPocDto> vendorPocDtos;
    private String cityUuid;
    private String fassai;
    private AddressInformation registeredAddress;
    private AddressInformation communicationAddress;
}

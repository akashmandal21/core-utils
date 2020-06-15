package com.stanzaliving.vendor.model;

import com.stanzaliving.vendor.enums.VendorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VendorDetailsDto {

    private String uuid;

    private VendorType vendorType;

    private String companyName;

    private String vendorName;

    private String companyWebsite;

    private AddressDto registeredAddress;

    private AddressDto communicationAddress;

    private String teamStrength;

    private String servicesOffered;

    private String totalProductionCapacity;

    private String specialMachines;

    private List<String> cities;

    private String createdBy;

    private String updatedBy;

    private Boolean isWarehouse;

    private String mouDocument;

}

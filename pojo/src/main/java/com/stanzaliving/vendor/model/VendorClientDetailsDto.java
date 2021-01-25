package com.stanzaliving.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VendorClientDetailsDto {

    private String uuid;

    private String name;

    private String contactPerson;

    private String contactNumber;

    private String createdBy;

    private String updatedBy;

}

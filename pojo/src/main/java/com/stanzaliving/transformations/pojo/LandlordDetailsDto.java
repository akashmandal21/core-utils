package com.stanzaliving.transformations.pojo;


import com.stanzaliving.core.user.dto.Address;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LandlordDetailsDto {

    private Address landlordAddress;

    private String landlordGSTTin;

    private String landlordId;

    private String landlordName;

    private Double landlordOwnershipPercentage;

    private String landlordOwnershipType;

    private String landlordPanNo;

    private Double landlordRentPaymentPercentage;

    private String landlordMobileNumber;

    private String landlordEmailId;

    private String landlordAadhaar;

}

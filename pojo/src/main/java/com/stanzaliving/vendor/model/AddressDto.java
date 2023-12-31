package com.stanzaliving.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AddressDto {

    private String house;

    private String street;

    private String landmark;

    private String city;

    private String state;

    private String country;

    private String pincode;

    private String landlineNumber;

    private String createdBy;

    private String updatedBy;


    public String getAddress(){
        return getEmptyIfNull(house)+getEmptyIfNull(street)+getEmptyIfNull(landmark)+getEmptyIfNull(city)+getEmptyIfNull(state)+getEmptyIfNull(country)+getEmptyIfNull(pincode);
    }
    public String getEmptyIfNull(String val){
        if(StringUtils.isBlank(val))
            return "";
        else
            return val+",";
    }
}

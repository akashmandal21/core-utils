package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillToDto {
    private String residentUuid;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String email;
    private String phoneNumber;
    private String residenceName;
    private String cityUuid;
    private String cityName;
    private String microMarketUuid;
    private String microMarketName;
    private String residenceUuid;
    private String roomNumber;
    private String residentPostalCode;

    public String getLastName() {
        if(StringUtils.isBlank(this.lastName))
            return "";
        return this.lastName;
    }
}

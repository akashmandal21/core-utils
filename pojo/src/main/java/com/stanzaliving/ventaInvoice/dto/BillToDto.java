package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillToDto {

    private long billToId;
    private String firstName;
    private String lastName;
    private AddressDto address; //doubt with this
    private String email;
    private String phoneNumber;
    private String cityId;
    private String residenceId;
    private String microMarketId;

}

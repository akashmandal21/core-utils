package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillFromDto {
    private String name;
    private AddressDto address;
    private String email;
    private String phoneNumber;
    private String cityId;
    private String gstin;
    private String pan;
    private String cin;
}

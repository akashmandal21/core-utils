package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.transformations.pojo.AddressBookMetaDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResidenceDto implements Serializable {
    private String residenceUuid;
    private String residenceName;
    private AddressBookMetaDto addressBookMetaDto;
}

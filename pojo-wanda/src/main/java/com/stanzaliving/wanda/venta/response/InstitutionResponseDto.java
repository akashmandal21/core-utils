package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.website.response.dto.AddressResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstitutionResponseDto {

	private int id;

	private String institutionId;

	private String name;

	private String code;

	private String pocName;

	private String pocPhone;

	private String pocEmail;

	private AddressResponseDTO address;
}

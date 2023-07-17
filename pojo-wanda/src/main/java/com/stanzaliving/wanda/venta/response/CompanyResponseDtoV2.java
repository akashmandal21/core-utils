package com.stanzaliving.wanda.venta.response;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CompanyResponseDtoV2 {

    private List<CompanyDto> companyResponseDTOList;
}

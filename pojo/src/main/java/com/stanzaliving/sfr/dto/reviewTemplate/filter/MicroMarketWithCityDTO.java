package com.stanzaliving.sfr.dto.reviewTemplate.filter;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MicroMarketWithCityDTO  {
    private String microMarketName;
    private long cityId;
    private String microMarketUuid;

}

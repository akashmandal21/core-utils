package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;


import com.stanzaliving.estate_v2.dto.KeyValueDto;
import lombok.*;

import java.io.Serializable;

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

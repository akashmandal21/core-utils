package com.stanzaliving.transformations.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ActiveMicromarketsByCityRequestDto {
    
    private String cityUuid;
    private String cityName;
}

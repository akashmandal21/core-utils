package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceListRequestDto implements Serializable {

    private Set<String> cityList;

    private Integer pageSize;

    private Integer pageNumber;

    private Set<String> microMarketList;

    private String searchEntity;

    private Set<String> residenceStatus;

    private String type;

}

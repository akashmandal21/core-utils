package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DynamicFilterDTO {

    private Integer orderId;
    private String filterName;
    private String dataSource;
    private String displayType;
    private List<DynamicFiltersAnswersDTO> values;

    public DynamicFilterDTO(Integer orderId,String filterName,String dataSource,String displayType){
        this.orderId = orderId;
        this.filterName = filterName;
        this.dataSource = dataSource;
        this.displayType = displayType;
    }
}

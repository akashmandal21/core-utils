package com.stanzaliving.ruleEngine.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.ruleEngine.dto
 * @date 14/09/23
 * @time 03:59
 * @project_name residence-service
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RuleQueryDto {

    private String location;
    private String category;
    private String entityType;
    private String elasticIndex;
    private String locationType;
    private List<String> entityName;

}
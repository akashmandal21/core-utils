/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class ThenOutput {

    private String id;

    private String outputEntityId;

    private String outputEntityName;

    private List<List<BaseOperation>> values;
}

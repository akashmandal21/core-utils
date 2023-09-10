/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Rule extends BaseOperation{
    private List<Rule> rules;

    private Object ruleStack;

    private AssociationOperatorEnum associationOperator;
}

/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BaseOperation {

    private String left;

    private List<LabelValueObject> right;

    private List<Map<String, String>> withoutLabelValueRight;

    private CriteriaCondition valueOperator;

    private String globalEntityName;

    private String globalEntityId;

    private DataType dataType;

    private UiType uiType;
}
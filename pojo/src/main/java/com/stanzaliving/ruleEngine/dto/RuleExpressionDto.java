/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class RuleExpressionDto implements Serializable {

    private String id;

    private BooleanEnum entityStatus = BooleanEnum.TRUE;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private String ruleName;

    private LabelValueObject ruleEntityType;

    private List<LabelValueObject> ruleLocationType;

    private List<LabelValueObject> location;

    private List<LabelValueObject> entityName;

    private Rule givenRule;

    private List<WhenOutput> whenOutputs;

    private LabelValueObject state;

    private List<LabelValueObject> category ;
}

package com.stanzaliving.sfr.dto.questionTemplate;

import com.stanzaliving.sfr.enumeration.Status;
import com.stanzaliving.sfr.dto.PrivilegesDto;
import com.stanzaliving.sfr.dto.questionTemplate.conditions.MandatoryConditionDto;
import com.stanzaliving.sfr.dto.questionTemplate.conditions.VisibilityConditionDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagesDto {
    public static String SEQUENCE_NAME = "PAGES_";
    @Id
    private String uuid;
    private String name;
    private String helpText;
    private Integer displayOrder;
    private Status status;
    private String pageIcon;
    private List<ApplicableStatusesDto> applicableStatuses;
    private VisibilityConditionDto visibilityCondition;
    private MandatoryConditionDto mandatoryCondition;
    private PrivilegesDto privileges;
    private Object pageComponent;
}

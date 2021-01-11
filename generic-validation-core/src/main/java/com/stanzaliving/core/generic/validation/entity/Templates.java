package com.stanzaliving.core.generic.validation.entity;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.validation.dtos.TemplateField;
import com.stanzaliving.core.generic.validation.enums.TemplateType;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("templates")
@TypeAlias("templates")
public class Templates extends AbstractMongoEntity {

    @NotBlank
    private String templateOwner;
    private TemplateType templateType;
    private boolean baseTemplate;
    private Integer templateVersion;
    private Map<String,String> templateFilter;
    private String templateName;
    private List<TemplateField> fields;

    //For approval Flows
    private boolean approvable;
    /*
     here assuming the role sequence is L1_Approval, L2_Approval etc.. This is only applicable for Base Template
     */
    private List<Department> approvalDepts;
    private List<Integer> approvalLevels;
}

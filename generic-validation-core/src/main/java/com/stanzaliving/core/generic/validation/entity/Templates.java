package com.stanzaliving.core.generic.validation.entity;

import com.stanzaliving.core.generic.validation.dtos.TemplateField;
import com.stanzaliving.core.generic.validation.enums.TemplateType;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("generic_templates")
@TypeAlias("generic_templates")
public class Templates extends AbstractMongoEntity {

    private String templateOwner;
    private TemplateType templateType;
    private boolean baseTemplate;
    private List<String> approvalRoleHierarchy;
    private Integer templateVersion;
    private Map<String,String> templateFilter;
    private String templateName;
    private boolean approvable;
    private String approvalEnum;
    private List<TemplateField> fields;

}

package com.stanzaliving.legal_v2.DTO.PropertyType;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.core.projectservice.enums.PropertyStatus;
import com.stanzaliving.core.user.acl.enums.Role;
import com.stanzaliving.estate_v2.enumeration.Module;
import com.stanzaliving.estate_v2.enumeration.Status;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePropertyTypeDto extends AbstractMongoDto {
    private String name;
    private String description;
    private Status propertyTypeStatus;
    private ParentUuidName parent;
    private List<Role> roles;
    private List<Module> modules;
    private List<PropertyStatus> propertyStatuses;
    private List<PropertyTypeDetails> propertyTypeDetails;
    private AdditionalMetaData additionalMetaData;
    private String camundaFlow;
}

package com.stanzaliving.estate_v2.dto.propertyType;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PropertyTypeDto extends AbstractMongoDto {
    @EmptyOrNull(message = "Property type name cannot be empty or null")
    private String name;

    private String description;
    private ParentUuidNameDto parent;

    @EmptyOrNull(message = "Status cannot be empty or null")
    private String status;

    @Size(min = 1,message = "Roles cannot be less than 1")
    @NotNull(message = "Roles cannot be null")
    private List<@Valid PropertyTypeRoleDto> roles;

    @Size(min = 1,message = "Modules cannot be less than 1")
    @NotNull(message = "Modules cannot be null")
    private List<ModuleDto> modules;

    @Size(min = 1,message = "Property-Status cannot be less than 1")
    @NotNull(message = "Property-Status cannot be null")
    private List<@Valid PropertyStatusDto> propertyStatuses;

    @Size(min = 1,message = "Property-Type-Details cannot be less than 1")
    @NotNull(message = "Property-Type-Details cannot be null")
    private List<@Valid PropertyTypeDetailsDto> propertyTypeDetails;

    private AdditionalMetaDataDto additionalMetaData;
}

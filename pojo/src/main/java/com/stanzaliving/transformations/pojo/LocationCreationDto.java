package com.stanzaliving.transformations.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class LocationCreationDto implements Serializable {

    private static final long serialVersionUID = -4483658093423365401L;

    @NotBlank
    private String locationName;

    @NotNull
    private AccessLevel accessLevel;

    private String createdByUuid;

}

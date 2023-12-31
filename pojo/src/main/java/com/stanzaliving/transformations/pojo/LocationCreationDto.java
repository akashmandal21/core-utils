package com.stanzaliving.transformations.pojo;

//import lombok.AccessLevel;
import com.stanzaliving.core.base.enums.AccessLevel;
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

    @NotBlank(message = "Location UUID is mandatory")
    private String uuid;
    
    @NotBlank(message = "Location Name is mandatory")
    private String locationName;

    @NotNull(message = "Location Access Level is mandatory")
    private AccessLevel accessLevel;

    private String createdByUuid;

}

package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto extends AbstractDto {

    private static final long serialVersionUID = -4483658093423365401L;

    private String locationName;

    private AccessLevel accessLevel;

}

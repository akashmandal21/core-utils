package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.PropertyEntityType;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImageLibraryDto extends AbstractDto {

    private String imageUrl;

    private boolean genericImage;

    private boolean dummyImage;

    private PropertyEntityType propertyEntityType;

    @Builder.Default
    private boolean clickable = true;
}

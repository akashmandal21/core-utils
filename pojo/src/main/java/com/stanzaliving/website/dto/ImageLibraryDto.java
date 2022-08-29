package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImageLibraryDto extends AbstractDto {

    private String imageUrl;

    private boolean sampleImage;

    @Builder.Default
    private boolean clickable = true;
}

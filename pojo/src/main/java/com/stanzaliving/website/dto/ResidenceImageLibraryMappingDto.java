package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.website.enums.ImageTags;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResidenceImageLibraryMappingDto extends AbstractDto {

    private Long imageLibraryId;

    private String imageUrl;

    private Integer residenceId;

    private String residenceName;

    private String roomNumber;

    private boolean featuredImage;

    private Integer imageOrder;

    private String imageUrlAltTag;

    private ImageTags imageTag;

    private boolean genericImage;

    private boolean dummyImage;
}

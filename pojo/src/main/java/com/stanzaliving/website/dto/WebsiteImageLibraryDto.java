package com.stanzaliving.website.dto;

import com.stanzaliving.website.enums.ImageTags;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WebsiteImageLibraryDto implements Serializable {

    private Long imageLibraryId;

    private String imageUrl;

    private Integer residenceId;

    private String residenceName;

    private String roomNumber;

    private boolean featuredImage;

    private Integer imageOrder;

    private String imageUrlAltTag;

    private ImageTags imageTag;

    public String imageTagName;
}

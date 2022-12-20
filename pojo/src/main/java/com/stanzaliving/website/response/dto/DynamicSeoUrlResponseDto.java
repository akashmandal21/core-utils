package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DynamicSeoUrlResponseDto {

    private int dynamicSeoUrlId;
    private String dynamicSeoUrl;
    private String dynamicSeoTitle;
    private String dynamicSeoDescription;
    private boolean status;
    private boolean locationCheck;
    private EnumListing<PropertyEntityType> dynamicSeoUrlType;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}

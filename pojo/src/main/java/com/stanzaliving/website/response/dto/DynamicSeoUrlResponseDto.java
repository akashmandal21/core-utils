package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DynamicSeoUrlResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long dynamicSeoUrlId;
    private String dynamicSeoUrl;
    private String dynamicSeoTitle;
    private String dynamicSeoDescription;
    private String pageDescription;
    private boolean status;
    private boolean locationCheck;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}

package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.enums.WebsitePageConfigType;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListingPageConfigDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Name field can't be blank")
    private String configName;

    @NotNull
    private PropertyEntityType propertyEntityType;

    private String propertyEntityName;

    @NotNull
    private WebsitePageConfigType websitePageConfigType;

    private String websitePageConfigTypeName;

    private Integer cityId;

    private String cityName;

    private Integer mmId;

    private String micromarketName;

    private boolean configToggle;

    private String config;
}

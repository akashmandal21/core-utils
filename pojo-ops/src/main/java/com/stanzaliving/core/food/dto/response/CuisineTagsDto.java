package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;

import com.stanzaliving.core.food.enums.DemoGraphicsRegion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CuisineTagsDto implements Serializable {

    private static final long serialVersionUID = -196000951739323573L;

    private String uuid;

    private String optionName;

    private String optionType;

    private String cuisineL1;

    private String cuisineL2;

    private DemoGraphicsRegion demographyMapped;

}

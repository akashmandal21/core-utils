package com.stanzaliving.estate_v2.dto.propertyType;


import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.annotation.operation.PostGroup;
import com.stanzaliving.estate_v2.annotation.operation.PutGroup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class PropertyStatusDto {
    private String uuid;

    @EmptyOrNull(message = "Property-Status name cannot be empty or null",groups = PostGroup.class)
    private String name;

    private Boolean enabled;

    @EmptyOrNull(message = "Background-Color cannot be empty or null", groups =PostGroup.class)
    @Size(max = 7,message = "Size of Background-Color cannot be larger than 7", groups = {PostGroup.class, PutGroup.class})
    private String backgroundColor;

    @EmptyOrNull(message = "Text-Color cannot be empty or null",groups =PostGroup.class)
    @Size(max = 7,message = "Size of Text-Color cannot be larger than 7", groups = {PostGroup.class,PutGroup.class})
    private String textColor;
}

package com.stanzaliving.estate_v2.dto.propertyType;


import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.annotation.operation.PostGroup;
import com.stanzaliving.estate_v2.annotation.operation.PutGroup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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

    @Size(min = 1,message = "Pages-Visible cannot be less than 1", groups = PostGroup.class)
    @NotNull(message = "Pages-Visible cannot be null", groups = PostGroup.class)
    private List<String> pagesVisible;

    @Size(min = 1,message = "Modules-Visible cannot be less than 1", groups = PostGroup.class)
    @NotNull(message = "Modules-Visible cannot be null", groups = PostGroup.class)
    private List<String> moduleVisible;
}

package com.stanzaliving.estate_v2.dto.propertyType;


import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.annotation.operation.PostGroup;
import com.stanzaliving.estate_v2.annotation.operation.PutGroup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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

    @Pattern(regexp = "^#([A-Fa-f0-9]{6})$",message = "Invalid Hex Code for Background Color",groups = PostGroup.class)
    @EmptyOrNull(message = "Background-Color cannot be empty or null", groups =PostGroup.class)
    private String backgroundColor;
    @Pattern(regexp = "^#([A-Fa-f0-9]{6})",message="Invalid Hex Code for Text Color",groups = PostGroup.class)
    @EmptyOrNull(message = "Text-Color cannot be empty or null",groups =PostGroup.class)
    private String textColor;
    @Size(min = 1,message = "Modules-Visible cannot be less than 1", groups = PostGroup.class)
    @NotNull(message = "Modules-Visible cannot be null", groups = PostGroup.class)
    private List<String> moduleVisible;
}

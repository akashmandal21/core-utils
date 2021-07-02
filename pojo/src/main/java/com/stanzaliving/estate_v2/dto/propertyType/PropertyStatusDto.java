package com.stanzaliving.estate_v2.dto.propertyType;


import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
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

    @EmptyOrNull(message = "Property-Status name cannot be empty or null")
    private String name;

    private Boolean enabled;

    @Pattern(regexp = "^#([A-Fa-f0-9]{6})$",message = "Invalid Hex Code for Background Color")
    @EmptyOrNull(message = "Background-Color cannot be empty or null")
    private String backgroundColor;
    @Pattern(regexp = "^#([A-Fa-f0-9]{6})",message="Invalid Hex Code for Text Color")
    @EmptyOrNull(message = "Text-Color cannot be empty or null")
    private String textColor;
    @Size(min = 1,message = "Modules-Visible cannot be less than 1")
    @NotNull(message = "Modules-Visible cannot be null")
    private List<String> moduleVisible;
}

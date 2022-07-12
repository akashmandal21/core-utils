package com.stanzaliving.estate_v2.dto.propertyType;


import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import com.stanzaliving.estate_v2.dto.ReportToDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
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

    private int statusOrder;

    private List<String> moduleVisible;
    private String statusDescription;
    private Boolean isTimerEnabled;
    private int deadlineForTimer;
    private List<ReportToDTO> reportTo;
    private String roleName;
    private Boolean isBypassEnabled;
    private String assignedToRoleUuid;
    private String assignedToRoleName;
}

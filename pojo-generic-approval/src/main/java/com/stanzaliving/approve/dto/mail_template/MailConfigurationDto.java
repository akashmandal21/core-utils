package com.stanzaliving.approve.dto.mail_template;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailConfigurationDto {

    @Pattern(regexp = "APPROVED|REJECTED", message = "Action can be either APPROVED or REJECTED")
    private String action;

    private List<String> ccMailLevels;

    //todo : validation for list of enums
    @NotEmpty(message = "toMailLevels cannot be blank")
    private List<String> toMailLevels;

    private boolean attachment;

    public MailConfigurationDto(MailConfigurationDto mailConfigurationDto) {}
}

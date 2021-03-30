package com.stanzaliving.approve.dto.mail_template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailParamsDto {

    @NotNull(message = "Key cannot be null")
    @NotBlank(message = "Key name cannot be blank")
    private String key;

    @NotNull(message = "isMandatory cannot be null")
    @NotBlank(message = "isMandatory name cannot be blank")
    private Boolean isMandatory;
}

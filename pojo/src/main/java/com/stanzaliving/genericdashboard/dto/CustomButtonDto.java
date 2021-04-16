package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.ButtonType;
import com.stanzaliving.genericdashboard.validation.DraftValidation;
import lombok.*;

import javax.validation.constraints.Size;
import javax.validation.groups.Default;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomButtonDto {

    private  Integer buttonNumber;

    private  ButtonType buttonType;

    @Size(
            max = 16,
            message = "cta text can't be more than 16 characters",
            groups = {DraftValidation.class, Default.class})
    private String ctaText;

    private  String ctaRedirectionUrl;
}

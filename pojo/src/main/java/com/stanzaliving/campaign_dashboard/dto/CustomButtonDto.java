package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.ButtonType;
import com.stanzaliving.campaign_dashboard.validation.DraftValidation;

import javax.validation.constraints.Size;
import javax.validation.groups.Default;

public class CustomButtonDto {
    Integer buttonNumber;

    ButtonType buttonType;

    @Size(
            max = 16,
            message = "cta text can't be more than 16 characters",
            groups = {DraftValidation.class, Default.class})
    String ctaText;

    String ctaRedirectionUrl;
}

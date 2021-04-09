package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.TemplateLayout;
import com.stanzaliving.campaign_dashboard.validation.DraftValidation;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import java.util.List;

public class TemplateDetailsDto {
    TemplateLayout templateLayout;

    String imageUrl;

    @Size(
            max = 120,
            message = "Template description can't be more than 120 characters",
            groups = {DraftValidation.class, Default.class})
    String templateDescription;

    @Size(
            max = 36,
            message = "Template title can't be more than 36 characters",
            groups = {DraftValidation.class, Default.class})
    String templateTitle;

    @Valid List<CustomButtonDto> customButtonDetails;

    Long id;
}

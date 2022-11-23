package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.TemplateLayout;
import com.stanzaliving.genericdashboard.validation.DraftValidation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TemplateDetailsDto {

    private TemplateLayout templateLayout;

    private String imageUrl;

    @Size(
            max = 120,
            message = "Template description can't be more than 120 characters",
            groups = {DraftValidation.class, Default.class})
    private String templateDescription;

    @Size(
            max = 36,
            message = "Template title can't be more than 36 characters",
            groups = {DraftValidation.class, Default.class})
    private String templateTitle;

    @Valid
    private List<CustomButtonDto> customButtonDetails;

    private String uuid;
}

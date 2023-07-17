package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.ApprovalValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventImagesDTO {
    private String uuid;

    @NotEmpty(groups = ApprovalValidation.class)
    private String imageUrl;

    @NotNull(groups = ApprovalValidation.class)
    private Long imageOrder;

    @NotNull(groups = ApprovalValidation.class)
    private Boolean isFeatured;

}
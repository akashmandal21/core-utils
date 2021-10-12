package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventCategoryDTO {
    @NotBlank
    private String name;

    private String imageUrl;
}

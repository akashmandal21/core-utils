package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BannerRequestDto {
    private String bannerName;

    @NotBlank(message = "Banner image Url is Mandatory.")
    private String bannerImageUrl;

}

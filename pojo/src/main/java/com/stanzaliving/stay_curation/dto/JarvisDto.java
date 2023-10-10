package com.stanzaliving.stay_curation.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JarvisDto {

    @NotNull(message = "jarvisPlanUuid cannot be null")
    @NotBlank(message = "jarvisPlanUuid cannot be blank")
    private String jarvisPlanUuid;

    @NotBlank(message = "name cannot be blank")
    @NotNull(message = "name cannot be null")
    private String name;

    @NotBlank(message = "residence uuid cannot be blank")
    @NotNull(message = "residence uuid cannot be null")
    private String residenceUuid;

    @NotBlank(message = "category cannot be blank")
    @NotNull(message = "category cannot be null")
    private String category;

    @Pattern(regexp = "ENABLE|DISABLE",
            message = "Invalid approval status type")
    String approvalStatus;
}

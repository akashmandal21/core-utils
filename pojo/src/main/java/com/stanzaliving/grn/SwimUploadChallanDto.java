package com.stanzaliving.grn;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SwimUploadChallanDto {

        @NotBlank(message = "fileUrl cannot be blank")
        private String fileUrl;

        @NotBlank(message = "gsriId cannot be blank")
        private String gsriId;
}

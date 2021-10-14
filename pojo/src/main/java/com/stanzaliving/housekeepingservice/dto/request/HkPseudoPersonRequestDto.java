package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 13-Oct-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkPseudoPersonRequestDto {

    @NotBlank(message = "Hk person name is mandatory")
    private String hkPersonName;

    @NotBlank(message = "Hk Pseudo name is mandatory")
    private String hkPseudoName;

}

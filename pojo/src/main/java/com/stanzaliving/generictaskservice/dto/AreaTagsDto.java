package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 09-Aug-21
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaTagsDto {

    @NotBlank(message = "Area tags name is Mandatory.")
    private String areaTagsName;

    @NotBlank(message = "Category is Mandatory.")
    private String category;

    private boolean status;

    private String uuid;

}

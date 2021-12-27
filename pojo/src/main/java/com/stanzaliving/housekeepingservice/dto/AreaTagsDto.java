package com.stanzaliving.housekeepingservice.dto;

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

    @NotBlank(message = "Area category is Mandatory.")
    private String areaCategory;

    private boolean status;

    private String uuid;

}
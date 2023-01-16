package com.stanzaliving.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidentMenuCategoryDetailsDto {

    private String residenceUuid;
    private String menuCategoryId;
    private String residentCode;
    private String residentName;

}

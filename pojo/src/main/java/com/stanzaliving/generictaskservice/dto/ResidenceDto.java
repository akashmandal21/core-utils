package com.stanzaliving.generictaskservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceDto {

    private String residenceId;
    private List<String> roomIds;

    private String rId;

    private String rName;

    private String microMarketName;

}

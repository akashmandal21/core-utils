package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMicromarketDto implements Serializable {

    private String residenceId;

    private String residenceName;

    private String micromarketId;

    private String micromarketName;

    private boolean enabled;

}
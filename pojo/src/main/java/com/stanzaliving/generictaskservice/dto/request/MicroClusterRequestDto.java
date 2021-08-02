package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MicroClusterRequestDto {

    @NotBlank(message = "micro Cluster Name Cannot be blank")
    private String microClusterName;

    @NotNull(message = "residenceIds Cannot be blank")
    private List<String> residenceIds;

    @NotBlank(message = "state Cannot be blank")
    private String state;

    @NotBlank(message = "city Cannot be blank")
    private String city;


}

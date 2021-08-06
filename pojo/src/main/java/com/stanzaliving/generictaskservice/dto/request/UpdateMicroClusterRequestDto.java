package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMicroClusterRequestDto {
    @NotNull(
            message = "User Id is mandatory to updates user"
    )
    private String uuid;
    private String microClusterName;

    private List<String> residenceIds;

    private String state;

    private String city;

}

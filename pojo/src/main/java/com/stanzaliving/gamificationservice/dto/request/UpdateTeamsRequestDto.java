package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTeamsRequestDto extends AbstractDto {
    @NotNull(
            message = "Teams Id is mandatory to update"
    )
    private String uuid;

    private String teamName;

    private LocalDate dateOfJoining;

    private List<String> users = new ArrayList<>();

    private String location;

    private String zone;

    private String clusterName;

    private String clusterManager;

    private int noOfMembers;

}

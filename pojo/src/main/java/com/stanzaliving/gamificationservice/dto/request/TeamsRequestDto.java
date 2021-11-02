package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TeamsRequestDto extends AbstractDto {
    @NotBlank(message = "team name is Mandatory.")
    private String teamName;

    private LocalDate dateOfJoining;

    private List<String> users = new ArrayList<>();

    private String location;

    private String zone;

    private String clusterName;

    private String clusterManager;

    private int noOfMembers;
}

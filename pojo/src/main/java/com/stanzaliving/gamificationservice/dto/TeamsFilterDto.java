package com.stanzaliving.gamificationservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class TeamsFilterDto {
    private List<String> usersList;
    private String location;
    private String zone;
    private String clusterName;
    private PaginationRequest pageRequest;

}

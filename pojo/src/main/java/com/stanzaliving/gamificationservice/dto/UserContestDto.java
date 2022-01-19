package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.gamificationservice.enums.*;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 11/24/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserContestDto {

    private String uuid;

    private String profileUuid;

    private String participantUuid;

    private int participantType;

    private String contestUuid;

    private List<String> badgesList;

    private int reward;
}

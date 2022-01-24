package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestParticipantUserResponseDto {

    private String profileUuid;

    private String contestUuid;

    private Map<String, String> badgesList;

    private int myPoints;

    private int myRank;

    private String myRankStatus;

    private String userName;

    private String userImage;

    private String userCluster;

}

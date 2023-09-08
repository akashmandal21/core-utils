package com.stanzaliving.residenceservice.Dto;

import com.stanzaliving.core.estate.enums.EstateGender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.residence.dto
 * @date 06/09/23
 * @time 13:50
 * @project_name residence-service
 **/

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomSyncDto {

    private boolean roomConvertible;
    private boolean sellIndividualBeds;

    private String floor;
    private String roomUuid;
    private String roomNumber;
    private String roomStatus;
    private String residenceUuid;

    private Integer occupancy;

    private EstateGender gender;

    private Set<String> attributesUuid;
    private Set<String> consumablesUuid;

}
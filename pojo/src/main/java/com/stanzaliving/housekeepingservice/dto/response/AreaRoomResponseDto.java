package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.housekeepingservice.dto.AreaCategoryDto;
import com.stanzaliving.housekeepingservice.dto.AreaTagsDto;
import lombok.*;

/**
 * @author Vikas S T
 * @date 19-Nov-21
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaRoomResponseDto extends AbstractDto {

    private String areaRoomNumber;

    private String areaRoomUuid;

    private int roomSizeInSqFt;

    private String residenceUuid;

    private String categoryUuid;

    private String areaTagUuid;

    private String areaTagName;

    private boolean attachedWashroom;

    private int bathRoomSizeInSqFt;

    private boolean balcony;

    private int balconySizeInSqFt;

    private int cleaningTimeInMin;

    private double availableBeds;

    private double deadBeds;

    private double totalBeds;

    private double blockedBeds;

    private double occupiedBeds;

    private AreaTagsDto areaTag;

    private AreaCategoryDto areaCategory;

    private String uuid;

    private boolean roomUpdated;
}

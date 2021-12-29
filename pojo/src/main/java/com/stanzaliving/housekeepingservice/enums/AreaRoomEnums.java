package com.stanzaliving.housekeepingservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AreaRoomEnums {
    AREA_ROOM_NUMBER("areaRoomNumber"),
    AREA_TAGS("areaTagName"),
    AREA_TAG_UUID("areaTagUuid"),
    ROOM_SIZE("roomSizeInSqFt"),
    WASHROOM("attachedWashroom"),
    BATHROOM_SIZE("bathRoomSizeInSqFt"),
    BALCONY("balcony"),
    BALCONY_SIZE("balconySizeInSqFt"),
    CLEANING_TIME("cleaningTimeInMin"),
    RESIDENCE("residenceUuid"),
    TAG_CATEGORY("categoryUuid"),
    STATUS("status");
    String name;
}

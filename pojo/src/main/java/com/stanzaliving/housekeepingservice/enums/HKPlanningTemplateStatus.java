package com.stanzaliving.housekeepingservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 02-Aug-21
 **/

@Getter
@AllArgsConstructor
public enum HKPlanningTemplateStatus {
    SAVE,
    PUBLISH,
    DRAFT;
}

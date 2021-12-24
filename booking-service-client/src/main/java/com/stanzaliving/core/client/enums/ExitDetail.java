package com.stanzaliving.core.client.enums;

import com.stanzaliving.core.client.dto.ExitDetailSummaryDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExitDetail {

    MOVE_OUT_DATE("Move-out-date",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625565818/sigma-app/move-out.svg"),
    CLEAR_PENDING_DUES("Clear Pending Dues",
            "https://res.cloudinary.com/stanza-living/image/upload/v1624428653/sigma-app/rupee.svg"),
    ROOM_KEY_HANDOVER("Room Key Handover",
            "https://res.cloudinary.com/stanza-living/image/upload/v1625048062/sigma-app/vpn-key.svg");

    String displayText;
    String icon;

    public static ExitDetailSummaryDto getExitDetail(ExitDetailSummaryDto exitDetailSummaryDto, ExitDetail exitDetail) {
        exitDetailSummaryDto.setDisplayText(exitDetail.getDisplayText());
        exitDetailSummaryDto.setIcon(exitDetail.getIcon());
        return exitDetailSummaryDto;
    }

}

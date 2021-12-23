package com.stanzaliving.core.client.enums;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.client.dto.ExitDetailSummaryDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@AllArgsConstructor
@Log4j2
public enum ExitDetailTags {
    PENDING("PENDING", "#FFB701"),
    PROCESS_COMPLETED("", "#60C3AD"),
    ATTENTION_REQUIRED("", "#F55F71");

    String tagName;
    String tagColor;

    public static ExitDetailSummaryDto getExitDetailTag(ExitDetailSummaryDto exitDetailSummaryDto, ExitDetailTags exitDetailTags) {
        exitDetailSummaryDto.setTag(exitDetailTags.getTagName());
        exitDetailSummaryDto.setTagColor(exitDetailTags.getTagColor());
        return exitDetailSummaryDto;
    }

    public static ExitDetailSummaryDto getCustomExitDetailTag(ExitDetailSummaryDto exitDetailSummaryDto,
                                                              ExitDetailTags exitDetailTags, String tagName) {
        exitDetailSummaryDto.setTag(tagName);
        exitDetailSummaryDto.setTagColor(exitDetailTags.getTagColor());
        return exitDetailSummaryDto;
    }

    public static ExitDetailSummaryDto getExitTagOnHandOverStatus(ExitDetailSummaryDto exitDetailSummaryDto, KeyHandOver keyHandOver){
        switch (keyHandOver){
            case PENDING:
                getExitDetailTag(exitDetailSummaryDto, ExitDetailTags.PENDING);
                break;
            case HANDED_OVER:
                getCustomExitDetailTag(exitDetailSummaryDto, ExitDetailTags.PROCESS_COMPLETED, keyHandOver.getTagText());
                break;
            case KEY_LOST:
                getCustomExitDetailTag(exitDetailSummaryDto, ExitDetailTags.ATTENTION_REQUIRED, keyHandOver.getTagText());
                break;
            default:
                log.error("Invalid Room Key Handover Status {}",keyHandOver);
                throw new StanzaException("Invalid Room Key Handover Status "+keyHandOver);
        }
        return exitDetailSummaryDto;
    }
}

package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TicketActivityTemplatesEnum {

    CREATE_TICKET,
    UPDATED_STATUS_TO,
    MERGED_TICKET_TO,
    SET_CATEGORY_AS,
    SET_HOUSE_AS,
    PRIVATE_NOTE,
    ADDED_PRIVATE_NOTE,
    UPDATE_TICKET,
    ADDED_TAGS,
    REMOVED_TAGS,
    COMPLAINT_SUB_CATEGORY_AS,
    SET_AGENT_AS,
    SET_DESCRIPTION_AS,
    CREATE_SUB_TICKET,
    UPDATED_SUB_TICKET_TO,
    ESCALATED_TICKET_TO,
    OTHER,
    MESSAGE,
    ATTACHMENT,
    ONLY_DATA;
}

package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TicketActivityTemplatesEnum {

    CREATE_TICKET,
    SYSTEM_ASSIGNED_TICKET,
    UPDATED_STATUS_TO,
    UPDATED_TICKET_CHECKLIST,
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
    NAME_UPDATED_TICKET,
    SET_TICKET_STATUS_AS,
    ONLY_DATA,
    UPDATED_SATISFACTION_STATUS,
    ADD_RESOLUTION_RULE,
    UPDATE_RESOLUTION_RULE,
    TEAM_UPDATED,
    ADD_BUSINESS_HOUR,
    CLOSE_TICKET,
    REOPEN,
    CLOSE_TICKET_RESOLUTION,
    FFEDBACK,
    USER_SATISFACTION;
}

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
    ADDED_PRIVATE_NOTE;
}

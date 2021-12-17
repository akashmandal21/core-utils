package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubTicketTaskDto {
    private int position;
    private String uuid;
    private String name;

    public SubTicketTaskDto(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }
}


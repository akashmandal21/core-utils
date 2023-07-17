package com.stanzaliving.support.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketFilterCountDto implements Serializable {

    private String name;

    private String uuid;

    private Long count;

}

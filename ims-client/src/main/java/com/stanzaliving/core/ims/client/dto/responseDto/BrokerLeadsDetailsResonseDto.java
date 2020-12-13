package com.stanzaliving.core.ims.client.dto.responseDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerLeadsDetailsResonseDto {

    private List<Lead> leads;

    private String message;

    private boolean status;
}

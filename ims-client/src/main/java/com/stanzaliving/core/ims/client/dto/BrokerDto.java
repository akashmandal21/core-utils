package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerDto {

    private String name;

    private String mobile;

    private String email;

    private String uuid;

    private Long cityId;

    private String referredBy;
}

package com.stanzaliving.core.ims.client.dto.responseDto;

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
public class BaseResponseDto {

    public int retryCount;

    private Boolean panExists;

    private String message;

    private Boolean status;

}

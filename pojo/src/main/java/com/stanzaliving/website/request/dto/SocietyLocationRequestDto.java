package com.stanzaliving.website.request.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SocietyLocationRequestDto extends AbstractDto {

    private String googleMapLink;
}

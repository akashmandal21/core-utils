package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import java.util.List;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentSearchRequestDto extends AbstractDto {
    private String searchKeyword;

    private List<String> residence;

    private List<String> phoneTypes;
}

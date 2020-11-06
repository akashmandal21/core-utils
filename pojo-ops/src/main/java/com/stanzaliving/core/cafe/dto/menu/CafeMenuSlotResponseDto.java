package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.CafeMenuStateAction;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuSlotResponseDto {
    private static final long serialVersionUID = 1L;
    private Date lastPublished;
    private String lastPublishedBy;

    private CafeMenuStateAction state;
    private LocalDate stateFrom;
    private Map<String, CafeMenuResponseDto> menu;
}

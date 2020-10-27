package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.CafeMenuStateAction;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuResponseDto extends AbstractDto {
    private static final long serialVersionUID = 1L;
    private LocalDate menuDate;
    private Date lastPublished;
    private CafeMenuStateAction state;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String lastPublishedBy;
    private List<CafeMenuItemResponseDto> items;
}

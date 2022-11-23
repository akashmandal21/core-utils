package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ElectricityReadingDtoResponse extends AbstractDto {

    private static final long serialVersionUID = 1167461460045977030L;

    private ElectricityReadingDto previousReading;
    private ElectricityReadingDto currentReading;
    private ElectricityReadingDto nextReading;
}

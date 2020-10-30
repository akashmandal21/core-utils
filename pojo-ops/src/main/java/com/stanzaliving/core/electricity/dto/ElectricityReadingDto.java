package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.ReadingUnitType;
import com.stanzaliving.core.utility.dto.ReadingDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, exclude = { "image" })
public class ElectricityReadingDto extends AbstractDto {

    private static final long serialVersionUID = -1670129756539320124L;

    private Double reading;

    private Date time;

    private String image;

    private ReadingUnitType unitType;
}

package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.MeterType;
import com.stanzaliving.core.utility.dto.MeterDto;
import com.stanzaliving.core.utility.dto.ReadingDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EMeterDto extends AbstractDto {

    private static final long serialVersionUID = -7575068647325350104L;

    private String categoryId;

    private String categoryName;

    @NotBlank(message = "Meter Number Cannot be blank")
    private String number;

    private Date from;

    private Date deactivatedOn;

    private EReadingDto lReading;

    private EReadingDto oReading;

    private Double unitConsumed;

    private Double average;

    private List<EReadingDto> readings;

    private MeterType meterType;

}

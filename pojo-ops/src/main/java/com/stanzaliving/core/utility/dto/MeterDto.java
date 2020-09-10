package com.stanzaliving.core.utility.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterDto extends AbstractDto {
    private String tag;
    @NotBlank(message = "Meter Number Cannot be blank")
    private String number;
    private Date from;
    private ReadingDto lReading;
    private ReadingDto oReading;
    private Double unitConsumed;
    private List<ReadingDto> readings;
}

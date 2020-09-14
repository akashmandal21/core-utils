package com.stanzaliving.core.utility.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ReadingDto extends AbstractDto {
    private Double reading;
    private LocalDate time;
    private String image;
}

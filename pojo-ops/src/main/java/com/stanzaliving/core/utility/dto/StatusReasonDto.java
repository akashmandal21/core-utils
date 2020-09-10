package com.stanzaliving.core.utility.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusReasonDto {
    private Date time;
    @NotBlank(message = "Reason Cannot be blank")
    private String reason;
    private ReadingDto reading;
}

package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourDto {
    private String groupUuid;

    @NotEmpty(message = "primary reference uuid can't be left blank.")
    private List<String> primaryReferenceUuid;

    private List<String> city;

    private List<String> micromarket;

    private List<String> residence;

    private LocalTime StartTime;

    private LocalTime EndTime;

    private LocalTime BufferTime;
    //remove this after frontend integration
    @Builder.Default
    private Boolean isActive = true;
}

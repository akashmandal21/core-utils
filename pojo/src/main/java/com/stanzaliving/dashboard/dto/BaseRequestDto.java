package com.stanzaliving.dashboard.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Log4j2
public class BaseRequestDto implements Cloneable {

    private List<String> cityUuid;

    private List<String> micromarketUuid;

    private List<String> residenceUuid;

    private String accessLevel;

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("Getting CloneNotSupportedException ", e);
            throw new RuntimeException(e);
        }
    }
}

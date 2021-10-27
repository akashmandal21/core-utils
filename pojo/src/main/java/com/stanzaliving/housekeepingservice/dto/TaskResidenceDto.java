package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Priyadarshini MB
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResidenceDto {

        List<String> roomIds;
        String residenceId;
        List<String> commonAreaIds;
}

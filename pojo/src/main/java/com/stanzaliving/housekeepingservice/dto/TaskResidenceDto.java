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

        private List<String> roomIds;

        private String residenceId;

        private String residenceName;

        private List<String> commonAreaIds;
}

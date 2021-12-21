package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Vikas S T
 * @date 18-Dec-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class HkSigmaFilterDto {
    private String microClusterUuid;
    private List<String> residenceUuids;
    private List<String> hkStaffUuids;
    private List<String> taskStatusList;
    private LocalDate date;
}

package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestFiltersDTO {

    private List<RequestStatus> requestStatusList;

    private LocalDate date;

    @NotBlank(message = "Residence UUID cannot be empty")
    private String residenceUuid;

    private int lateByMin;

    private int lateByMax;

    private List<RequestType> requestType;

    private List<Dues> dues;

    private List<GatePassStatus> luggageAllowance;

    private List<Boolean> blanketApproval;

    private List<Boolean> defaulter;

    private List<ActionStatus> actionStatus;

    private List<String> residentUuids;

    private String searchTerm;

    private List<String> city;

    private List<String> micromarket;
}

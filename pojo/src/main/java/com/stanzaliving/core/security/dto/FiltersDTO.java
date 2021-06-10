package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FiltersDTO {

    @NotNull(message = "Date cannot be null")
    private LocalDate date;

    private List<String> resident;

    private List<String> city;

    private List<String> micromarket;

    private List<String> residence;

    private List<Nationality> nationality;

    private List<ActionStatus> actionStatus;

    private Boolean blanketApproval;

    private List<AttendanceFilter> attendance;

    private List<Floor> floor;

    private List<Dues> dues;
}

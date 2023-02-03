package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomizeVasSyncResponse {

    private Set<String> activateVasBookings;

    private Set<String> deactivateVasBookings;

}

package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomizeVasSyncResponse {

    private List<String> activateVasBookings;

    private List<String> deactivateVasBookings;

}

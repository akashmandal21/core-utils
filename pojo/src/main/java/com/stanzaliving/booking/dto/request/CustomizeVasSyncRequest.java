package com.stanzaliving.booking.dto.request;

import com.stanzaliving.operations.enums.ResidentServiceMixAction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomizeVasSyncRequest {

    private String bookingUuid;

    private ResidentServiceMixAction residentServiceMixAction;
}

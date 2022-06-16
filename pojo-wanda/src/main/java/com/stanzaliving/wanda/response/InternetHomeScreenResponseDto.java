package com.stanzaliving.wanda.response;

import com.stanzaliving.internet.response.TopDto;
import com.stanzaliving.internet.response.UserCurrentPlanDetailDto;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternetHomeScreenResponseDto {

    private List<TopDto> internetPlanDetails;

    private UserCurrentPlanDetailDto currentInternetPlanDetails;
}

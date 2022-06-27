package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MoveInDateBannerDto {
    private Boolean showBanner;
    private Date moveInDate;
    private Integer daysLeft;
    private Boolean isFirstAttempt;
}

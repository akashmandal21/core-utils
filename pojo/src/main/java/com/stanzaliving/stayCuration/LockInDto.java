package com.stanzaliving.stayCuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class LockInDto {
    private Integer lockInMonth;
    private Integer lockInDays;
}

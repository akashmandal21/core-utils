package com.stanzaliving.core.bookingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.mutable.MutableInt;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PackagedServiceResponseDto {
    private Set<String> serviceSet;
    private MutableInt feePerMonth;
}

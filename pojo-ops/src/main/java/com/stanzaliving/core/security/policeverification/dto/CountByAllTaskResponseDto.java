package com.stanzaliving.core.security.policeverification.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class CountByAllTaskResponseDto {

    CountResponseDto systemPending;

    CountResponseDto nodalPending;

    CountResponseDto rcPending;

    CountResponseDto legalPending;

    CountResponseDto allPending;

    List<CountByTaskResponseDto>  countByTaskResponseDtoList;
}

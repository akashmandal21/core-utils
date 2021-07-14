package com.stanzaliving.core.far.dto;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockGrnRequestDto {
    private Collection<BlockGrnDto> blockGrnDtoList;
    private String toNumber;
}
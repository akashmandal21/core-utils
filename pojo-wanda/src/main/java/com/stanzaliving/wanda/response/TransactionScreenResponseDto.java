package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.venta.response.TransactionUIResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionScreenResponseDto {

	private List<TransactionUIResponseDto> transactionUIResponseDtos;
	private String total;
}

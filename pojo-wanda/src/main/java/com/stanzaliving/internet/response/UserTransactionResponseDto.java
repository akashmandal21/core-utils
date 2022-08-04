package com.stanzaliving.internet.response;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.stanzaliving.core.enums.DataUnit;
import com.stanzaliving.internet.enums.InternetVendor;
import com.stanzaliving.wanda.enums.TransactionStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserTransactionResponseDto {

	private String userId;

	private String propertyId;

	private Double topUpData;

	@Enumerated(EnumType.STRING)
	private DataUnit dataUnit;

	@Enumerated(EnumType.STRING)
	private InternetVendor internetVendor;

	private String txnId;

	private String pgTxnId;

	private Double txnAmount;

	@Enumerated(EnumType.STRING)
	private TransactionStatus txnStatus;

}

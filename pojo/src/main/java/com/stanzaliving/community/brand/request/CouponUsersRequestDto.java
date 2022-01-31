package com.stanzaliving.community.brand.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CouponUsersRequestDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private long DealId;

	private long couponId;

	private long userUuid;

	private Boolean isRedeemed;

	private boolean brandConfirmation;

}

package com.stanzaliving.core.cafe.dto;

import java.time.LocalDate;
import java.util.Date;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.order.constants.DispatchMode;
import com.stanzaliving.core.cafe.order.constants.OrderStatus;
import com.stanzaliving.core.cafe.order.constants.OrderType;
import com.stanzaliving.core.cafe.order.constants.PaymentType;
import com.stanzaliving.core.cafe.order.constants.ServingMode;
import com.stanzaliving.core.cafe.order.constants.UserType;

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
public class CafeOrderDto extends AbstractDto {

	private static final long serialVersionUID = -5356921205464143957L;

	private String cafeId;

	private String residenceId;

	private String slotId;

	private String orderCode;

	private Date orderTime;

	private LocalDate orderDate;

	private Date deliveryTime;

	private Date expectedDeliveryTime;

	private boolean inRoomDelivery;

	private OrderType orderType;

	private double amount;

	private double gst;

	private double totalAmount;

	private double finalAmount;

	private double finalGst;

	private double finalTotalAmount;

	private OrderStatus orderStatus;

	private ServingMode mode;

	private String deliveryCode;

	private UserType userType;

	private String userId;

	private String phoneNo;

	private PaymentType paymentType;

	private boolean paymentDone;

	private DispatchMode dispatchMode;

	private String dispatchUserId;

	private String dispatchCode;

	private String dispatchSummaryId;

	private String vasOrderId;

	private boolean kotPrinted;

}
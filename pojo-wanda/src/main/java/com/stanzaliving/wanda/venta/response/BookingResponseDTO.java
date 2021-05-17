package com.stanzaliving.wanda.venta.response;

import java.util.Date;
import java.util.List;

import com.stanzaliving.wanda.venta.response.AmountReceivedDto.AmountReceivedDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponseDTO {

	private int bookingId;

	private String temporaryStudentId;

	private String studentId;

	private String firstName;

	private String lastName;

	private String email;

	private String studentPhone;

	private String phone;

	private Date contractStartDate;

	private Date contractEndDate;

	private Date actualContractEndDate;

	private String contractLastNMonthStartDate;

	private Date confirmationDate;

	private Date moveInDate;

	private int contractId;

	private String contractName;

	private double contractMonths;

	private double extendedContractMonths;

	private int paymentTermId;

	private String paymentTermName;

	private int paymentTermInstallments;

	private String chequeNumber;

	private String chequePhoto;

	private String bookingStatus;

	private String roomNumber;

	private String residenceName;

	private int emiMonths;

	private double pendingRent;

	private String rentStatus;

	private Date autoCancelTime;

	private double penalty;

	private String lockIn;

	private List<String> discountMonthList;

	private boolean isRoomConverted;

	private double pendingDues;

	private Date attentionDeadline;

	private Boolean collectPayment;

	private int bookingType;

	private String image;

	private double totalTemporaryInvoiceAmount;

	private String bookingSubStatus;
	private boolean bookingAmountPaid;
	private boolean hasMovedIn;
	private boolean isMoveInAllowed;

	private Double minTokenAmount;

	private Double carryForwardAmount;

	private String contractDuration;

	private int expiryHours;

	private double tokenAmount;
	private double amountPaid;
	
}
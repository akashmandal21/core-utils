package com.stanzaliving.core.inventory_transformations.model;

import com.stanzaliving.inventory.dto.LeegalityParameterDTO;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public enum LeegalityAddendumFieldEnumForWorkingProfessional {

	AGREEMENT_DATE("agreement_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return sdf.format(booking.getContractStartDate());
		}
	},
	RESIDENT_NAME("resident_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return (booking.getStudent().getFirstName() + " "+booking.getStudent().getLastName());
		}
	},
	OLD_RESIDENCE_NAME("old_residence_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return params.getOldResidence().getName();
		}
	},
	OLD_RESIDENCE_ADDRESS("residence_address"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Address address = params.getOldResidence().getAddress();
			StringBuilder billingAddress = new StringBuilder();
			if (address != null) {
				if (address.getLine1() != null)
					billingAddress.append(address.getLine1() + ",");
				if (address.getLine2() != null)
					billingAddress.append(address.getLine2() + ",");
				if (address.getLandmark() != null)
					billingAddress.append(address.getLandmark() + ",");
				billingAddress.append(address.getCity().getName() + ", ");
				billingAddress.append(address.getState().getName() + ", ");
				billingAddress.append(address.getZipCode());
				return billingAddress.toString();
			}
			return "";
		}
	},
	OCCUPANCY_NAME("occupancy_name") {
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getOccupancy().getName();
		}
	},
	NEW_ROOM_NUMBER("new_room_number"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getRoomNumber();
		}
	},
	NEW_RESIDENCE("new_house_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getResidence().getName();
		}
	},
	RESIDENCE_ADDRESS("new_house_address"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Address address = booking.getRoom().getResidence().getAddress();
			StringBuilder billingAddress = new StringBuilder();
			if (address != null) {
				if (address.getLine1() != null)
					billingAddress.append(address.getLine1() + ",");
				if (address.getLine2() != null)
					billingAddress.append(address.getLine2() + ",");
				if (address.getLandmark() != null)
					billingAddress.append(address.getLandmark() + ",");
				billingAddress.append(address.getCity().getName() + ", ");
				billingAddress.append(address.getState().getName() + ", ");
				billingAddress.append(address.getZipCode());
				return billingAddress.toString();
			}
			return "";
		}
	},
	CONTRACT_START_DATE("contract_start_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return sdf.format(booking.getContractStartDate());
		}
	},
	CONTRACT_END_DATE("contract_end_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Date endDate = booking.getActualContractEndDate() == null ? booking.getContractEndDate() : booking.getActualContractEndDate();
			return sdf.format(endDate);
		}
	},
	CONTRACT_PERIOD("contract_tenure_2"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getContractName();
		}
	},
	MOVE_IN_DATE("move_in_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return sdf.format(booking.getMoveInDate() == null ? booking.getContractStartDate() : booking.getMoveInDate());
		}
	},
	OCCUPANCY("occupancy"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getOccupancy().getName();
		}
	},
	PAYMENT_TERM("payment_frequency"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getPaymentTermName();
		}
	},
	MANDATORY_SERVICES("mandatory_services_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<BookingService> bookingService = booking.getBookingServices();
			String servicesName = bookingService.stream().filter(id-> !id.isOptional() && !id.isVas()).map(id-> id.getServiceName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;
		}
	},
	VAS_SERVICES("vas_service_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<BookingService> bookingService = booking.getBookingServices();
			String servicesName = bookingService.stream().filter(id-> id.isVas() && id.isActive()).map(id-> id.getServiceName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;
		}
	},
	RESIDENCE_INVENTORY("inventory_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<Fixtures> fixtures = booking.getRoom().getResidence().getFixtures();
			String servicesName = fixtures.stream().map(id-> id.getName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;
		}
	},
	RESIDENCE_SERVICES("ancillary_services_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<AncillaryServices> services = booking.getRoom().getResidence().getAncillaryServices();
			String servicesName = services.stream().filter(id-> id.isEnabled()).map(id-> id.getName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;			
		}
	},
	TOKEN_DATE("token_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}
	},
	TOKEN_AMOUNT_STRING("token_amount_string"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return "Token Amount";
		}
	},
	TOKEN_AMOUNT("token_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)booking.getBookingCommercials().getAdvanceAmount()).replaceAll("\\.00","");
		}
	},
	ADVANCE_SERVICE_DATE("advance_service_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}
	},
	ADVANCE_SERVICE_STRING("advance_service_string"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return "Advance Service fees";
		}
	},
	ADVANCE_SERVICE_FEES("advance_service_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)(params.getAdvanceRentalMonths()
					* (params.getMandatoryServicePrice() + params.getSgst() + params.getCgst())))
					.replaceAll("\\.00","");
		}
	},
	ADVANCE_LICENSE_DATE("advance_license_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}

	},
	ADVANCE_LICENSE_STRING("advance_license_string"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return "Advance License Fees";
		}
	},
	ADVANCE_LICENSE_FEES("advance_license_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)(params.getAdvanceRentalMonths() * params.getRoomPrice())).replaceAll("\\.00","");
		}
	},
	SECURITY_DATE("sd_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}
	},
	SECURITY_DEPOSIT_STRING("sd_string"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return "Security Amount";
		}
	},
	SECURITY_AMOUNT("sd_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)(booking.getBookingCommercials().getSecurityDeposit())).replaceAll("\\.00","");	
		}
	},
	DISCOUNT_DATE("discount_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			if(booking.getBookingCommercials().getDiscount() == null){
				return "";
			}
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}
	},
	DISCOUNT_STRING("discount_string"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return (booking.getBookingCommercials().getDiscount() == null? "" : "Discount");
		}
	},
	DISCOUNT_AMOUNT("discount_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			if(booking.getBookingCommercials().getDiscount() == null){
				return "";
			}
			return formatter.format(Math.ceil(booking.getBookingCommercials().getDiscount().getValueApplied())).replaceAll("\\.00","");
		}

	},
	MONTHLY_RENT("monthly_rental_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)(params.getRoomPrice() + params.getMandatoryServicePrice() 
					+ params.getCgst()+params.getSgst())).replaceAll("\\.00","");
		}
	};
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static final NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	
	private final String leegalityAddendumFieldEnumForWorkingProfessional;
	
	private static final Map<String, LeegalityAddendumFieldEnumForWorkingProfessional> fieldMap = new HashMap<>();
	
	LeegalityAddendumFieldEnumForWorkingProfessional(String LeegalityAddendumFieldEnumForWorkingProfessional) {
		this.leegalityAddendumFieldEnumForWorkingProfessional = LeegalityAddendumFieldEnumForWorkingProfessional;
	}
	
	public static LeegalityAddendumFieldEnumForWorkingProfessional getLeegalityAddendumFieldEnumForWorkingProfessionalsType(String fieldName) {
		return fieldMap.get(fieldName);
	}
	
	static {
		for (LeegalityAddendumFieldEnumForWorkingProfessional leegalityFieldEnum : LeegalityAddendumFieldEnumForWorkingProfessional.values()) {
			fieldMap.put(leegalityFieldEnum.leegalityAddendumFieldEnumForWorkingProfessional, leegalityFieldEnum);
		}
	}
	
	public abstract String get(Booking booking, LeegalityParameterDTO params);
}

package com.stanzaliving.core.inventory_transformations.model;

import com.stanzaliving.inventory.dto.LeegalityParameterDTO;
import com.stanzaliving.inventory.util.DateUtil;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public enum LeegalityFieldEnumForWorkingProfessionals {

	COMPANY("company_name") {
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getResidence().getParentCompany().getDisplayName();
		}
	}

	,ACCOMMODATION_TYPE("accommodation_type") {
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getOccupancy().getName();
		}
	}
	
	,OCCUPANCY("occupancy") {
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getOccupancy().getName();
		}
	}

	,ROOM_NUMBER("room_number"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getRoomNumber();
		}
	}

	,RESIDENCE_NAME("residence_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getRoom().getResidence().getName();
		}
	}

	,PAYMENT_FREQUENCY("payment_frequency"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getPaymentTermName();
		}
	}

	,CONTRACT_TENURE("contract_tenure") {
		public String get(Booking booking, LeegalityParameterDTO params) {
			if (booking.getBookingType() == BookingType.SUITES_BOOKING.getBookingTypeId()) {
				return DateUtil.getDifferenceBetweenDatesString(booking.getContractStartDate(),
						booking.getContractEndDate());
			} else {
				return booking.getContractName();
			}
		}
	}

	,RESIDENT_NAME("resident_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return (booking.getStudent().getFirstName() + " "+booking.getStudent().getLastName());
		}
	}

	,PARENT_NAME("guardian_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getPrimaryGuardian().getName();
		}

	}
	,PHONE_NUMBER("guardian_phone"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getPhone();
		}

	}

	,DATE_OF_BIRTH("resident_dob"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(booking.getStudent().getDateOfBirth());
		}

	}
	,EMAIL("resident_email"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getEmail();
		}

	}

	,PERMANENT_ADDRESS("resident_address"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Address address = booking.getStudent().getAddress();
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

	}
	,NATIONALITY("nationality"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getCountry() == null?"":booking.getStudent().getCountry().getName();
		}

	}

	,GENDER("gender"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getGender().name();
		}

	}
	,BLOOD_GROUP("blood_group"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getBloodGroup().getDisplayName();
		}

	}

	,ID_TYPE("document_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Map<String, Object> metaData = booking.getTemporaryStudent().getMetadata();
			Map<String,String> photoId = (Map<String, String>) metaData.get("photoId");
			String idType = photoId.get("idType");
			switch(idType.toUpperCase()) {
			case "AADHAAR" :
				return "AADHAAR";
			case "PAN CARD" :
				return "PAN CARD"; 
			case "DRIVING LICENCE" :
				return "DRIVING LICENCE";
			default:
				return "";
			}	
		}
	}

	,ID_NUMBER("document_number"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Map<String, Object> metaData = booking.getTemporaryStudent().getMetadata();
			Map<String,String> photoId = (Map<String, String>) metaData.get("photoId");
			return photoId.get("uniqueID");
		}

	}

	,MEDICAL_ILLNESS("medical_illness"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getMedicalConditions();
		}

	}
	,EMERGENCY_NAME("emergency_contact_name"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getLocalGuardian().getName();
		}

	}

	,EMERGENCY_RELATIONSHIP("emergency_contact_relationship"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getTemporaryStudent().getLocalGuardianRelationToStudent();
		}

	}
	,EMERGENCY_PHONE("emergency_contact_phone"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getStudent().getLocalGuardian().getMobile();
		}

	}

	,EMERGENCY_ADDRESS("emergency_contact_address"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Address address = booking.getStudent().getLocalGuardian().getAddress();
			StringBuilder billingAddress = new StringBuilder();
			if (address !=null) {
				if (address.getLine1() != null)
					billingAddress.append(address.getLine1() + ",");
				if (address.getLine2() != null)
					billingAddress.append(address.getLine2() + ",");
				if (address.getLandmark() != null)
					billingAddress.append(address.getLandmark() + ",");
				billingAddress.append(address.getCity().getName() + ", ");
				billingAddress.append(address.getState().getName() + ",-");
				billingAddress.append(address.getZipCode());
				return billingAddress.toString();
			}
			return "";
		}

	}
	,PENALTY_AMOUNT("penalty_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)params.getPenaltyAmount()).replaceAll("\\.00","");
		}

	}
	
	,AMF("amf_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)booking.getBookingCommercials().getMaintenanceFee()).replaceAll("\\.00","");
		}

	}
	
	,LOCK_IN("lock_in_period"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return booking.getLockIn();
		}

	}

	,CONTRACT_START_DATE("contract_start_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(booking.getContractStartDate());
		}

	}
	
	,CONTRACT_END_DATE("contract_end_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(booking.getContractEndDate());
		}

	}
	,CONTRACT_MONTHS("contract_tenure_2") {
		public String get(Booking booking, LeegalityParameterDTO params) {
			if (booking.getBookingType() == BookingType.SUITES_BOOKING.getBookingTypeId()) {
				return DateUtil.getDifferenceBetweenDatesString(booking.getContractStartDate(),
						booking.getContractEndDate());
			} else {
				return booking.getContractName();
			}
		}
	}

	,MOVE_IN_DATE("move_in_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return sdf.format(booking.getMoveInDate() == null ? booking.getContractStartDate() : booking.getMoveInDate());
		}

	}
	,MANDATORY_SERVICES("mandatory_services_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<BookingService> bookingService = booking.getBookingServices();
			String servicesName = bookingService.stream().filter(id-> !id.isOptional() && !id.isVas()).map(id-> id.getServiceName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;			
		}

	}

	,SUBSCRIBED_SERVICES("vas_service_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<BookingService> bookingService = booking.getBookingServices();
			String servicesName = bookingService.stream().filter(id-> id.isVas() && id.isActive()).map(id-> id.getServiceName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;			
		}

	}
	,RESIDENCE_INVENTORY("inventory_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<Fixtures> fixtures = booking.getRoom().getResidence().getFixtures();
			String servicesName = fixtures.stream().map(id-> id.getName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;			
		}

	}

	,RESIDENCE_SERVICES("ancillary_services_list"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			Set<AncillaryServices> services = booking.getRoom().getResidence().getAncillaryServices();
			String servicesName = services.stream().filter(id-> id.isEnabled()).map(id-> id.getName()).collect(Collectors.joining(","));
			return servicesName.isEmpty() ? "N/A" : servicesName;			
		}

	}
	,TOKEN_DATE("token_date"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}

	}

	,ADVANCE_SERVICE_DATE("advance_service_date"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}

	}
	,ADVANCE_LICENSE_DATE("advance_license_date"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}

	}
	,SECURITY_DATE("sd_date"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}

	}
	,DISCOUNT_DATE("discount_date"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			if(booking.getBookingCommercials().getDiscount() == null){
				return "";
			}
			return new SimpleDateFormat("dd/MM/yyyy").format(params.getPaymentCompletionDate());
		}

	}
	
	,TOKEN_AMOUNT_STRING("token_amount_string"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return "Token Amount";
		}
	}
	
	,ADVANCE_SERVICE_STRING("advance_service_string"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return "Advance Service fees";
		}
	}
	
	,ADVANCE_LICENSE_STRING("advance_license_string"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return "Advance License Fees";
		}
	}
	
	,SECURITY_DEPOSIT_STRING("sd_string"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return "Security Amount";
		}
	}
	
	,DISCOUNT_STRING("discount_string"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return (booking.getBookingCommercials().getDiscount() == null? "" : "Discount");
		}
	}

	,TOKEN_AMOUNT("token_amount"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return formatter.format((int)booking.getBookingCommercials().getAdvanceAmount()).replaceAll("\\.00","");
		}

	}

	,ADVANCE_SERVICE_FEES("advance_service_amount"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return formatter.format((int)(params.getAdvanceRentalMonths()
					* (params.getMandatoryServicePrice() + params.getSgst() + params.getCgst())))
					.replaceAll("\\.00","");
		}

	}

	,ADVANCE_LICENSE_FEES("advance_license_amount"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			return formatter.format((int)(params.getAdvanceRentalMonths() * params.getRoomPrice())).replaceAll("\\.00","");
		}

	}

	,SECURITY_AMOUNT("sd_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)(booking.getBookingCommercials().getSecurityDeposit())).replaceAll("\\.00","");	

		}

	}

	,DISCOUNT_AMOUNT("discount_amount"){
		public String get(Booking booking,LeegalityParameterDTO params) {
			if(booking.getBookingCommercials().getDiscount() == null){
				return "";
			}
			return formatter.format(Math.ceil(booking.getBookingCommercials().getDiscount().getValueApplied())).replaceAll("\\.00","");
		}

	}
	,MONTHLY_RENT("monthly_rental_amount"){
		public String get(Booking booking, LeegalityParameterDTO params) {
			return formatter.format((int)(params.getRoomPrice() + params.getMandatoryServicePrice() 
					+ params.getCgst()+params.getSgst())).replaceAll("\\.00","");
		}

	};



	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static final NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

	private final String leegalityFieldEnumForWorkingProfessionals;

	private static final Map<String, LeegalityFieldEnumForWorkingProfessionals> fieldMap = new HashMap<>();

	LeegalityFieldEnumForWorkingProfessionals(String leegalityFieldEnumForWorkingProfessionals) {
		this.leegalityFieldEnumForWorkingProfessionals = leegalityFieldEnumForWorkingProfessionals;
	}

	public static LeegalityFieldEnumForWorkingProfessionals getLeegalityFieldEnumForWorkingProfessionalsType(String fieldName) {
		return fieldMap.get(fieldName);
	}

	static {
		for (LeegalityFieldEnumForWorkingProfessionals leegalityFieldEnum : LeegalityFieldEnumForWorkingProfessionals.values()) {
			fieldMap.put(leegalityFieldEnum.leegalityFieldEnumForWorkingProfessionals, leegalityFieldEnum);
		}
	}
	public abstract String get(Booking booking, LeegalityParameterDTO params);
}

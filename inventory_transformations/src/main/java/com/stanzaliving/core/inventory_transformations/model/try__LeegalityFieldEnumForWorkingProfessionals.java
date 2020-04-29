package com.stanzaliving.core.inventory_transformations.model;

import com.stanzaliving.inventory.util.Constants;
import org.apache.commons.lang3.StringUtils;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public enum try__LeegalityFieldEnumForWorkingProfessionals {

	OCCUPANCY("occupancy") {
		public String get(Booking booking) {
			return booking.getRoom().getOccupancy().getName();
		}
	},
	OCCUPANCY_TYPE("occupancy_type") {
		public String get(Booking booking) {
			return booking.getRoom().getOccupancy().getName();
		}
	}
	,ROOM("room"){
		public String get(Booking booking) {
			return booking.getRoom().getRoomNumber();
		}
	}

	,RESIDENCE_NAME("residence_name"){
		public String get(Booking booking) {
			return booking.getRoom().getResidence().getName();
		}
	}

	,PAYMENT_PLAN("payment_plan"){
		public String get(Booking booking) {
			return booking.getPaymentTermName();
		}
	}

	,NAME("name"){
		public String get(Booking booking) {
			return (booking.getStudent().getFirstName() + " "+booking.getStudent().getLastName());
		}
	}

	,PARENT_NAME("parent_name"){
		public String get(Booking booking) {
			return booking.getStudent().getPrimaryGuardian().getName();
		}
	}

	,PHONE("phone"){
		public String get(Booking booking) {
			return booking.getStudent().getPhone();
		}
	}

	,DOB("dob"){
		public String get(Booking booking) {
			return new SimpleDateFormat("dd/MM/yyyy").format(booking.getStudent().getDateOfBirth());
		}
	}

	,EMAIL("email"){
		public String get(Booking booking) {
			return booking.getStudent().getEmail();
		}
	}

	,ADDRESS("address") {
		public String get(Booking booking) {
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
		public String get(Booking booking) {
			return Constants.NATIONALITY_INDIAN;
		}
	}

	,GENDER("gender"){
		public String get(Booking booking) {
			return booking.getStudent().getGender().name();
		}
	}

	,BLOOD_GROUP("blood_group"){
		public String get(Booking booking) {
			return booking.getStudent().getBloodGroup().name();
		}
	}

	,ID_TYPE("id_type") {
		public String get(Booking booking) {
			
			StudentOnboardingDetails onboarding = null;
			if (onboarding != null) {
				if (StringUtils.isNotEmpty(onboarding.getAadhar())) {
					return Constants.AADHAR;
				} else if (StringUtils.isNotEmpty(onboarding.getPanCard())) {
					return Constants.PAN_CARD;
				} else {
					return Constants.DRIVING_LICENSE;
				}
			}
			return "";
		}
	}

	,ID_NUMBER("id_number"){
		public String get(Booking booking) {
			StudentOnboardingDetails onboarding = null;
			if (onboarding != null) {
				if (StringUtils.isNotEmpty(onboarding.getAadhar())) {
					return onboarding.getAadhar();
				} else if (StringUtils.isNotEmpty(onboarding.getPanCard())) {
					return onboarding.getPanCard();
				} else {
					return onboarding.getOtherId();
				}
			}
			return "";
		}
	}

	,MEDICAL_ILLNESS("medical_illness"){
		public String get(Booking booking) {
			return booking.getStudent().getMedicalConditions();
		}
	}

	,EMERGENCY_CONTACT_PERSON("emergency_contact_person"){
		public String get(Booking booking) {
			return booking.getStudent().getLocalGuardian().getName();
		}
	}

	,RELATIONSHIP("relationship"){
		public String get(Booking booking) {
			return booking.getTemporaryStudent().getLocalGuardianRelationToStudent();
		}
	}

	,EMERGENCY_PHONE("emergency_phone"){
		public String get(Booking booking) {
			return booking.getStudent().getLocalGuardian().getMobile();
		}
	}

	,EMERGENCY_ADDRESS("emergency_address"){
		public String get(Booking booking) {
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

	,CONTACT_PERIOD_MONTHS("contact_period_months"){
		public String get(Booking booking) {
			return String.valueOf(booking.getContractMonths());
		}
	}, CONTRACT_START_DATE("contract_start_date") {
		public String get(Booking booking) {
			return new SimpleDateFormat("dd/MM/yyyy").format(booking.getContractStartDate());
		}
	}
	,CONTACT_MONTHS("contract_month"){
		public String get(Booking booking) {
			return booking.getContractName();
		}
	}

	,INSTALMENT_AMOUNT("instalment_amount"){
		public String get(Booking booking) {
			BookingCommercials bookingCommercial = booking.getBookingCommercials();
			return String.valueOf((bookingCommercial.getRoomPrice()+ bookingCommercial.getMandatoryServicePrice()+bookingCommercial.getSgst()+bookingCommercial.getCgst())*booking.getContractMonths());
		}
	}

	,RENT("rent"){
		public String get(Booking booking) {
			BookingCommercials bookingCommercial = booking.getBookingCommercials();
			return String.valueOf(bookingCommercial.getRoomPrice()+ bookingCommercial.getMandatoryServicePrice()+bookingCommercial.getSgst()+bookingCommercial.getCgst());
		}
	}

	,ADVANCE_RENT_MONTH("advance_rent_month"){
		public String get(Booking booking) {
			return String.valueOf(booking.getBookingCommercials().getAdvanceRentalMonths());
		}
	}

	,MOVE_IN_DATE("move_in_date"){
		public String get(Booking booking) {
			return sdf.format(booking.getMoveInDate() == null ? booking.getContractStartDate() : booking.getMoveInDate());
		}
	}

	,MANDATORY_SERVICES("mandatory_services"){
		public String get(Booking booking) {
			Set<BookingService> bookingService = booking.getBookingServices();
			String servicesName = bookingService.stream().filter(id-> !id.isOptional() && !id.isVas()).map(id-> id.getServiceName()).collect(Collectors.joining(","));
			return servicesName;			
		}
	}

	,VAS("vas"){
		public String get(Booking booking) {
			Set<BookingService> bookingService = booking.getBookingServices();
			String servicesName = bookingService.stream().filter(id-> id.isVas() && id.isActive()).map(id-> id.getServiceName()).collect(Collectors.joining(","));
			return servicesName;			
		}
	}

	,ANCILLARY_SERVICES("ancillary_services"){
		public String get(Booking booking) {
			Set<AncillaryServices> services = booking.getRoom().getResidence().getAncillaryServices();
			String servicesName = services.stream().filter(id-> id.isEnabled()).map(id-> id.getName()).collect(Collectors.joining(","));
			return servicesName;			
		}
	}

	,INVENTORIES("inventories"){
		public String get(Booking booking) {
			Set<Fixtures> fixtures = booking.getRoom().getResidence().getFixtures();
			String servicesName = fixtures.stream().map(id-> id.getName()).collect(Collectors.joining(","));
			return servicesName;			
		}
	}

	,REFUNDABLE_DEPOSIT("refundable_deposit"){
		public String get(Booking booking) {
			return String.valueOf(booking.getBookingCommercials().getRefundableSecurity());
		}
	}

	,NON_REFUNDABLE_DEPOSIT("non_refundable_deposit"){
		public String get(Booking booking) {
			return String.valueOf(booking.getBookingCommercials().getNonRefundableSecurity() + booking.getBookingCommercials().getAdminCharges());
		}
	}

	, SECURITY("security") {
		public String get(Booking booking) {
			return String.valueOf(booking.getBookingCommercials().getNonRefundableSecurity() + booking.getBookingCommercials().getRefundableSecurity()
					+ booking.getBookingCommercials().getAdminCharges());
		}
	}
	,COMPANY_NAME("company_name"){
		public String get(Booking booking) {
			return booking.getRoom().getResidence().getParentCompany().getDisplayName();
		}
	}
	
	,ADMIN_CHARGES("admin_charges"){
		public String get(Booking booking) {
			return String.valueOf(booking.getBookingCommercials().getAdminCharges());
		}
	}
	
	,VALIDITY("validity"){
		public String get(Booking booking) {
			return new SimpleDateFormat("dd/MM/yyyy").format(booking.getContractEndDate());
		}
	};

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static final NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

	private final String leegalityFieldEnumForWorkingProfessionals;

	private static final Map<String, try__LeegalityFieldEnumForWorkingProfessionals> fieldMap = new HashMap<>();

	try__LeegalityFieldEnumForWorkingProfessionals(String leegalityFieldEnumForWorkingProfessionals) {
		this.leegalityFieldEnumForWorkingProfessionals = leegalityFieldEnumForWorkingProfessionals;
	}

	public static try__LeegalityFieldEnumForWorkingProfessionals getLeegalityFieldEnumForWorkingProfessionalsType(String fieldName) {
		return fieldMap.get(fieldName);
	}

	static {
		for (try__LeegalityFieldEnumForWorkingProfessionals leegalityFieldEnum : try__LeegalityFieldEnumForWorkingProfessionals.values()) {
			fieldMap.put(leegalityFieldEnum.leegalityFieldEnumForWorkingProfessionals, leegalityFieldEnum);
		}
	}
	public abstract String get(Booking booking);
}

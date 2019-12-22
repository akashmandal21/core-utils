package com.stanzaliving.core.estate.constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.utils.ImmutablePair;

public class AttributeNames {

	// propertyAnalysis attribute constants
		public static final String SIZE_OF_PLOT = "sizeOfPlot";
		public static final String EXPECTED_BED_COUNT = "expectedBedCount";
		public static final String FLOOR_COUNT = "floorCount";
		public static final String POC_NUMBER = "pocNumber";
		public static final String POC_NAME = "pocName";

		public static final String ROOM_TYPE = "roomType";
		public static final String ROOM_COUNT = "roomCount";

		public static final String TERRACE_ACCESSIBLE = "terraceAreaCoverage";

		public static final String NUMBER_OF_FLOORS = "floorCount";

		public static final String NUMBER_OF_STILT_ROOMS = "stiltNumberOfRooms";

		public static final String FLOOR_PLATE_SIZE = "floorPlateSize";

		public static final String DINING_SPACE_AVAILABLE = "diningSpaceAvailable";

		public static final String DINING_SPACE_SIZE = "diningArea";

		public static final String PERMISSIONS_TYPE = "permissionType";

		public static final String WATER_STORAGE_SOURCE = "waterStorageSource";

		public static final String WATER_STORAGE_SIZE = "waterStorage";

		public static final String BUILDING_BASIS = "buildingBasis";

		public static final String ELECTRICITY_SUPPLY = "electricitySupply";
		
		public static final String ELECTRICITY_LOAD_CAPACITY = "electricityLoadCapacity";
		
		public static final String ELECTRICITY_TYPE = "electricityType";

		public static final String BUILDING_STATE = "buildingState";

		public static final String POWER_BACKUP_AVAILABLE = "powerBackupAvailable";

		public static final String POWER_BACKUP_SIze = "powerBackupCapacity";

		public static final String POWER_BACKUP_TYPE = "powerBackupType";

		public static final String OPERATIONS_TYPE = "operationsType";

		public static final String COMMON_AREA_SIZE = "commonAreaSize";

		public static final String BUILDING_TYPE = "buildingType";

		public static final String GYM_AVAILABLE = "gymAvailable";

		public static final String GYM_SIZE = "gymAreaSize";

		public static final String PARKING_AVAILABLE = "parkingAvailable";

		public static final String DRAINAGE_AVAILABLE = "drainaigeConnection";
		
		public static final String BASEMENT_SIZE = "basementAreaSize";

		public static final String LAST_REFURBISHED_DATE = "lastRefurbishedDate";

		public static final String LIFT_AVAILABLE = "liftAvailable";

		public static final String LIFT_BRAND = "liftMake";

		public static final String COMMENTS_ON_PROPERTY_ANALYSIS = "commentsOnPropertyAnalysis";

		public static final String COMMENTS = "comments";

		public static final String KEY_POSITIVES = "keyPositives";

		public static final String KEY_NEGATIVES = "keyNegatives";

		public static final String BUILDING_COMPLETION_YEAR = "buildingCompletionYear";

		public static final String NUMBER_OF_ROOMS_WITH_BALCONY = "roomsWithBalcony";

		public static final String COMMON_WASH_ROOM_AREA = "commonWashroomArea";
		public static final String COMMON_WASH_ROOM_COUNT = "commonWashroomCount";

		public static final String ATTACHED_WASH_ROOM_AREA = "attachedWashroomCount";
		public static final String ATTACHED_WASH_ROOM_COUNT = "attachedWashroomArea";

		public static final String BUILDING_BOUNDARY_LEFT_SIDE = "buildingBoundaryLeftSide";
		public static final String BUILDING_BOUNDARY_RIGHT_SIDE = "buildingBoundaryRightSide";
		public static final String BUILDING_BOUNDARY_TOP_SIDE = "buildingBoundaryTopSide";

	// location analysis attribute constants
		public static final String LATE_NIGHT_PATROLS = "lateNightPatrols";
		public static final String ADJOINING_AREA_SAFETY = "safeAdjoiningAreas";
		public static final String ROAD_ACCESS = "roadAccess";
		public static final String MOONSOON_PREPAREDNESS = "monsoonPreparedness";
		public static final String STREET_LIGHTING = "streetLighting";
		public static final String RWA_PRESENCE = "rwaPresence";
		public static final String VIEWS_ON_RWA = "viewsOnRWA";
		public static final String LOCATION_COMMENTS = "commentsOnLocation";
		public static final String PROPERTY_ANALYSIS_COMMENTS = "commentsOnPropertyCondition";
		public static final String FOOD_DELIVERY_AVAILABLE = "foodDeliveryAvailable";
		public static final String PUBLIC_TRANSPORT_AVAILABLE = "publicTransportation";

	// Landlord attribute constants
		public static final String LANDLORD_COMMENTS_ON_KEY_POSITIVES = "commentsOnKeyPositives";
		public static final String LANDLORD_COMMENTS_ON_KEY_NEGATIVES = "commentsOnKeyNegatives";
		public static final String LANDLORD_COUNT = "landlordCount";
		public static final String LANDLORD_KEY_NEGATIVE = "landlordKeyNegative";
		public static final String LANDLORD_KEY_POSITIVE = "landlordKeyPositive";

		public static final String LANDLORD_POC_NAME = "pocName";
		public static final String LANDLORD_POC_NUMBER = "pocNumber";
		public static final String LANDLORD_POC_EMAIL = "pocEmail";

		public static final String LANDLORD_KEY_POSITIVES = "landlordKeyPositives";
		public static final String LANDLORD_KEY_NEGATIVES = "landlordKeyNegatives";
		public static final String LANDLORD_KEY_DOCUMENTS = "landlordKeyDocuments";

		public static final String LANDLORD_INFO_DETAILS = "landlordDetails";

	// Financial analysis attributes
		public static final String FIN_MONTHLY_RENT = "monthlyRent";
		public static final String FIN_LEASE_DURATION_IN_YEARS = "leaseDurationInYears";
		public static final String FIN_SECURITY_DEPOSITE_MONTHS_OF_RENT = "securityDepositMonthsOfRent";
		public static final String FIN_RENTAL_INFLATION_IN_YEARS = "rentalInflationInYears";
		public static final String FIN_RENTAL_INFLATION_PERCENT = "rentalInflationPercent";
		public static final String FIN_ADVANCE_RENT_MONTH_COUNT = "advanceRentMonthCount";
		public static final String FIN_AMORTIZED_PERIOD_IN_MONTHS = "amortizedPeriodInMonths";
		public static final String FIN_LEASE_LOCKIN_PERIOD_IN_YEARS = "leaseLockInPeriodInYears";
		public static final String FIN_TOKEN_DEPOSIT_IN_RUPEES = "tokenDepositInRupees";
		public static final String FIN_RENT_FREE_PERIOD_IN_MONTHS = "rentFreePeriodInMonths";
		public static final String FIN_FINANCIAL_COMMENTS = "financialCommets";
		public static final String FIN_BUILDING_HANDOVER_DATE = "buildingHandoverDate";
		public static final String FIN_RENT_START_DATE = "rentStartDate";
		public static final String FIN_PAYMENT_OPTION = "paymentOption";


		public static final String FIN_BROKER_DETAILS = "brokerDetails";

		public static final String FIN_BROKER_EMAIL = "brokerEmail";
		public static final String FIN_BROKERAGE_DAYS = "brokerageDays";
		public static final String FIN_BROKER_INVOLVED = "brokerInvolved";
		public static final String FIN_BROKER_NAME = "brokerName";
		public static final String FIN_BROKER_NUMBER = "brokerNumber";
		public static final String FIN_EMPANNELED_BROKER = "empanelledBroker";

		public static final String FASCADE_IMAGES = "facadeImages";

		public static final String BEDS_AVAILABLE = "beds"; 
		
	//ATL Details  
		public static final String STRUCTURE_REMARKS = "structureRemarks";
		public static final String FIRE_COMPLIANCE_REMARKS = "fireComplianceRemarks";
		public static final String FIRE_DEVICES_SUPPLY_INSTALLATION_TESTING_REMARKS = "fireDevicesSupplyInstallationTestingRemarks";
		public static final String CORRECTION_OF_SEEPAGE_REMARKS = "correctionOfSeepageRemarks";
		public static final String FIX_ISSUES_RELATED_TO_DRAINAGE_REMARKS = "fixIssuesRelatedToDrainageRemarks";
		public static final String WATER_PROOFING_WORK_ON_TERRACE_REMARKS = "waterProofingWorkOnTerraceRemarks";
		public static final String CONNECTED_WATER_SUPPLY_REMARKS = "connectedWaterSupplyRemarks";
		public static final String FULLY_FUNCTIONAL_WATER_PUMPS_REMARKS = "fullyFunctionalWaterPumpsRemarks";
		public static final String AUTOMATION_OF_WATER_STORAGE_REMARKS = "automationOfWaterStorageRemarks";
		public static final String BASEMENT_OTHER_AREAS_MAY_REMARKS = "basementOtherAreasMayRemarks";
		public static final String WATER_TANK_CAPACITY_TO_BE_CALCULATED_REMARKS = "waterTankCapacityToBeCalculatedRemarks";
		public static final String ANY_MASONRY_PLASTER_CRACKS_REMARKS = "anyMasonryPlasterCracksRemarks";
		public static final String EXTERNAL_DOOR_WINDOWS_REMARKS = "externalDoorWindowsRemarks";
		public static final String WEATHER_PROOF_ROOF_REMARKS = "weatherProofRoofRemarks";
		public static final String USABLE_TERRACE_REMARKS = "usableTerraceRemarks";
		public static final String FINISHED_FLOORING_REMARKS = "finishedFlooringRemarks";
		public static final String LL_FUNCTIONAL_TOILETS_REMARKS = "llFunctionalToiletsRemarks";
		public static final String LL_TOILETS_AT_TERRACE_REMARKS = "llToiletsAtTerraceRemarks";
		public static final String FFL_ON_TERRACE_REMARKS = "fflOnTerraceRemarks";
		public static final String LL_EXTERIOR_FACADE_REMARKS = "llExteriorFacadeRemarks";
		public static final String ENTIRE_INTERIOR_SPACE_REMARKS = "entireInteriorSpaceRemarks";
		public static final String ANY_CRACKS_IN_THE_WALLS_REMARKS = "anyCracksInTheWallsRemarks";
		public static final String GENERAL_LIGHTING_REMARKS = "generalLightingRemarks";
		public static final String DINING_SPACE_REMARKS = "diningSpaceRemarks";
		public static final String ALL_FLOORING_FOR_COMMON_AREAS_REMARKS = "allFlooringForCommonAreasRemarks";
		public static final String ALL_FLOORING_FOR_KITCHEN_REMARKS = "allFlooringForKitchenRemarks";
		public static final String ALL_BROKEN_CRACKED_FURNITURE_REMARKS = "allBrokenCrackedFurnitureRemarks";
		public static final String KEYS_TO_LOCKS_OF_DOORS_REMARKS = "keysToLocksOfDoorsRemarks";
		public static final String LIVEABLE_ROOM_AREA_REMARKS = "liveableRoomAreaRemarks";
		public static final String ROOM_INTERIORS_REMARKS = "roomInteriorsRemarks";
		public static final String BATHROOM_ACCESSORIES_REMARKS = "bathroomAccessoriesRemarks";
		public static final String CURTAIN_RODS_REMARKS = "curtainRodsRemarks";
		public static final String PLUMBING_PIPES_ASSOCIATED_COSTS_REMARKS = "plumbingPipesAssociatedCostsRemarks";
		public static final String WATER_PRESSURE_FLOODING_ISSUES_REMARKS = "waterPressureFloodingIssuesRemarks";
		public static final String REPLACEMENT_OF_BROKEN_DAMAGED_SANITARY_WARE_REMARKS = "replacementOfBrokenDamagedSanitaryWareRemarks";
		public static final String LIAISONING_FOR_COMMERCIAL_WATER_METER_REMARKS = "liaisoningForCommercialWaterMeterRemarks";
		public static final String LESSEE_SEWER_LINE_REMARKS = "lesseeSewerLineRemarks";
		public static final String FUNCTIONING_A_C_REMOTES_REMARKS = "functioningACRemotesRemarks";
		public static final String _A_C_DRAINIAGE_AND_CONNECTIONS_REMARKS = "ACDrainiageAndConnectionsRemarks";
		public static final String STORAGE_GEYSER_REMARKS = "storageGeyserRemarks";
		public static final String ELECTRICAL_SOLAR_BOILER_CAPACITY_REMARKS = "electricalSolarBoilerCapacityRemarks";
		public static final String ALL_WHITE_GOODS_REQUIRING_DRAINAGE_POINT_REMARKS = "allWhiteGoodsRequiringDrainagePointRemarks";
		public static final String ENTIRE_LIAISONING_REMARKS = "entireLiaisoningRemarks";
		public static final String WORK_ON_THE_H_T_SIDE_REMARKS = "workOnTheHTSideRemarks";
		public static final String ROOM_WISE_SEPARATE_WIRING_REMARKS = "roomWiseSeparateWiringRemarks";
		public static final String SUFFICIENT_CONNECTED_LOAD_CATERING_REMARKS = "sufficientConnectedLoadCateringRemarks";
		public static final String ALL_GEYSERS_IN_THE_BUILDING_REMARKS = "allGeysersInTheBuildingRemarks";
		public static final String DIESEL_GENERATOR_WITH_AUTO_CHANGE_REMARKS = "dieselGeneratorWithAutoChangeRemarks";
		public static final String REPLACEMENT_OF_D_G_REMARKS = "replacementOfDGRemarks";
		public static final String _N_O_C_P_U_C_LICENSE_FROM_LOCAL_AUTHORITY_REMARKS = "NOCPUCLicenseFromLocalAuthorityRemarks";
		public static final String POWER_BACK_UP_WIRING_REMARKS = "powerBackUpWiringRemarks";
		public static final String LIFT_ONE_TIME_REFURBISHMENT_REMARKS = "liftOneTimeRefurbishmentRemarks";
		public static final String AUTO_RESCUE_DEVICE_REMARKS = "autoRescueDeviceRemarks";
		public static final String WORKING_LIFT_A_M_C_REMARKS = "workingLiftAMCRemarks";
		public static final String REPLACEMENT_OF_LIFT_REMARKS = "replacementOfLiftRemarks";
		public static final String LIFT_LICENSE_RENEWAL_REMARKS = "liftLicenseRenewalRemarks";
		public static final String ALL_TEST_CERTIFICATE_AND_DOCUMENTS = "allTestCertificateAndDocuments";
		public static final String LIGHTING_AND_POWER_TO_BE_INSTALLED_REMARKS = "lightingAndPowerToBeInstalledRemarks";

	//ATL Details  
		public static final String STRUCTURE_CLAUSE_A_BOOLEAN = "structureClauseABoolean";
		public static final String FIRE_CLAUSE_A_BOOLEAN = "fireClauseABoolean";
		public static final String FIRE_CLAUSE_B_BOOLEAN = "fireClauseBBoolean";
		public static final String SEEPAGE_CLAUSE_A_BOOLEAN = "seepageClauseABoolean";
		public static final String SEEPAGE_CLAUSE_B_BOOLEAN = "seepageClauseBBoolean";
		public static final String SEEPAGE_CLAUSE_C_BOOLEAN = "seepageClauseCBoolean";
		public static final String WATER_SUPPLY_CLAUSE_A_BOOLEAN = "waterSupplyClauseABoolean";
		public static final String WATER_SUPPLY_CLAUSE_B_BOOLEAN = "waterSupplyClauseBBoolean";
		public static final String WATER_SUPPLY_CLAUSE_C_BOOLEAN = "waterSupplyClauseCBoolean";
		public static final String WATER_SUPPLY_CLAUSE_D_BOOLEAN = "waterSupplyClauseDBoolean";
		public static final String WATER_STORAGE_CLAUSE_A_BOOLEAN = "waterStorageClauseABoolean";
		public static final String FACADE_CLAUSE_A_BOOLEAN = "facadeClauseABoolean";
		public static final String FACADE_CLAUSE_B_BOOLEAN = "facadeClauseBBoolean";
		public static final String TERRACE_LEVEL_CLAUSE_A_BOOLEAN = "terraceLevelClauseABoolean";
		public static final String TERRACE_LEVEL_CLAUSE_B_BOOLEAN = "terraceLevelClauseBBoolean";
		public static final String TERRACE_LEVEL_CLAUSE_C_BOOLEAN = "terraceLevelClauseCBoolean";
		public static final String TERRACE_LEVEL_CLAUSE_D_BOOLEAN = "terraceLevelClauseDBoolean";
		public static final String TERRACE_LEVEL_CLAUSE_E_BOOLEAN = "terraceLevelClauseEBoolean";
		public static final String TERRACE_LEVEL_CLAUSE_F_BOOLEAN = "terraceLevelClauseFBoolean";
		public static final String OCCUPIED_LEVEL_CLAUSE_A_BOOLEAN = "occupiedLevelClauseABoolean";
		public static final String OCCUPIED_LEVEL_CLAUSE_B_BOOLEAN = "occupiedLevelClauseBBoolean";
		public static final String OCCUPIED_LEVEL_CLAUSE_C_BOOLEAN = "occupiedLevelClauseCBoolean";
		public static final String OCCUPIED_LEVEL_CLAUSE_D_BOOLEAN = "occupiedLevelClauseDBoolean";
		public static final String OCCUPIED_LEVEL_CLAUSE_E_BOOLEAN = "occupiedLevelClauseEBoolean";
		public static final String OCCUPIED_LEVEL_CLAUSE_F_BOOLEAN = "occupiedLevelClauseFBoolean";
		public static final String ROOM_CLAUSE_A_BOOLEAN = "roomClauseABoolean";
		public static final String ROOM_CLAUSE_B_BOOLEAN = "roomClauseBBoolean";
		public static final String ROOM_CLAUSE_C_BOOLEAN = "roomClauseCBoolean";
		public static final String ROOM_CLAUSE_D_BOOLEAN = "roomClauseDBoolean";
		public static final String ROOM_CLAUSE_E_BOOLEAN = "roomClauseEBoolean";
		public static final String ROOM_CLAUSE_F_BOOLEAN = "roomClauseFBoolean";
		public static final String SANITARY_CLAUSE_A_BOOLEAN = "sanitaryClauseABoolean";
		public static final String SANITARY_CLAUSE_B_BOOLEAN = "sanitaryClauseBBoolean";
		public static final String SANITARY_CLAUSE_C_BOOLEAN = "sanitaryClauseCBoolean";
		public static final String SANITARY_CLAUSE_D_BOOLEAN = "sanitaryClauseDBoolean";
		public static final String SANITARY_CLAUSE_E_BOOLEAN = "sanitaryClauseEBoolean";
		public static final String WHITE_GOODS_CLAUSE_A_BOOLEAN = "whiteGoodsClauseABoolean";
		public static final String WHITE_GOODS_CLAUSE_B_BOOLEAN = "whiteGoodsClauseBBoolean";
		public static final String WHITE_GOODS_CLAUSE_C_BOOLEAN = "whiteGoodsClauseCBoolean";
		public static final String WHITE_GOODS_CLAUSE_D_BOOLEAN = "whiteGoodsClauseDBoolean";
		public static final String WHITE_GOODS_CLAUSE_E_BOOLEAN = "whiteGoodsClauseEBoolean";
		public static final String ELECTRICAL_CLAUSE_A_BOOLEAN = "electricalClauseABoolean";
		public static final String ELECTRICAL_CLAUSE_B_BOOLEAN = "electricalClauseBBoolean";
		public static final String ELECTRICAL_CLAUSE_C_BOOLEAN = "electricalClauseCBoolean";
		public static final String ELECTRICAL_CLAUSE_D_BOOLEAN = "electricalClauseDBoolean";
		public static final String ELECTRICAL_CLAUSE_E_BOOLEAN = "electricalClauseEBoolean";
		public static final String POWER_BACKUP_CLAUSE_A_BOOLEAN = "powerBackupClauseABoolean";
		public static final String POWER_BACKUP_CLAUSE_B_BOOLEAN = "powerBackupClauseBBoolean";
		public static final String POWER_BACKUP_CLAUSE_C_BOOLEAN = "powerBackupClauseCBoolean";
		public static final String POWER_BACKUP_CLAUSE_D_BOOLEAN = "powerBackupClauseDBoolean";
		public static final String LIFT_CLAUSE_A_BOOLEAN = "liftClauseABoolean";
		public static final String LIFT_CLAUSE_B_BOOLEAN = "liftClauseBBoolean";
		public static final String LIFT_CLAUSE_C_BOOLEAN = "liftClauseCBoolean";
		public static final String LIFT_CLAUSE_D_BOOLEAN = "liftClauseDBoolean";
		public static final String LIFT_CLAUSE_E_BOOLEAN = "liftClauseEBoolean";
		public static final String DOCS_AND_A_M_C_CLAUSE_A_BOOLEAN = "docsAndAMCClauseABoolean";
		public static final String COMMON_AREAS_CLAUSE_A_BOOLEAN = "commonAreasClauseABoolean";

		public static final String STRUCTURE_CLAUSE_A_TEXT_AREA = "structureClauseATextArea";
		public static final String FIRE_CLAUSE_A_TEXT_AREA = "fireClauseATextArea";
		public static final String FIRE_CLAUSE_B_TEXT_AREA = "fireClauseBTextArea";
		public static final String SEEPAGE_CLAUSE_A_TEXT_AREA = "seepageClauseATextArea";
		public static final String SEEPAGE_CLAUSE_B_TEXT_AREA = "seepageClauseBTextArea";
		public static final String SEEPAGE_CLAUSE_C_TEXT_AREA = "seepageClauseCTextArea";
		public static final String WATER_SUPPLY_CLAUSE_A_TEXT_AREA = "waterSupplyClauseATextArea";
		public static final String WATER_SUPPLY_CLAUSE_B_TEXT_AREA = "waterSupplyClauseBTextArea";
		public static final String WATER_SUPPLY_CLAUSE_C_TEXT_AREA = "waterSupplyClauseCTextArea";
		public static final String WATER_SUPPLY_CLAUSE_D_TEXT_AREA = "waterSupplyClauseDTextArea";
		public static final String WATER_STORAGE_CLAUSE_A_TEXT_AREA = "waterStorageClauseATextArea";
		public static final String FACADE_CLAUSE_A_TEXT_AREA = "facadeClauseATextArea";
		public static final String FACADE_CLAUSE_B_TEXT_AREA = "facadeClauseBTextArea";
		public static final String TERRACE_AREA_CLAUSE_A_TEXT_AREA = "terraceAreaClauseATextArea";
		public static final String TERRACE_AREA_CLAUSE_B_TEXT_AREA = "terraceAreaClauseBTextArea";
		public static final String TERRACE_AREA_CLAUSE_C_TEXT_AREA = "terraceAreaClauseCTextArea";
		public static final String TERRACE_AREA_CLAUSE_D_TEXT_AREA = "terraceAreaClauseDTextArea";
		public static final String TERRACE_AREA_CLAUSE_E_TEXT_AREA = "terraceAreaClauseETextArea";
		public static final String TERRACE_AREA_CLAUSE_F_TEXT_AREA = "terraceAreaClauseFTextArea";
		public static final String OCCUPIED_LEVELS_CLAUSE_A_TEXT_AREA = "occupiedLevelsClauseATextArea";
		public static final String OCCUPIED_LEVELS_CLAUSE_B_TEXT_AREA = "occupiedLevelsClauseBTextArea";
		public static final String OCCUPIED_LEVELS_CLAUSE_C_TEXT_AREA = "occupiedLevelsClauseCTextArea";
		public static final String OCCUPIED_LEVELS_CLAUSE_D_TEXT_AREA = "occupiedLevelsClauseDTextArea";
		public static final String OCCUPIED_LEVELS_CLAUSE_E_TEXT_AREA = "occupiedLevelsClauseETextArea";
		public static final String OCCUPIED_LEVELS_CLAUSE_F_TEXT_AREA = "occupiedLevelsClauseFTextArea";
		public static final String ROOM_CLAUSE_A_TEXT_AREA = "roomClauseATextArea";
		public static final String ROOM_CLAUSE_B_TEXT_AREA = "roomClauseBTextArea";
		public static final String ROOM_CLAUSE_C_TEXT_AREA = "roomClauseCTextArea";
		public static final String ROOM_CLAUSE_D_TEXT_AREA = "roomClauseDTextArea";
		public static final String ROOM_CLAUSE_E_TEXT_AREA = "roomClauseETextArea";
		public static final String ROOM_CLAUSE_F_TEXT_AREA = "roomClauseFTextArea";
		public static final String SANITARY_CLAUSE_A_TEXT_AREA = "sanitaryClauseATextArea";
		public static final String SANITARY_CLAUSE_B_TEXT_AREA = "sanitaryClauseBTextArea";
		public static final String SANITARY_CLAUSE_C_TEXT_AREA = "sanitaryClauseCTextArea";
		public static final String SANITARY_CLAUSE_D_TEXT_AREA = "sanitaryClauseDTextArea";
		public static final String SANITARY_CLAUSE_E_TEXT_AREA = "sanitaryClauseETextArea";
		public static final String WHITE_GOODS_CLAUSE_A_TEXT_AREA = "whiteGoodsClauseATextArea";
		public static final String WHITE_GOODS_CLAUSE_B_TEXT_AREA = "whiteGoodsClauseBTextArea";
		public static final String WHITE_GOODS_CLAUSE_C_TEXT_AREA = "whiteGoodsClauseCTextArea";
		public static final String WHITE_GOODS_CLAUSE_D_TEXT_AREA = "whiteGoodsClauseDTextArea";
		public static final String WHITE_GOODS_CLAUSE_E_TEXT_AREA = "whiteGoodsClauseETextArea";
		public static final String ELECTRICAL_CLAUSE_A_TEXT_AREA = "electricalClauseATextArea";
		public static final String ELECTRICAL_CLAUSE_B_TEXT_AREA = "electricalClauseBTextArea";
		public static final String ELECTRICAL_CLAUSE_C_TEXT_AREA = "electricalClauseCTextArea";
		public static final String ELECTRICAL_CLAUSE_D_TEXT_AREA = "electricalClauseDTextArea";
		public static final String ELECTRICAL_CLAUSE_E_TEXT_AREA = "electricalClauseETextArea";
		public static final String POWER_BACKUP_CLAUSE_A_TEXT_AREA = "powerBackupClauseATextArea";
		public static final String POWER_BACKUP_CLAUSE_B_TEXT_AREA = "powerBackupClauseBTextArea";
		public static final String POWER_BACKUP_CLAUSE_C_TEXT_AREA = "powerBackupClauseCTextArea";
		public static final String POWER_BACKUP_CLAUSE_D_TEXT_AREA = "powerBackupClauseDTextArea";
		public static final String LIFT_CLAUSE_A_TEXT_AREA = "liftClauseATextArea";
		public static final String LIFT_CLAUSE_B_TEXT_AREA = "liftClauseBTextArea";
		public static final String LIFT_CLAUSE_C_TEXT_AREA = "liftClauseCTextArea";
		public static final String LIFT_CLAUSE_D_TEXT_AREA = "liftClauseDTextArea";
		public static final String LIFT_CLAUSE_E_TEXT_AREA = "liftClauseETextArea";
		public static final String DOCS_AND_A_M_C_CLAUSE_A_TEXT_AREA = "docsAndAMCClauseATextArea";
		public static final String COMMON_AREAS_CLAUSE_A_TEXT_AREA = "commonAreasClauseATextArea";

	//ATL Screen 2

		public static final String ASSET_LIST_WITH_EXACT_COUNT_RETAINED = "assetListWithExactCountRetained";
		public static final String LIFT_LICENSE_AND_RENEWAL = "liftLicenseAndRenewal";
		public static final String ELECTRICAL_LOAD_SANCTION_LETTER = "electricalLoadSanctionLetter";
		public static final String LAST_SIX_MONTHS_ELECTRICITY_BILLS = "lastSixMonthsElectricityBills";
		public static final String LAST_SIX_MONTHS_WATER_BILLS = "lastSixMonthsWaterBills";
		public static final String UTILITY_BILLS = "utilityBills";
		public static final String POLLUTION_CONTROL_BOARD_NOC = "pollutionControlBoardNOC";
		public static final String FIRE_SYSTEM = "fireSystem";
		public static final String FIRE_NOC = "fireNOC";
		public static final String WARRANTY_CARD_FOR_WATER_ACCESSORIES = "warrantyCardForWaterAccessories";
		public static final String WARRANTY_CARD_FOR_WHITE_GOODS = "warrantyCardForWhiteGoods";

		public static final String STAMP_DUTY_BORNE_BY = "stampDuty";
		
		public static final Map<ImmutablePair<String, String>, List<String>> kQuestionMap = new HashMap<ImmutablePair<String, String>, List<String>>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 6769948720195889153L;

			{
				put(new ImmutablePair<>("Landlord", "landlordDetails"),
						Arrays.asList("landlordType", "landlordName", "ownershipPercentage", "landlordPan"));
				put(new ImmutablePair<>("Property", "roomType"),
						Arrays.asList("shapeOfTheRoom", "roomCount", "lengthOfRoom", "widthOfRoom"));
			}
		};
}

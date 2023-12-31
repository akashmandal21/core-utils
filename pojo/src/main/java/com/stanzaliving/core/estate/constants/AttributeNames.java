package com.stanzaliving.core.estate.constants;

import java.util.*;

import com.stanzaliving.core.base.utils.ImmutablePair;

public class AttributeNames {

	// propertyAnalysis attribute constants
		public static final String SIZE_OF_PLOT = "sizeOfPlot";
		public static final String TOTAL_PROPERTY_AREA = "areaOfProperty";
		public static final String LEASE_PREMISE_AREA = "areaOfLeasedPremise";
		public static final String NUM_ROOMS = "numberOfRooms";
		public static final String EXPECTED_BED_COUNT = "expectedBedCount";
		public static final String EFFECTIVE_BED_COUNT = "effectiveBedCount";
		public static final String FLOOR_COUNT = "floorCount";
		public static final String POC_NUMBER = "pocNumber";
		public static final String POC_NAME = "pocName";
		public static final String BD_USER_UUID="bdUserUuid";

		public static final String TYPE_OF_BRAND = "typeOfBrand";

		public static final String COMPETITOR_NAME = "competitorName";

		public static final String ROOM_TYPE = "roomType";
		public static final String ROOM_COUNT = "roomCount";

		public static final String BUILDING_HANDOVER_DATE = "buildingHandoverDate";

		public static final String TERRACE_ACCESSIBLE = "terraceAreaCoverage";

		public static final String NUMBER_OF_FLOORS = "floorCount";

		public static final String NUMBER_OF_STILT_ROOMS = "stiltNumberOfRooms";

		public static final String NUMBER_OF_AC_ROOMS = "acRoomsProposed";
		
		public static final String NUMBER_OF_TOWERS = "towerCount";
		
		public static final String FLOOR_STARTS_FROM = "startLeasedFloorFrom";
		
		public static final String NUMBER_OF_DINING_SPACE = "diningAreaCount";
		
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

		public static final String POWER_BACKUP_SIZE = "powerBackupCapacity";

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

		public static final String COMMENTS_ON_COMMERCIALS = "commentOnCommercials";
		
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

		public static final String TERRACE_ACCESS = "terraceAccess";
		public static final String STILT = "stilt";

	// Financial analysis attributes
		public static final String FIN_ANNUAL_RENT = "annualRent";
		public static final String FIN_NUM_INSTALLMENTS = "numberOfInstallments";
		public static final String FIN_MONTHLY_RENT = "monthlyRent";
		public static final String FIN_LEASE_DURATION_IN_YEARS = "leaseDurationInYears";
		public static final String FIN_SECURITY_DEPOSITE_MONTHS_OF_RENT = "securityDepositMonthsOfRent";
		public static final String FIN_SECURITY_DEPOSIT_RENT_VALUE = "securityDepositRentAmount";
		public static final String FIN_SECURITY_DEPOSIT_ADJUST_LAST_NUM_MONTHS = "securityDepositAdjustedNumLastMonths";
		public static final String FIN_RENTAL_INFLATION_IN_YEARS = "rentalInflationInYears";
		public static final String FIN_RENTAL_INFLATION_PERCENT = "rentalInflationPercent";
		public static final String FIN_ADVANCE_RENT_MONTH_COUNT = "advanceRentMonthCount";
		public static final String FIN_AMORTIZED_PERIOD_IN_MONTHS = "amortizedPeriodInMonths";
		public static final String FIN_LEASE_LOCKIN_PERIOD_IN_YEARS = "leaseLockInPeriodInYears";
		public static final String FIN_LEASE_LOCKIN_PERIOD_IN_MONTHS = "leaseLockInPeriodInMonths";
		public static final String FIN_TOKEN_DEPOSIT_IN_RUPEES = "tokenDepositInRupees";
		public static final String FIN_NOTICE_PERIOD = "noticePeriodInMonths";


		
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
		public static final String BOREWELL_NUM = "numberOfBorewells";
		public static final String TERM_RESIDENT_COLLECTION_MONTH_NAMES = "nameOfMonths";


		
	//ATL Details  
		public static final String STRUCTURE_REMARKS = "structureRemarks";
		public static final String FIRE_COMPLIANCE_REMARKS = "fireComplianceRemarks";
		public static final String FIRE_CLAUSE_C_REMARKS = "fireClauseCRemarks";
		public static final String FIRE_CLAUSE_E_REMARKS = "fireClauseERemarks";
		public static final String FIRE_CLAUSE_D_REMARKS = "fireClauseDRemarks";
		public static final String SEEPAGE_CLAUSE_D_REMARKS = "seepageClauseDRemarks";
		public static final String DRAINAGE_CLAUSE_A_REMARKS = "drainageClauseARemarks";
		public static final String FIRE_DEVICES_SUPPLY_INSTALLATION_TESTING_REMARKS = "fireDevicesSupplyInstallationTestingRemarks";
		public static final String CORRECTION_OF_SEEPAGE_REMARKS = "correctionOfSeepageRemarks";
		public static final String FIX_ISSUES_RELATED_TO_DRAINAGE_REMARKS = "fixIssuesRelatedToDrainageRemarks";
		public static final String WATER_PROOFING_WORK_ON_TERRACE_REMARKS = "waterProofingWorkOnTerraceRemarks";
		public static final String CONNECTED_WATER_SUPPLY_REMARKS = "connectedWaterSupplyRemarks";
		public static final String FULLY_FUNCTIONAL_WATER_PUMPS_REMARKS = "fullyFunctionalWaterPumpsRemarks";
		public static final String AUTOMATION_OF_WATER_STORAGE_REMARKS = "automationOfWaterStorageRemarks";
		public static final String BASEMENT_OTHER_AREAS_MAY_REMARKS = "basementOtherAreasMayRemarks";
		public static final String WATER_SUPPLY_BOREWELL_REMARKS = "waterSupplyBorewellRemarks";
		public static final String WATER_SUPPLY_WATER_COST_REMARKS = "waterSupplyWaterCostRemarks";
		public static final String WATER_TANK_CAPACITY_TO_BE_CALCULATED_REMARKS = "waterTankCapacityToBeCalculatedRemarks";
		public static final String WATER_STORAGE_CLAUSE_B_REMARKS = "waterStorageClauseBRemarks";
		public static final String WATER_STORAGE_CLAUSE_C_REMARKS = "waterStorageClauseCRemarks";
		public static final String WATER_SUPPLY_CLAUSE_G_REMARKS = "waterSupplyClauseGRemarks";
		public static final String WATER_SUPPLY_CLAUSE_H_REMARKS = "waterSupplyClauseHRemarks";

		public static final String SITE_CLAUSE_A_REMARKS = "siteClauseARemarks";
		public static final String SITE_CLAUSE_B_REMARKS = "siteClauseBRemarks";
		public static final String SITE_CLAUSE_C_REMARKS = "siteClauseCRemarks";

		public static final String ANY_MASONRY_PLASTER_CRACKS_REMARKS = "anyMasonryPlasterCracksRemarks";
		public static final String EXTERNAL_DOOR_WINDOWS_REMARKS = "externalDoorWindowsRemarks";
		
		public static final String EXTERIOR_FACADE_CLOSER_REMARKS = "exteriorFacadeCloserRemarks";
		public static final String FACADE_REPAINTING_REMARKS = "facadeRepaintingRemarks";

		public static final String COMMON_FLTY_CLAUSE_A_REMARKS = "commonFacilitiesARemarks";
		public static final String COMMON_FLTY_CLAUSE_B_REMARKS = "commonFacilitiesBRemarks";
		public static final String COMMON_FLTY_CLAUSE_C_REMARKS = "commonFacilitiesCRemarks";
		public static final String COMMON_FLTY_CLAUSE_D_REMARKS = "commonFacilitiesDRemarks";

		public static final String DINING_CLAUSE_A_REMARKS = "diningClauseARemarks";
		public static final String DINING_CLAUSE_B_REMARKS = "diningClauseBRemarks";
		public static final String DINING_CLAUSE_C_REMARKS = "diningClauseCRemarks";
		public static final String DINING_CLAUSE_D_REMARKS = "diningClauseDRemarks";
		public static final String DINING_CLAUSE_E_REMARKS = "diningClauseERemarks";
		public static final String DINING_CLAUSE_F_REMARKS = "diningClauseFRemarks";
		public static final String DINING_CLAUSE_G_REMARKS = "diningClauseGRemarks";
		public static final String DINING_CLAUSE_H_REMARKS = "diningClauseHRemarks";
		public static final String DINING_CLAUSE_I_REMARKS = "diningClauseIRemarks";
		public static final String DINING_CLAUSE_J_REMARKS = "diningClauseJRemarks";

		public static final String KITCHEN_CLAUSE_A_REMARKS = "kitchenClauseARemarks";
		public static final String KITCHEN_CLAUSE_B_REMARKS = "kitchenClauseBRemarks";
		public static final String KITCHEN_CLAUSE_C_REMARKS = "kitchenClauseCRemarks";
		public static final String KITCHEN_CLAUSE_D_REMARKS = "kitchenClauseDRemarks";

		public static final String CIRCULATION_CLAUSE_A_REMARKS = "circulationClauseARemarks";
		public static final String CIRCULATION_CLAUSE_B_REMARKS = "circulationClauseBRemarks";
		public static final String CIRCULATION_CLAUSE_C_REMARKS = "circulationClauseCRemarks";
		public static final String CIRCULATION_CLAUSE_D_REMARKS = "circulationClauseDRemarks";
		public static final String CIRCULATION_CLAUSE_E_REMARKS = "circulationClauseERemarks";


		public static final String WEATHER_PROOF_ROOF_REMARKS = "weatherProofRoofRemarks";
		public static final String USABLE_TERRACE_REMARKS = "usableTerraceRemarks";
		public static final String FINISHED_FLOORING_REMARKS = "finishedFlooringRemarks";
		public static final String LL_FUNCTIONAL_TOILETS_REMARKS = "llFunctionalToiletsRemarks";
		public static final String LL_TOILETS_AT_TERRACE_REMARKS = "llToiletsAtTerraceRemarks";
		public static final String FFL_ON_TERRACE_REMARKS = "fflOnTerraceRemarks";
		public static final String LL_EXTERIOR_FACADE_REMARKS = "llExteriorFacadeRemarks";
		public static final String PROTECTIVE_RAILING_REMARKS = "protectiveRailingRemarks";
		public static final String EXTERIOR_FACADE_REMARKS = "terraceExteriorFacade";
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
		public static final String ROOM_CLAUSE_G_REMARKS = "roomClauseGRemarks";
		public static final String ROOM_CLAUSE_H_REMARKS = "roomClauseHRemarks";
		public static final String ROOM_CLAUSE_I_REMARKS = "roomClauseIRemarks";
		public static final String ROOM_CLAUSE_J_REMARKS = "roomClauseJRemarks";
		public static final String ROOM_CLAUSE_K_REMARKS = "roomClauseKRemarks";
		public static final String ROOM_CLAUSE_L_REMARKS = "roomClauseLRemarks";
		public static final String ROOM_CLAUSE_M_REMARKS = "roomClauseMRemarks";
		public static final String ROOM_CLAUSE_N_REMARKS = "roomClauseNRemarks";
		public static final String ROOM_CLAUSE_O_REMARKS = "roomClauseORemarks";
		public static final String ROOM_CLAUSE_P_REMARKS = "roomClausePRemarks";
		public static final String ROOM_CLAUSE_Q_REMARKS = "roomClauseQRemarks";



		public static final String ROOM_PAINT_REMARKS = "roomPaintRemarks";

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
		public static final String WHITE_GOODS_REPLACEMENT_REMARKS = "whiteGoodsReplacementRemarks";
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
		public static final String EQUIPMENT_CLAUSE_A_REMARKS = "equipmentClauseARemarks";
		public static final String EQUIPMENT_CLAUSE_B_REMARKS = "equipmentClauseBRemarks";
		public static final String EQUIPMENT_CLAUSE_C_REMARKS = "equipmentClauseCRemarks";
		public static final String EQUIPMENT_CLAUSE_D_REMARKS = "equipmentClauseDRemarks";
		public static final String EQUIPMENT_CLAUSE_E_REMARKS = "equipmentClauseERemarks";
		public static final String ASSET_CLAUSE_A_REMARKS = "assetClauseARemarks";
		public static final String ALL_TEST_CERTIFICATE_AND_DOCUMENTS = "allTestCertificateAndDocuments";
		public static final String LIGHTING_AND_POWER_TO_BE_INSTALLED_REMARKS = "lightingAndPowerToBeInstalledRemarks";
		public static final String INTERIOR_PAINT_COMMON_AREA_REMARKS = "interiorPaintCommonAreaRemarks";
		public static final String BERGER_PAINT_CODE_COMMON_AREA_REMARKS = "bergerPaintCodeCommonAreaRemarks";
		public static final String GENERAL_LIGHTING_COMMON_AREA_REMARKS = "generalCommonAreaLightingRemarks";
		public static final String DIESEL_GENERATOR_AMC_COMMON_AREA_REMARKS = "dieselGenAMCCommonAreaRemarks";

		public static final String INTERIOR_PAINT_CORRIDOR_REMARKS = "interiorPaintCorridorRemarks";
		public static final String BERGER_PAINT_CODE_CORRIDOR_REMARKS = "bergerPaintCodeCorridorRemarks";
		public static final String GENERAL_LIGHTING_CORRIDOR_REMARKS = "generalCorridorLightingRemarks";
		public static final String DIESEL_GENERATOR_AMC_CORRIDOR_REMARKS = "dieselGenAMCCorridorRemarks";
	//ATL Details  
		public static final String STRUCTURE_CLAUSE_A_BOOLEAN = "structureClauseABoolean";
		public static final String FIRE_CLAUSE_A_BOOLEAN = "fireClauseABoolean";
		public static final String FIRE_CLAUSE_B_BOOLEAN = "fireClauseBBoolean";
		public static final String FIRE_CLAUSE_C_BOOLEAN = "fireClauseCBoolean";
		public static final String FIRE_CLAUSE_D_BOOLEAN = "fireClauseDBoolean";
		public static final String FIRE_CLAUSE_E_BOOLEAN = "fireClauseEBoolean";
		public static final String SEEPAGE_CLAUSE_A_BOOLEAN = "seepageClauseABoolean";
		public static final String SEEPAGE_CLAUSE_B_BOOLEAN = "seepageClauseBBoolean";
		public static final String SEEPAGE_CLAUSE_C_BOOLEAN = "seepageClauseCBoolean";
		public static final String SEEPAGE_CLAUSE_D_BOOLEAN = "seepageClauseDBoolean";
		public static final String DRAINAGE_CLAUSE_A_BOOLEAN = "drainageClauseABoolean";
		public static final String WATER_SUPPLY_CLAUSE_A_BOOLEAN = "waterSupplyClauseABoolean";
		public static final String WATER_SUPPLY_CLAUSE_B_BOOLEAN = "waterSupplyClauseBBoolean";
		public static final String WATER_SUPPLY_CLAUSE_C_BOOLEAN = "waterSupplyClauseCBoolean";
		public static final String WATER_SUPPLY_CLAUSE_D_BOOLEAN = "waterSupplyClauseDBoolean";
		public static final String WATER_SUPPLY_CLAUSE_E_BOOLEAN = "waterSupplyClauseEBoolean";
		public static final String WATER_SUPPLY_CLAUSE_F_BOOLEAN = "waterSupplyClauseFBoolean";
		public static final String WATER_STORAGE_CLAUSE_A_BOOLEAN = "waterStorageClauseABoolean";
		public static final String WATER_STORAGE_CLAUSE_B_BOOLEAN = "waterStorageClauseBBoolean";
		public static final String WATER_STORAGE_CLAUSE_C_BOOLEAN = "waterStorageClauseCBoolean";
		public static final String WATER_SUPPLY_CLAUSE_G_BOOLEAN = "waterSupplyClauseGBoolean";
		public static final String WATER_SUPPLY_CLAUSE_H_BOOLEAN = "waterSupplyClauseHBoolean";

		public static final String SITE_CLAUSE_A_BOOLEAN = "siteClauseABoolean";
		public static final String SITE_CLAUSE_B_BOOLEAN = "siteClauseBBoolean";
		public static final String SITE_CLAUSE_C_BOOLEAN = "siteClauseCBoolean";

		public static final String FACADE_CLAUSE_A_BOOLEAN = "facadeClauseABoolean";
		public static final String FACADE_CLAUSE_B_BOOLEAN = "facadeClauseBBoolean";
		public static final String FACADE_CLAUSE_C_BOOLEAN = "facadeClauseCBoolean";
		public static final String FACADE_CLAUSE_D_BOOLEAN = "facadeClauseDBoolean";
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
		public static final String ROOM_CLAUSE_G_BOOLEAN = "roomClauseGBoolean";
		public static final String ROOM_CLAUSE_H_BOOLEAN = "roomClauseHBoolean";
		public static final String ROOM_CLAUSE_I_BOOLEAN = "roomClauseIBoolean";
		public static final String ROOM_CLAUSE_J_BOOLEAN = "roomClauseJBoolean";
		public static final String ROOM_CLAUSE_K_BOOLEAN = "roomClauseKBoolean";
		public static final String ROOM_CLAUSE_L_BOOLEAN = "roomClauseLBoolean";
		public static final String ROOM_CLAUSE_M_BOOLEAN = "roomClauseMBoolean";
		public static final String ROOM_CLAUSE_N_BOOLEAN = "roomClauseNBoolean";
		public static final String ROOM_CLAUSE_O_BOOLEAN = "roomClauseOBoolean";
		public static final String ROOM_CLAUSE_P_BOOLEAN = "roomClausePBoolean";
		public static final String ROOM_CLAUSE_Q_BOOLEAN = "roomClauseQBoolean";
		public static final String SANITARY_CLAUSE_A_BOOLEAN = "sanitaryClauseABoolean";
		public static final String SANITARY_CLAUSE_B_BOOLEAN = "sanitaryClauseBBoolean";
		public static final String SANITARY_CLAUSE_C_BOOLEAN = "sanitaryClauseCBoolean";
		public static final String SANITARY_CLAUSE_D_BOOLEAN = "sanitaryClauseDBoolean";
		public static final String SANITARY_CLAUSE_E_BOOLEAN = "sanitaryClauseEBoolean";
		public static final String EQPT_CLAUSE_A_BOOLEAN = "equipmentClauseABoolean";
		public static final String EQPT_CLAUSE_B_BOOLEAN = "equipmentClauseBBoolean";
		public static final String EQPT_CLAUSE_C_BOOLEAN = "equipmentClauseCBoolean";
		public static final String EQPT_CLAUSE_D_BOOLEAN = "equipmentClauseDBoolean";
		public static final String EQPT_CLAUSE_E_BOOLEAN = "equipmentClauseEBoolean";
		public static final String ASSET_CLAUSE_A_BOOLEAN = "assetClauseABoolean";



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

		public static final String COMMON_FCLT_A_BOOLEAN = "commonFacilitiesABoolean";
		public static final String COMMON_FCLT_B_BOOLEAN = "commonFacilitiesBBoolean";
		public static final String COMMON_FCLT_C_BOOLEAN = "commonFacilitiesCBoolean";
		public static final String COMMON_FCLT_D_BOOLEAN = "commonFacilitiesDBoolean";

		public static final String DINING_CLAUSE_A_BOOLEAN = "diningClauseABoolean";
		public static final String DINING_CLAUSE_B_BOOLEAN = "diningClauseBBoolean";
		public static final String DINING_CLAUSE_C_BOOLEAN = "diningClauseCBoolean";
		public static final String DINING_CLAUSE_D_BOOLEAN = "diningClauseDBoolean";
		public static final String DINING_CLAUSE_E_BOOLEAN = "diningClauseEBoolean";
		public static final String DINING_CLAUSE_F_BOOLEAN = "diningClauseFBoolean";
		public static final String DINING_CLAUSE_G_BOOLEAN = "diningClauseGBoolean";
		public static final String DINING_CLAUSE_H_BOOLEAN = "diningClauseHBoolean";
		public static final String DINING_CLAUSE_I_BOOLEAN = "diningClauseIBoolean";
		public static final String DINING_CLAUSE_J_BOOLEAN = "diningClauseJBoolean";

		public static final String KITCHEN_CLAUSE_A_BOOLEAN = "kitchenClauseABoolean";
		public static final String KITCHEN_CLAUSE_B_BOOLEAN = "kitchenClauseBBoolean";
		public static final String KITCHEN_CLAUSE_C_BOOLEAN = "kitchenClauseCBoolean";
		public static final String KITCHEN_CLAUSE_D_BOOLEAN = "kitchenClauseDBoolean";

		public static final String CIRC_SPACES_CLAUSE_A_BOOLEAN = "circulationClauseABoolean";
		public static final String CIRC_SPACES_CLAUSE_B_BOOLEAN = "circulationClauseBBoolean";
		public static final String CIRC_SPACES_CLAUSE_C_BOOLEAN = "circulationClauseCBoolean";
		public static final String CIRC_SPACES_CLAUSE_D_BOOLEAN = "circulationClauseDBoolean";
		public static final String CIRC_SPACES_CLAUSE_E_BOOLEAN = "circulationClauseEBoolean";


		public static final String STRUCTURE_CLAUSE_A_TEXT_AREA = "structureClauseATextArea";
		public static final String FIRE_CLAUSE_A_TEXT_AREA = "fireClauseATextArea";
		public static final String FIRE_CLAUSE_D_TEXT_AREA = "fireClauseDTextArea";
		public static final String FIRE_CLAUSE_E_TEXT_AREA = "fireClauseETextArea";
		public static final String FIRE_CLAUSE_C_TEXT_AREA = "fireClauseCTextArea";
		public static final String FIRE_CLAUSE_B_TEXT_AREA = "fireClauseBTextArea";
		public static final String SEEPAGE_CLAUSE_D_TEXT_AREA = "seepageClauseDTextArea";
		public static final String SEEPAGE_CLAUSE_A_TEXT_AREA = "seepageClauseATextArea";
		public static final String SEEPAGE_CLAUSE_B_TEXT_AREA = "seepageClauseBTextArea";
		public static final String SEEPAGE_CLAUSE_C_TEXT_AREA = "seepageClauseCTextArea";
		public static final String DRAINAGE_CLAUSE_A_TEXT_AREA = "drainageClauseATextArea";
		public static final String WATER_SUPPLY_CLAUSE_A_TEXT_AREA = "waterSupplyClauseATextArea";
		public static final String WATER_SUPPLY_CLAUSE_B_TEXT_AREA = "waterSupplyClauseBTextArea";
		public static final String WATER_SUPPLY_CLAUSE_C_TEXT_AREA = "waterSupplyClauseCTextArea";
		public static final String WATER_SUPPLY_CLAUSE_D_TEXT_AREA = "waterSupplyClauseDTextArea";
		public static final String WATER_SUPPLY_CLAUSE_E_TEXT_AREA = "waterSupplyClauseETextArea";
		public static final String WATER_SUPPLY_CLAUSE_F_TEXT_AREA = "waterSupplyClauseFTextArea";
		public static final String WATER_SUPPLY_CLAUSE_G_TEXT_AREA = "waterSupplyClauseGTextArea";
		public static final String WATER_SUPPLY_CLAUSE_H_TEXT_AREA = "waterSupplyClauseHTextArea";

		public static final String WATER_STORAGE_CLAUSE_A_TEXT_AREA = "waterStorageClauseATextArea";
		public static final String WATER_STORAGE_CLAUSE_B_TEXT_AREA = "waterStorageClauseBTextArea";
		public static final String WATER_STORAGE_CLAUSE_C_TEXT_AREA = "waterStorageClauseCTextArea";

		public static final String SITE_CLAUSE_A_TEXT_AREA = "siteClauseATextArea";
		public static final String SITE_CLAUSE_B_TEXT_AREA = "siteClauseBTextArea";
		public static final String SITE_CLAUSE_C_TEXT_AREA = "siteClauseCTextArea";

		public static final String FACADE_CLAUSE_A_TEXT_AREA = "facadeClauseATextArea";
		public static final String FACADE_CLAUSE_B_TEXT_AREA = "facadeClauseBTextArea";
		public static final String FACADE_CLAUSE_C_TEXT_AREA = "facadeClauseCTextArea";
		public static final String FACADE_CLAUSE_D_TEXT_AREA = "facadeClauseDTextArea";
		public static final String FACADE_CLAUSE_B_TEXT_AREA_1 = "facadeClauseBTextArea1";
		public static final String FACADE_CLAUSE_B_TEXT_AREA_2 = "facadeClauseBTextArea2";
		public static final String FACADE_CLAUSE_B_TEXT_AREA_3 = "facadeClauseBTextArea3";
		public static final String TERRACE_AREA_CLAUSE_A_TEXT_AREA = "terraceAreaClauseATextArea";
		public static final String TERRACE_AREA_CLAUSE_B_TEXT_AREA = "terraceAreaClauseBTextArea";
		public static final String TERRACE_AREA_CLAUSE_C_TEXT_AREA = "terraceAreaClauseCTextArea";
		public static final String TERRACE_AREA_CLAUSE_D_TEXT_AREA = "terraceAreaClauseDTextArea";
		public static final String TERRACE_AREA_CLAUSE_E_TEXT_AREA = "terraceAreaClauseETextArea";
		public static final String TERRACE_AREA_CLAUSE_F_TEXT_AREA = "terraceAreaClauseFTextArea";
		public static final String TERRACE_AREA_CLAUSE_G_TEXT_AREA = "terraceAreaClauseGTextArea";
		public static final String TERRACE_AREA_CLAUSE_H_TEXT_AREA = "terraceAreaClauseHTextArea";
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
		public static final String ROOM_CLAUSE_G_TEXT_AREA = "roomClauseGTextArea";
		public static final String ROOM_CLAUSE_H_TEXT_AREA = "roomClauseHTextArea";
		public static final String ROOM_CLAUSE_I_TEXT_AREA = "roomClauseITextArea";
		public static final String ROOM_CLAUSE_J_TEXT_AREA = "roomClauseJTextArea";
		public static final String ROOM_CLAUSE_K_TEXT_AREA = "roomClauseKTextArea";
		public static final String ROOM_CLAUSE_L_TEXT_AREA = "roomClauseLTextArea";
		public static final String ROOM_CLAUSE_M_TEXT_AREA = "roomClauseMTextArea";
		public static final String ROOM_CLAUSE_N_TEXT_AREA = "roomClauseNTextArea";
		public static final String ROOM_CLAUSE_O_TEXT_AREA = "roomClauseOTextArea";
		public static final String ROOM_CLAUSE_P_TEXT_AREA = "roomClausePTextArea";
		public static final String ROOM_CLAUSE_Q_TEXT_AREA = "roomClauseQTextArea";




		public static final String ROOM_PAINT_CLAUSE_TEXT_AREA = "roomPaintClauseTextArea";
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
		public static final String WHITE_GOODS_CLAUSE_F_TEXT_AREA = "whiteGoodsClauseFTextArea";
		public static final String ELECTRICAL_CLAUSE_A_TEXT_AREA = "electricalClauseATextArea";
		public static final String ELECTRICAL_CLAUSE_B_TEXT_AREA = "electricalClauseBTextArea";
		public static final String ELECTRICAL_CLAUSE_C_TEXT_AREA = "electricalClauseCTextArea";
		public static final String ELECTRICAL_CLAUSE_D_TEXT_AREA = "electricalClauseDTextArea";
		public static final String ELECTRICAL_CLAUSE_D_TEXT_AREA_1 = "electricalClauseDTextArea1";
		public static final String ELECTRICAL_CLAUSE_D_TEXT_AREA_2 = "electricalClauseDTextArea2";

		public static final String ELECTRICAL_CLAUSE_E_TEXT_AREA = "electricalClauseETextArea";
		public static final String EQUIPMENT_CLAUSE_A_TEXT_AREA = "equipmentClauseATextArea";
		public static final String EQUIPMENT_CLAUSE_B_TEXT_AREA = "equipmentClauseBTextArea";
		public static final String EQUIPMENT_CLAUSE_C_TEXT_AREA = "equipmentClauseCTextArea";
		public static final String EQUIPMENT_CLAUSE_D_TEXT_AREA = "equipmentClauseDTextArea";
		public static final String EQUIPMENT_CLAUSE_E_TEXT_AREA = "equipmentClauseETextArea";
		public static final String ASSET_CLAUSE_A_TEXT_AREA = "assetClauseATextArea";
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
		public static final String COMMON_AREAS_CLAUSE_B_TEXT_AREA = "commonAreasClauseBTextArea";
		public static final String COMMON_AREAS_CLAUSE_C_TEXT_AREA = "commonAreasClauseCTextArea";
		public static final String COMMON_AREAS_CLAUSE_D_TEXT_AREA = "commonAreasClauseDTextArea";
		public static final String COMMON_AREAS_CLAUSE_E_TEXT_AREA = "commonAreasClauseETextArea";


		public static final String COMMON_FLTY_CLAUSE_A_TEXT_AREA = "commonFacilitiesATextArea";
		public static final String COMMON_FLTY_CLAUSE_B_TEXT_AREA = "commonFacilitiesBTextArea";
		public static final String COMMON_FLTY_CLAUSE_C_TEXT_AREA = "commonFacilitiesCTextArea";
		public static final String COMMON_FLTY_CLAUSE_D_TEXT_AREA = "commonFacilitiesDTextArea";


		public static final String DINING_CLAUSE_A_TEXT_AREA = "diningClauseATextArea";
		public static final String DINING_CLAUSE_B_TEXT_AREA = "diningClauseBTextArea";
		public static final String DINING_CLAUSE_C_TEXT_AREA = "diningClauseCTextArea";
		public static final String DINING_CLAUSE_D_TEXT_AREA = "diningClauseDTextArea";
		public static final String DINING_CLAUSE_E_TEXT_AREA = "diningClauseETextArea";
		public static final String DINING_CLAUSE_F_TEXT_AREA = "diningClauseFTextArea";
		public static final String DINING_CLAUSE_G_TEXT_AREA = "diningClauseGTextArea";
		public static final String DINING_CLAUSE_H_TEXT_AREA = "diningClauseHTextArea";
		public static final String DINING_CLAUSE_I_TEXT_AREA = "diningClauseITextArea";
		public static final String DINING_CLAUSE_J_TEXT_AREA = "diningClauseJTextArea";

		public static final String KITCHEN_CLAUSE_A_TEXT_AREA = "kitchenClauseATextArea";
		public static final String KITCHEN_CLAUSE_B_TEXT_AREA = "kitchenClauseBTextArea";
		public static final String KITCHEN_CLAUSE_C_TEXT_AREA = "kitchenClauseCTextArea";
		public static final String KITCHEN_CLAUSE_D_TEXT_AREA = "kitchenClauseDTextArea";

		public static final String CIRCULATION_CLAUSE_A_TEXT_AREA = "circulationClauseATextArea";
		public static final String CIRCULATION_CLAUSE_B_TEXT_AREA = "circulationClauseBTextArea";
		public static final String CIRCULATION_CLAUSE_C_TEXT_AREA = "circulationClauseCTextArea";
		public static final String CIRCULATION_CLAUSE_D_TEXT_AREA = "circulationClauseDTextArea";
		public static final String CIRCULATION_CLAUSE_E_TEXT_AREA = "circulationClauseETextArea";

		public static final String SIGNAGE_CLAUSE_A_TEXT_AREA = "signangeLevelClauseATextArea";
		public static final String SIGNAGE_CLAUSE_A_REMARK = "signangeRemarks";
		
		public static final String IT_CLAUSE_A_TEXT_AREA = "ITLevelClauseATextArea";
		public static final String IT_CLAUSE_A_REMARK = "cctvWithDvrRemarks";
		
		public static final String IT_CLAUSE_B_TEXT_AREA = "ITLevelClauseBTextArea";
		public static final String IT_CLAUSE_B_REMARK = "highSpeedBroadbandRemarks";

		public static final String IT_CLAUSE_C_TEXT_AREA = "ITLevelClauseCTextArea";
		public static final String IT_CLAUSE_C_REMARK = "dthConnectionRemarks";

		public static final String SUPERVISOR_ROOM_CLAUSE_A_TEXT_AREA = "SupervisorLevelClauseATextArea";
		public static final String SUPERVISOR_ROOM_CLAUSE_A_REMARK = "supervisorRoomRemarks";

		public static final String PARKING_CLAUSE_A_TEXT_AREA = "parkingLevelClauseATextArea";
		public static final String PARKING_CLAUSE_A_REMARK = "parkingRemarks";
		
		public static final String LANDSCAPE_CLAUSE_A_TEXT_AREA = "landscapeLevelClauseATextArea";
		public static final String LANDSCAPE_CLAUSE_A_REMARK = "softAndHardRemarks";
		
		public static final String LANDSCAPE_CLAUSE_B_TEXT_AREA = "landscapeLevelClauseBTextArea";
		public static final String LANDSCAPE_CLAUSE_B_REMARK = "paversRemarks";

		public static final String BOUNDARY_WALL_CLAUSE_A_TEXT_AREA = "boundaryWallClauseATextArea";
		public static final String BOUNDARY_WALL_CLAUSE_A_REMARK = "boundaryWallPaintRemarks";
		
		public static final String BOUNDARY_WALL_CLAUSE_B_TEXT_AREA = "boundaryWallClauseBTextArea";
		public static final String BOUNDARY_WALL_CLAUSE_B_REMARK = "lightFixtureOnEntraceRemarks";

		public static final String CORRIDOR_CLAUSE_A_TEXT_AREA = "corridorClauseATextArea";
		public static final String CORRIDOR_CLAUSE_B_TEXT_AREA = "corridorClauseBTextArea";
		public static final String CORRIDOR_CLAUSE_C_TEXT_AREA = "corridorClauseCTextArea";
		public static final String CORRIDOR_CLAUSE_D_TEXT_AREA = "corridorClauseDTextArea";

		public static final String DUE_DILIGINCE_CHECKLIST_1 = "dueDigilenceChecklist1";
		public static final String DUE_DILIGINCE_CHECKLIST_2 = "dueDigilenceChecklist2";
		public static final String DUE_DILIGINCE_CHECKLIST_3 = "dueDigilenceChecklist3";
		public static final String DUE_DILIGINCE_CHECKLIST_4 = "dueDigilenceChecklist4";
		public static final String DUE_DILIGINCE_CHECKLIST_5 = "dueDigilenceChecklist5";
		public static final String DUE_DILIGINCE_CHECKLIST_6 = "dueDigilenceChecklist6";
		public static final String DUE_DILIGINCE_CHECKLIST_7 = "dueDigilenceChecklist7";
		public static final String DUE_DILIGINCE_CHECKLIST_8 = "dueDigilenceChecklist8";
		public static final String DUE_DILIGINCE_CHECKLIST_9 = "dueDigilenceChecklist9";
		public static final String DUE_DILIGINCE_CHECKLIST_10 = "dueDigilenceChecklist10";
		public static final String DUE_DILIGINCE_CHECKLIST_11 = "dueDigilenceChecklist11";
		public static final String DUE_DILIGINCE_CHECKLIST_12 = "dueDigilenceChecklist12";
		public static final String DUE_DILIGINCE_CHECKLIST_13 = "dueDigilenceChecklist13";

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

		/************************************************************************************************************
		Used in Legal Service to create Atl / Deal Term Documents
		 ************************************************************************************************************/
		public static final String LANDLORD_DETAILS_FOR_DOC = "landlordDetailsForDoc";
		public static final String LEASED_PREMISES_DESCRIPTION_FOR_DOC = "leasedPremisesDescriptionForDoc";
		public static final String STAMP_DUTY_DESCRIPTION_FOR_DOC = "stampDutyDescriptionForDoc";
		public static final String ANNUAL_RENT_FOR_DOC = "annualRentForDoc";
		public static final String RENT_INSTALLMENTS_FOR_DOC = "rentInstallmentForDoc";
		public static final String ADDRESS_FOR_DOC = "addressForDoc";
		public static final String CURRENT_YEAR = "currentYear";
		public static final String SECURITY_DEPOSIT_AMOUNT_IFSRD = "securityDepositAmountForIFSRD";
		public static final String CITY_NAME = "cityName";
		public static final String ROOM_COUNT_FOR_ATL ="roomCountAtl";



		/*********************************BTS Question Attributes******************************************/
		public static final String ON_SIGNING_ATL_BTS = "onSigningATLBTS";
		public static final String ON_FLOOR_SLAB_COMPLETION_BTS = "onFloorSlabCompletionBTS";
		public static final String OTHERS_BTS = "othersBTS";
		public static final String ON_COMPLETION_BTS = "onCompletionBTS";


		/*********************************Leased Inventory Annexure******************************************/
		public static final String LEASED_INVENTORY_LIST = "leasedInventory";
		
		public static final Map<ImmutablePair<String, String>, List<String>> kQuestionMap = new HashMap<ImmutablePair<String, String>, List<String>>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 6769948720195889153L;

			{
				put(new ImmutablePair<>("Landlord", "landlordDetails"),
						Arrays.asList("landlordType", "landlordName", "landlordRelationType", "landlordRelationName", "ownershipPercentage", "landlordPan", "landlordAge", "landlordAddress"));
				put(new ImmutablePair<>("Property", "roomType"),
						Arrays.asList("shapeOfTheRoom", "lengthOfRoom", "widthOfRoom"));
			}
		};
		public static final String POWER_BACKUP_SIze = "powerBackupCapacity";
		
		public static final List<String> amcKeys = new ArrayList<String>();
		public static final List<String> landlordAgreedKeys = new ArrayList<String>();
		public static final List<String> landlordKeysLOI = Arrays.asList("STRUCTURELOI","waterSupplyClauseABooleanLOI","waterSupplyClauseBBooleanLOI","waterSupplyClauseCBooleanLOI","waterSupplyClauseDBooleanLOI","waterStorageClauseABooleanLOI","facadeClauseABooleanLOI","facadeClauseBBooleanLOI","terraceLevelClauseABooleanLOI","terraceLevelClauseBBooleanLOI","terraceLevelClauseCBooleanLOI","terraceLevelClauseDBooleanLOI","terraceLevelClauseEBooleanLOI","terraceLevelClauseFBooleanLOI","occupiedLevelClauseABooleanLOI","occupiedLevelClauseBBooleanLOI","occupiedLevelClauseCBooleanLOI","occupiedLevelClauseDBooleanLOI","occupiedLevelClauseEBooleanLOI","occupiedLevelClauseFBooleanLOI","roomClauseABooleanLOI","roomClauseBBooleanLOI","roomClauseCBooleanLOI","roomClauseDBooleanLOI","roomClauseEBooleanLOI","roomClauseFBooleanLOI","sanitaryClauseABooleanLOI","sanitaryClauseBBooleanLOI","sanitaryClauseCBooleanLOI","sanitaryClauseDBooleanLOI","sanitaryClauseEBooleanLOI","whiteGoodsClauseABooleanLOI","whiteGoodsClauseBBooleanLOI","whiteGoodsClauseCBooleanLOI","whiteGoodsClauseDBooleanLOI","whiteGoodsClauseEBooleanLOI","electricalClauseABooleanLOI","electricalClauseBBooleanLOI","electricalClauseCBooleanLOI","electricalClauseDBooleanLOI","electricalClauseEBooleanLOI","powerBackupClauseABooleanLOI","powerBackupClauseBBooleanLOI","powerBackupClauseCBooleanLOI","powerBackupClauseDBooleanLOI","liftClauseABooleanLOI","liftClauseBBooleanLOI","liftClauseCBooleanLOI","liftClauseDBooleanLOI","liftClauseEBooleanLOI","docsAndAMCClauseABooleanLOI","commonAreasClauseABooleanLOI","waterSupplyClauseEBooleanLOI","facadeClauseCBooleanLOI","facadeClauseDBooleanLOI","occupiedLevelClauseGBooleanLOI","occupiedLevelClauseHBooleanLOI","occupiedLevelClauseIBooleanLOI","signangeLevelClauseABooleanLOI","ITLevelClauseABooleanLOI","ITLevelClauseBBooleanLOI","ITLevelClauseCBooleanLOI","SupervisorLevelClauseABooleanLOI","parkingLevelClauseABooleanLOI","landscapeLevelClauseABooleanLOI","landscapeLevelClauseBBooleanLOI","fireClauseABooleanLOI","fireClauseBBooleanLOI","seepageClauseABooleanLOI","seepageClauseBBooleanLOI","seepageClauseCBooleanLOI","boundaryWallClauseABooleanLOI","boundaryWallClauseBBooleanLOI");

		public static final Set<String> annexure2AKeys = new HashSet<String>();

		static {
			amcKeys.add(ASSET_LIST_WITH_EXACT_COUNT_RETAINED);
			amcKeys.add(LIFT_LICENSE_AND_RENEWAL);
			amcKeys.add(ELECTRICAL_LOAD_SANCTION_LETTER);
			amcKeys.add(LAST_SIX_MONTHS_ELECTRICITY_BILLS);
			amcKeys.add(LAST_SIX_MONTHS_WATER_BILLS);
			amcKeys.add(UTILITY_BILLS);
			amcKeys.add(POLLUTION_CONTROL_BOARD_NOC);
			amcKeys.add(FIRE_SYSTEM);
			amcKeys.add(FIRE_NOC);
			amcKeys.add(WARRANTY_CARD_FOR_WATER_ACCESSORIES);
			amcKeys.add(WARRANTY_CARD_FOR_WHITE_GOODS);

			landlordAgreedKeys.add("STRUCTURE");
			landlordAgreedKeys.add("commonAreasClauseABoolean");
			landlordAgreedKeys.add("docsAndAMCClauseABoolean");
			landlordAgreedKeys.add("electricalClauseABoolean");
			landlordAgreedKeys.add("electricalClauseBBoolean");
			landlordAgreedKeys.add("electricalClauseCBoolean");
			landlordAgreedKeys.add("electricalClauseDBoolean");
			landlordAgreedKeys.add("electricalClauseEBoolean");
			landlordAgreedKeys.add("facadeClauseABoolean");
			landlordAgreedKeys.add("facadeClauseBBoolean");
			landlordAgreedKeys.add("facadeClauseCBoolean");
			landlordAgreedKeys.add("facadeClauseDBoolean");
			landlordAgreedKeys.add("commonFacilitiesABoolean");
			landlordAgreedKeys.add("commonFacilitiesBBoolean");
			landlordAgreedKeys.add("commonFacilitiesCBoolean");
			landlordAgreedKeys.add("commonFacilitiesDBoolean");
			landlordAgreedKeys.add("diningClauseABoolean");
			landlordAgreedKeys.add("diningClauseBBoolean");
			landlordAgreedKeys.add("diningClauseCBoolean");
			landlordAgreedKeys.add("diningClauseDBoolean");
			landlordAgreedKeys.add("diningClauseEBoolean");
			landlordAgreedKeys.add("diningClauseFBoolean");
			landlordAgreedKeys.add("diningClauseGBoolean");
			landlordAgreedKeys.add("diningClauseHBoolean");
			landlordAgreedKeys.add("diningClauseIBoolean");
			landlordAgreedKeys.add("diningClauseJBoolean");
			landlordAgreedKeys.add("kitchenClauseABoolean");
			landlordAgreedKeys.add("kitchenClauseBBoolean");
			landlordAgreedKeys.add("kitchenClauseCBoolean");
			landlordAgreedKeys.add("kitchenClauseDBoolean");
			landlordAgreedKeys.add("circulationClauseABoolean");
			landlordAgreedKeys.add("circulationClauseBBoolean");
			landlordAgreedKeys.add("circulationClauseCBoolean");
			landlordAgreedKeys.add("circulationClauseDBoolean");
			landlordAgreedKeys.add("circulationClauseEBoolean");
			landlordAgreedKeys.add("fireClauseABoolean");
			landlordAgreedKeys.add("fireClauseBBoolean");
			landlordAgreedKeys.add("fireClauseCBoolean");
			landlordAgreedKeys.add("fireClauseDBoolean");
			landlordAgreedKeys.add("fireClauseEBoolean");
			landlordAgreedKeys.add("liftClauseABoolean");
			landlordAgreedKeys.add("liftClauseBBoolean");
			landlordAgreedKeys.add("liftClauseCBoolean");
			landlordAgreedKeys.add("liftClauseDBoolean");
			landlordAgreedKeys.add("liftClauseEBoolean");
			landlordAgreedKeys.add("occupiedLevelClauseABoolean");
			landlordAgreedKeys.add("occupiedLevelClauseBBoolean");
			landlordAgreedKeys.add("occupiedLevelClauseCBoolean");
			landlordAgreedKeys.add("occupiedLevelClauseDBoolean");
			landlordAgreedKeys.add("waterSupplyClauseEBoolean");
			landlordAgreedKeys.add("occupiedLevelClauseEBoolean");
			landlordAgreedKeys.add("occupiedLevelClauseFBoolean");
			landlordAgreedKeys.add("powerBackupClauseABoolean");
			landlordAgreedKeys.add("powerBackupClauseBBoolean");
			landlordAgreedKeys.add("powerBackupClauseCBoolean");
			landlordAgreedKeys.add("powerBackupClauseDBoolean");
			landlordAgreedKeys.add("roomClauseABoolean");
			landlordAgreedKeys.add("roomClauseBBoolean");
			landlordAgreedKeys.add("roomClauseCBoolean");
			landlordAgreedKeys.add("roomClauseDBoolean");
			landlordAgreedKeys.add("roomClauseEBoolean");
			landlordAgreedKeys.add("roomClauseFBoolean");
			landlordAgreedKeys.add("roomClauseGBoolean");
			landlordAgreedKeys.add("roomClauseHBoolean");
			landlordAgreedKeys.add("roomClauseIBoolean");
			landlordAgreedKeys.add("roomClauseJBoolean");
			landlordAgreedKeys.add("roomClauseKBoolean");
			landlordAgreedKeys.add("roomClauseLBoolean");
			landlordAgreedKeys.add("roomClauseMBoolean");
			landlordAgreedKeys.add("roomClauseNBoolean");
			landlordAgreedKeys.add("roomClauseOBoolean");
			landlordAgreedKeys.add("roomClausePBoolean");
			landlordAgreedKeys.add("equipmentClauseABoolean");
			landlordAgreedKeys.add("equipmentClauseBBoolean");
			landlordAgreedKeys.add("equipmentClauseCBoolean");
			landlordAgreedKeys.add("equipmentClauseDBoolean");
			landlordAgreedKeys.add("equipmentClauseEBoolean");
			landlordAgreedKeys.add("assetClauseABoolean");
			landlordAgreedKeys.add("sanitaryClauseABoolean");
			landlordAgreedKeys.add("sanitaryClauseBBoolean");
			landlordAgreedKeys.add("sanitaryClauseCBoolean");
			landlordAgreedKeys.add("sanitaryClauseDBoolean");
			landlordAgreedKeys.add("sanitaryClauseEBoolean");
			landlordAgreedKeys.add("seepageClauseABoolean");
			landlordAgreedKeys.add("seepageClauseBBoolean");
			landlordAgreedKeys.add("seepageClauseCBoolean");
			landlordAgreedKeys.add("seepageClauseDBoolean");
			landlordAgreedKeys.add("drainageClauseABoolean");
			landlordAgreedKeys.add("terraceLevelClauseABoolean");
			landlordAgreedKeys.add("terraceLevelClauseBBoolean");
			landlordAgreedKeys.add("terraceLevelClauseCBoolean");
			landlordAgreedKeys.add("terraceLevelClauseDBoolean");
			landlordAgreedKeys.add("terraceLevelClauseEBoolean");
			landlordAgreedKeys.add("terraceLevelClauseFBoolean");
			landlordAgreedKeys.add("terraceLevelClauseGBoolean");
			landlordAgreedKeys.add("terraceLevelClauseHBoolean");
			landlordAgreedKeys.add("waterStorageClauseABoolean");
			landlordAgreedKeys.add("waterStorageClauseBBoolean");
			landlordAgreedKeys.add("waterStorageClauseCBoolean");
			landlordAgreedKeys.add("siteClauseABoolean");
			landlordAgreedKeys.add("siteClauseBBoolean");
			landlordAgreedKeys.add("siteClauseCBoolean");
			landlordAgreedKeys.add("waterSupplyClauseABoolean");
			landlordAgreedKeys.add("waterSupplyClauseBBoolean");
			landlordAgreedKeys.add("waterSupplyClauseCBoolean");
			landlordAgreedKeys.add("waterSupplyClauseDBoolean");
			landlordAgreedKeys.add("whiteGoodsClauseABoolean");
			landlordAgreedKeys.add("whiteGoodsClauseBBoolean");
			landlordAgreedKeys.add("whiteGoodsClauseCBoolean");
			landlordAgreedKeys.add("whiteGoodsClauseDBoolean");
			landlordAgreedKeys.add("whiteGoodsClauseEBoolean");
			landlordAgreedKeys.add("roomClauseQBoolean");
			landlordAgreedKeys.add(WATER_SUPPLY_CLAUSE_G_BOOLEAN);
			landlordAgreedKeys.add(WATER_SUPPLY_CLAUSE_H_BOOLEAN);

		}

		static{
			annexure2AKeys.add("beds");
			annexure2AKeys.add("mattressAvailable");
			annexure2AKeys.add("wardrobesAvailable");
			annexure2AKeys.add("diningTables");
			annexure2AKeys.add("diningChairs");
			annexure2AKeys.add("washingMachineAvailable");
			annexure2AKeys.add("fridgeAvailable");
			annexure2AKeys.add("roAvailable");
			annexure2AKeys.add("microwaveAvailable");
			annexure2AKeys.add("acInRoomsAvailable");
			annexure2AKeys.add("extinguishersAvailable");
			annexure2AKeys.add("numberOfBorewells");
		}
		
		
}

package com.stanzaliving.core.legal.enums;

import com.stanzaliving.core.estate.constants.AttributeNames;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.TreeSet;

@AllArgsConstructor
@Getter
public enum AtlDetailsEnum {

    //This enum can be kept in table as well, depending upon whether defaultDuration, scopeDefinitionKey, remarksKey, orderNum or defaultScopeDefinition needs to be modifiable
    STRUCTURE_CLAUSE_A_TEXT_AREA("Structure", "(Lease Term)", AttributeNames.STRUCTURE_CLAUSE_A_TEXT_AREA, AttributeNames.STRUCTURE_REMARKS, "Implementing any amendment based on the structural integrity check carried out by Lessee"),

    FIRE_CLAUSE_A_TEXT_AREA("Fire", "(One Time)", AttributeNames.FIRE_CLAUSE_A_TEXT_AREA, AttributeNames.FIRE_COMPLIANCE_REMARKS, "Fire compliance/NOC required, as applicable"),
    FIRE_CLAUSE_B_TEXT_AREA("Fire", "(One Time)", AttributeNames.FIRE_CLAUSE_B_TEXT_AREA, AttributeNames.FIRE_DEVICES_SUPPLY_INSTALLATION_TESTING_REMARKS, "Supply, Installation, Testing & Commissioning of the Entire Fire Fighting System including Provision of Fire extinguishers or Sprinkler system wherever required, activated firefighting system with charged plumbing line, working hose reels and motor and separate water tanks, to run in auto mode & in compliance with codes & local norms with full working AMC. If no running AMC is there, then one-time cost required to activate a new AMC to be borne by Lessor. Lessor to get unconditional fire NOC at his own cost"),

    SEEPAGE_CLAUSE_A_TEXT_AREA("Seepage", "(Lease Term)", AttributeNames.SEEPAGE_CLAUSE_A_TEXT_AREA, AttributeNames.CORRECTION_OF_SEEPAGE_REMARKS, "Correction of seepage affecting any area in the building. In case of leakage in plumbing pipes, breaking of wall/ floor tiles, get leakage fixed and retiling done"),
    SEEPAGE_CLAUSE_B_TEXT_AREA("Seepage", "(Lease Term)", AttributeNames.SEEPAGE_CLAUSE_B_TEXT_AREA, AttributeNames.FIX_ISSUES_RELATED_TO_DRAINAGE_REMARKS, "Fix Issues related to drainage in the building & interface with municipal authorities"),
    SEEPAGE_CLAUSE_C_TEXT_AREA("Seepage", "(Lease Term)", AttributeNames.SEEPAGE_CLAUSE_C_TEXT_AREA, AttributeNames.WATER_PROOFING_WORK_ON_TERRACE_REMARKS, "Waterproofing work on terrace, wet balcony, external surfaces and washroom to be done with proper drainage and slopes, where required"),

    WATER_SUPPLY_CLAUSE_A_TEXT_AREA("Water Supply", "(Lease Term)", AttributeNames.WATER_SUPPLY_CLAUSE_A_TEXT_AREA, AttributeNames.CONNECTED_WATER_SUPPLY_REMARKS, "Connected water supply from the municipal corporation to be provided for the building, with all municipal clearances and functional water meters"),
    WATER_SUPPLY_CLAUSE_B_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_B_TEXT_AREA, AttributeNames.FULLY_FUNCTIONAL_WATER_PUMPS_REMARKS, "Fully functional water pumps with full working AMC. If the current system does not have AMC, then one-time cost required for a new AMC to be borne by Lessor"),
    WATER_SUPPLY_CLAUSE_C_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_C_TEXT_AREA, AttributeNames.AUTOMATION_OF_WATER_STORAGE_REMARKS, "Automation of water storage and pumping system with full working AMC. If no running AMC is present, then one-time cost required for new AMC to be borne by Lessor"),
    WATER_SUPPLY_CLAUSE_D_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_D_TEXT_AREA, AttributeNames.BASEMENT_OTHER_AREAS_MAY_REMARKS, "Basement/other areas may be susceptible to ingress of water - a sump to pump out water must be installed with working AMC. If no running AMC, then one-time cost to be borne by Lessor"),
    WATER_SUPPLY_CLAUSE_E_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_E_TEXT_AREA, AttributeNames.WATER_SUPPLY_BOREWELL_REMARKS, "Providing Borewells (number as provided hereinabove) with appropriate water levels maintained"),
    WATER_SUPPLY_CLAUSE_F_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_F_TEXT_AREA, AttributeNames.WATER_SUPPLY_WATER_COST_REMARKS, "In case of unavailability of water or borewells running dry the water cost to be equally shared between Lessee and Lessor."),

    WATER_STORAGE_CLAUSE_A_TEXT_AREA("Water Storage", "(One Time)", AttributeNames.WATER_STORAGE_CLAUSE_A_TEXT_AREA, AttributeNames.WATER_TANK_CAPACITY_TO_BE_CALCULATED_REMARKS, "Water tank capacity to be calculated at 200Litres/bed for both the OHT and underground tank. All OHT plumbing tanks need to be connected"),
    WATER_STORAGE_CLAUSE_B_TEXT_AREA("Water Storage", "(Lease Term)", AttributeNames.WATER_STORAGE_CLAUSE_B_TEXT_AREA, AttributeNames.WATER_STORAGE_CLAUSE_B_REMARKS, "In case of unavailability of water or borewells running dry the water cost to be equally shared between lessee and lessor"),
    
    FACADE_CLAUSE_A_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_A_TEXT_AREA, AttributeNames.ANY_MASONRY_PLASTER_CRACKS_REMARKS, "Any masonry/plaster cracks in the facade to be fixed and façade to be painted post fixing in Lessee specified brand colors, as per scheme shared by Lessee <br/><strong>Facade Paint</strong><br/>Paint Code - Asian Paints:<br/>Base Colour - Grand Grape (Blue)<br/>Accent Colout - Eggshell (White), Dessert Glow (Yellow).<br/>Any broken glass to be replaced"),
    FACADE_CLAUSE_B_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_B_TEXT_AREA, AttributeNames.EXTERNAL_DOOR_WINDOWS_REMARKS, "External door/windows - All external door and windows to be checked for faults and repaired. Faults include but are not limited to:<br/>1. Defective hinges - these need to be replaced with functioning ones<br/>2. Cracked or broken shutters or mosquito nets need to be repaired/replaced keeping the same finishes as the existing shutters<br/>3. In sliding windows - the channel to allow for easy movement and a functional drain hole"),
    FACADE_CLAUSE_C_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_C_TEXT_AREA, AttributeNames.EXTERIOR_FACADE_CLOSER_REMARKS, "Owner to Close The Exterior Facade of The Building (typical floors, stilt levels and terrace levels"),
    FACADE_CLAUSE_D_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_D_TEXT_AREA, AttributeNames.FACADE_REPAINTING_REMARKS, "Facade to be Always Repainted Every 3 years and Maintained to Keep it Neat and Clean"),

    TERRACE_AREA_CLAUSE_A_TEXT_AREA("Terrace Level", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_A_TEXT_AREA, AttributeNames.WEATHER_PROOF_ROOF_REMARKS, "In case terrace level is being used for common areas or dining, weatherproof roof to be provided - steel truss with closed system and insulated metal sheeting, waterproof cladding(PUF panel or equivalent sandwich panel with insulation). Lessor to also provide wall closure (aluminum framing with glass infill) with sandwich panel walls on a ledge to make room weatherproof."),
    TERRACE_AREA_CLAUSE_B_TEXT_AREA("Terrace Level", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_B_TEXT_AREA, AttributeNames.USABLE_TERRACE_REMARKS, "All required plumbing tap-offs and electrical connections for the usable terrace, basement, stilt floor to be provided to the satisfaction of the Lessee."),
    TERRACE_AREA_CLAUSE_C_TEXT_AREA("Terrace Level", "(Lease Term)", AttributeNames.TERRACE_AREA_CLAUSE_C_TEXT_AREA, AttributeNames.FINISHED_FLOORING_REMARKS, "Finished flooring to be provided in either stone or tile at terrace, basement, ground level if the level is usable, to the satisfaction of the Lessee."),
    TERRACE_AREA_CLAUSE_D_TEXT_AREA("Terrace Level", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_D_TEXT_AREA, AttributeNames.LL_FUNCTIONAL_TOILETS_REMARKS, "LL to provide functional toilets at terrace, basement, ground level if the level is usable. Any sewage in the basements to the be pumped via sump."),
    TERRACE_AREA_CLAUSE_E_TEXT_AREA("Terrace Level", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_E_TEXT_AREA, AttributeNames.LL_TOILETS_AT_TERRACE_REMARKS, "Protective railing up to 5 feet from FFL on terrace is required. Bamboo and MS are acceptable"),
    TERRACE_AREA_CLAUSE_F_TEXT_AREA("Terrace Level", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_F_TEXT_AREA, AttributeNames.LL_EXTERIOR_FACADE_REMARKS, "LL to close the exterior facade of the building (typical floors, stilt levels and terrace levels), to the satisfaction of the Lessee as specified in the design scheme"),

    OCCUPIED_LEVELS_CLAUSE_A_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_A_TEXT_AREA, AttributeNames.ENTIRE_INTERIOR_SPACE_REMARKS, "The entire interior space (rooms, corridors, common areas) to be painted as per Lessee specifications, specified in the design manual<br/>Berger Paint Codes for <strong>Corridors & Staircase</strong> Texture Paint - Tree Shade | Texture-Ruff N Tuff (Scratch Fine) 8T 0346 | With Texture Wall<br/>Berger Paint Code for <strong>Common Areas</strong> Wall Paint - Show Steeler | 8T 2694 | Without Texture<br/><strong>Ceiling Paint</strong><br/>Berger - White Swan 2P 1847"),
    OCCUPIED_LEVELS_CLAUSE_B_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_B_TEXT_AREA, AttributeNames.ANY_CRACKS_IN_THE_WALLS_REMARKS, "Any cracks in the walls/ plaster in the interior spaces to be repaired and repainted"),
    OCCUPIED_LEVELS_CLAUSE_C_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_C_TEXT_AREA, AttributeNames.GENERAL_LIGHTING_REMARKS, "General Lighting to be provided for corridors, common areas, etc as per the requirements of the Lessee specified in the design manual"),
    OCCUPIED_LEVELS_CLAUSE_D_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_D_TEXT_AREA, AttributeNames.DINING_SPACE_REMARKS, "Dining space is to be provided and it must have the capacity to seat a minimum of 30% of the number of beds. Approx.  20-22sq. ft. per person on carpet area must be considered for this, but a minimum of 500 sq. ft. carpet area must be provided for a functional dining .The associated kitchen to be additionally ,provided with an area of between 150 sq. ft. to 300 sq. ft basis the number of beds in the property. Size of the kitchen to be to the lessee's satisfaction"),
    OCCUPIED_LEVELS_CLAUSE_E_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_E_TEXT_AREA, AttributeNames.ALL_FLOORING_FOR_COMMON_AREAS_REMARKS, "In case the stilt, terrace or basement is being used for common areas or dining, all flooring (tiles/stone of approved spec), electrical connections and general lighting must be provided for"),
    OCCUPIED_LEVELS_CLAUSE_F_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_F_TEXT_AREA, AttributeNames.ALL_FLOORING_FOR_KITCHEN_REMARKS, "All kitchen/utensil wash/pantry areas to have hard flooring as per lessee’s specs."),


    ROOM_CLAUSE_A_TEXT_AREA("Room", "(One Time)", AttributeNames.ROOM_CLAUSE_A_TEXT_AREA, AttributeNames.ALL_BROKEN_CRACKED_FURNITURE_REMARKS, "All broken/cracked furniture to be repaired (woodwork, metalwork & hardware, lamination)"),
    ROOM_CLAUSE_B_TEXT_AREA("Room", "(One Time)", AttributeNames.ROOM_CLAUSE_B_TEXT_AREA, AttributeNames.KEYS_TO_LOCKS_OF_DOORS_REMARKS, "All keys to locks of doors & almirahs must be unique and handed over with 3 key sets."),
    ROOM_CLAUSE_C_TEXT_AREA("Room", "(One Time)", AttributeNames.ROOM_CLAUSE_C_TEXT_AREA, AttributeNames.LIVEABLE_ROOM_AREA_REMARKS, "Two tube lights, one ceiling fan & One power point 16A per 120 sq. ft. of liveable room area in working condition and One power point of 6A per bed. General lighting and mirror light to be provided in bathrooms in working condition"),
    ROOM_CLAUSE_D_TEXT_AREA("Room", "(One Time)", AttributeNames.ROOM_CLAUSE_D_TEXT_AREA, AttributeNames.ROOM_INTERIORS_REMARKS, "The room interiors to be painted in the scheme provided by the Lessee in minimum 2 coats of paint, or as many as required to achieve the acceptable finish. Any cracks/ blemishes on the existing walls to be repaired and finished well to ensure uniform look with adjacent wall.<br/><strong>Wall Paint</strong><br/>Berger - Yellow Slicker 3D 0759 (Room Accent wall)<br/>Asian Paint - Desert Glow 7910 (Room Accent wall)<br/>Berger - White Swan 2P 1847 (Remaining walls in room)<br/><strong>Ceiling Paint</strong><br/>Berger - White Swan 2P 1847<br/><strong>Room Doors</strong> - Berger Yellow Slicker 3D 0759 (In case of laminate - Yellow laminate: Sonear - Sunflower Yellow (Suede) -9076 OR Virgo Golden Yellow -1073SF, <strong>Door Frame</strong> - Berger White Swan 2P 1847<br/><strong>Main Entrance Door</strong> - Teal Color Asian Paint - Ice Cabbage -7551"),
    ROOM_CLAUSE_E_TEXT_AREA("Room", "(One Time)", AttributeNames.ROOM_CLAUSE_E_TEXT_AREA, AttributeNames.BATHROOM_ACCESSORIES_REMARKS, "Each bathroom to be fully fitted with bathroom accessories like bathroom mirror, soap dish, towel rod etc. along with basic sanitary ware like EWC, health faucet, wash basin with hot & cold mixture, shower head, bath hot & cold mixture. All components must be functioning correctly"),
    ROOM_CLAUSE_F_TEXT_AREA("Room", "(One Time)", AttributeNames.ROOM_CLAUSE_F_TEXT_AREA, AttributeNames.CURTAIN_RODS_REMARKS, "Curtain rods to be provided for windows in all rooms preferably as per lessee's specs."),


    ROOM_PAINT_TEXT_AREA("ROOM PAINT","(One Time)",AttributeNames.ROOM_PAINT_CLAUSE_TEXT_AREA,AttributeNames.ROOM_PAINT_REMARKS,
            "The room interiors to be painted in the scheme provided by the Lessee in minimum 2 coats of paint, or as many as required to achieve the acceptable finish. Any cracks/ blemishes on the existing walls to be repaired and finished well to ensure uniform look with adjacent wall.<br/><strong>Wall Paint</strong><br/>Berger - Yellow Slicker 3D 0759 (Room Accent wall)<br/>Asian Paint - Desert Glow 7910 (Room Accent wall)<br/>Berger - White Swan 2P 1847 (Remaining walls in room)<br/><strong>Ceiling Paint </strong><br/>Berger - White Swan 2P 1847<br/><strong>Room Doors</strong> - Berger Yellow Slicker 3D 0759 (In case of laminate - Yellow laminate: Sonear - Sunflower Yellow (Suede) -9076 OR Virgo Golden Yellow -1073SF, <strong>Door Frame</strong> - Berger White Swan 2P 1847<br/><strong>Main Entrance Door</strong> - Teal Color Asian Paint - Ice Cabbage -7551"),


    SANITARY_CLAUSE_A_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_A_TEXT_AREA, AttributeNames.PLUMBING_PIPES_ASSOCIATED_COSTS_REMARKS, "Repair/replacement of plumbing pipes & associated costs (breaking & replacing of tiles etc.)"),
    SANITARY_CLAUSE_B_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_B_TEXT_AREA, AttributeNames.WATER_PRESSURE_FLOODING_ISSUES_REMARKS, "Fixing of water pressure & flooding issues, arising due to narrow drainpipe or low capacity drainpipe"),
    SANITARY_CLAUSE_C_TEXT_AREA("Sanitary", "(One Time)", AttributeNames.SANITARY_CLAUSE_C_TEXT_AREA, AttributeNames.REPLACEMENT_OF_BROKEN_DAMAGED_SANITARY_WARE_REMARKS, "Replacement of broken/damaged sanitary ware before handover to Lessee including replacement of all Indian WCs (if any) by western WCs"),
    SANITARY_CLAUSE_D_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_D_TEXT_AREA, AttributeNames.LIAISONING_FOR_COMMERCIAL_WATER_METER_REMARKS, "Liaisoning for commercial water meter connection will be under Lessor’s scope. Lessor will provide commercial water connection of minimum inlet size 50mm dia with water meter exclusive for Lessee. Lessor will lay pipe from water meter up to LESSEE UG tank"),
    SANITARY_CLAUSE_E_TEXT_AREA("Sanitary", "(One Time)", AttributeNames.SANITARY_CLAUSE_E_TEXT_AREA, AttributeNames.LESSEE_SEWER_LINE_REMARKS, "Lessor need to connect Lessee sewer line to main municipal sewer line"),


    WHITE_GOODS_CLAUSE_A_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_A_TEXT_AREA, AttributeNames.FUNCTIONING_A_C_REMOTES_REMARKS, "Functioning AC remotes & stabilizer are to be provided with each AC"),
    WHITE_GOODS_CLAUSE_B_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_B_TEXT_AREA, AttributeNames._A_C_DRAINIAGE_AND_CONNECTIONS_REMARKS, "AC drainage & connection to outdoor units in case of split ACs to be planned & provided. In B.T.S. sites, AC drainage provisioning to be done along with piping for outdoor units, with piping preferably being embedded in walls/ hidden in shafts"),
    WHITE_GOODS_CLAUSE_C_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_C_TEXT_AREA, AttributeNames.STORAGE_GEYSER_REMARKS, "Storage geyser > 15 ltrs. or instant geyser (3 ltrs. with 2/3 KW), Age < 4 years old"),
    WHITE_GOODS_CLAUSE_D_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_D_TEXT_AREA, AttributeNames.ELECTRICAL_SOLAR_BOILER_CAPACITY_REMARKS, "Electrical /Solar boiler capacity should be > 25 ltrs per bed (Wood fired boiler not allowed). Energy efficient Heat pump is preferred over boiler and individual geysers"),
    WHITE_GOODS_CLAUSE_E_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_E_TEXT_AREA, AttributeNames.ALL_WHITE_GOODS_REQUIRING_DRAINAGE_POINT_REMARKS, "For all white goods requiring drainage point like washing machine, water cooler etc., Lessor to provide domestic water connection of 20mm dia. UPVC pipe with drain point & tap as per Lessee layout"),
    WHITE_GOODS_CLAUSE_F_TEXT_AREA("White Goods", "(Lease Term)", AttributeNames.WHITE_GOODS_CLAUSE_F_TEXT_AREA, AttributeNames.WHITE_GOODS_REPLACEMENT_REMARKS,
            "The Lessor shall replace and provide fresh / new whitegoods, once the life of such goods has concluded, i.e. once these goods are neither repairable nor serviceable. The life of these goods will be mutually agreed and decided by the Lessor and the Lessee."),


    ELECTRICAL_CLAUSE_A_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_A_TEXT_AREA, AttributeNames.ENTIRE_LIAISONING_REMARKS, "Entire Liaisoning will be under Lessor’s scope. Power sanction will be in the name of Lessor. All CEIG approvals for all equipment to be taken by Lessor"),
    ELECTRICAL_CLAUSE_B_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_B_TEXT_AREA, AttributeNames.WORK_ON_THE_H_T_SIDE_REMARKS, "Work on the HT side incl. transformers, voltage fluctuations in the region, servo stabilizer, metering work and isolator panel, electrical wiring, electrical infrastructure, electrical panel with fire suppression, provision of 3-phase electrical line, earthing as per requirements of the Lessee"),
    ELECTRICAL_CLAUSE_C_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_C_TEXT_AREA, AttributeNames.ROOM_WISE_SEPARATE_WIRING_REMARKS, "Room wise separate wiring with adequately sized MCCBs & RCCBs. Specifications of wiring used to be as per industry norms for different items"),
    ELECTRICAL_CLAUSE_D_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_D_TEXT_AREA, AttributeNames.SUFFICIENT_CONNECTED_LOAD_CATERING_REMARKS, "Sufficient connected load catering to 100% occupancy (load requirement to be provided) and power factor correction as per existing load requirements. Overall load calculation of a building for<br/>- Non-AC buildings: 90% rooms to be @ .45kW + 10% rooms to be @ 1.5kW<br/>- Air-conditioned buildings: 100% rooms @ 1.5kW"),
    ELECTRICAL_CLAUSE_E_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_E_TEXT_AREA, AttributeNames.ALL_GEYSERS_IN_THE_BUILDING_REMARKS, "All geysers in the building to be connected to a single panel. One geyser per bath is a mandatory reqt."),


    POWER_BACKUP_CLAUSE_A_TEXT_AREA("Power Backup", "(Lease Term)", AttributeNames.POWER_BACKUP_CLAUSE_A_TEXT_AREA, AttributeNames.DIESEL_GENERATOR_WITH_AUTO_CHANGE_REMARKS, "Diesel Generator with auto change over facility with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessee. Capacity of power backup to be determined considering the basic requirement of the running of 1 light & 1 fan per room, 1 light per bathroom, 1 light per corridor at every turn or within a distance of 75 ft in a continuous space, 1 light at every common area, entry & exit area"),
    POWER_BACKUP_CLAUSE_B_TEXT_AREA("Power Backup", "(Lease Term)", AttributeNames.POWER_BACKUP_CLAUSE_B_TEXT_AREA, AttributeNames.REPLACEMENT_OF_D_G_REMARKS, "Replacement of DG after 10 years of life"),
    POWER_BACKUP_CLAUSE_C_TEXT_AREA("Power Backup", "(One Time)", AttributeNames.POWER_BACKUP_CLAUSE_C_TEXT_AREA, AttributeNames._N_O_C_P_U_C_LICENSE_FROM_LOCAL_AUTHORITY_REMARKS, "NOC / PUC license from local authority for DG. All fire safety norms and arrangements to be maintained.  In cases where DG is kept within an enclosed space, there should be available ventilation or provisioning for escape of heat & smoke"),
    POWER_BACKUP_CLAUSE_D_TEXT_AREA("Power Backup", "(Lease Term)", AttributeNames.POWER_BACKUP_CLAUSE_D_TEXT_AREA, AttributeNames.POWER_BACK_UP_WIRING_REMARKS, "Power back up wiring to be done for inverter/DG"),


    LIFT_CLAUSE_A_TEXT_AREA("Lift", "(One Time)", AttributeNames.LIFT_CLAUSE_A_TEXT_AREA, AttributeNames.LIFT_ONE_TIME_REFURBISHMENT_REMARKS, "If required, one-time refurbishment (interiors, motor, etc.) by OEM to be done before handing over the lift. In case damage makes the lift unusable, Lessor to replace."),
    LIFT_CLAUSE_B_TEXT_AREA("Lift", "(Lease Term)", AttributeNames.LIFT_CLAUSE_B_TEXT_AREA, AttributeNames.AUTO_RESCUE_DEVICE_REMARKS, "Auto Rescue Device should be installed and in working condition"),
    LIFT_CLAUSE_C_TEXT_AREA("Lift", "(One Time)", AttributeNames.LIFT_CLAUSE_C_TEXT_AREA, AttributeNames.WORKING_LIFT_A_M_C_REMARKS, "Lift to be provided with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessor"),
    LIFT_CLAUSE_D_TEXT_AREA("Lift", "(One Time)", AttributeNames.LIFT_CLAUSE_D_TEXT_AREA, AttributeNames.REPLACEMENT_OF_LIFT_REMARKS, "Replacement of Lift > 12 years old"),
    LIFT_CLAUSE_E_TEXT_AREA("Lift", "(Lease Term)", AttributeNames.LIFT_CLAUSE_E_TEXT_AREA, AttributeNames.LIFT_LICENSE_RENEWAL_REMARKS, "Lift license renewal / fitness Deed (wherever applicable)"),

    DOCS_AND_A_M_C_CLAUSE_A_TEXT_AREA("Docs & AMC", "(One Time)", AttributeNames.DOCS_AND_A_M_C_CLAUSE_A_TEXT_AREA, AttributeNames.ALL_TEST_CERTIFICATE_AND_DOCUMENTS, "All test certificate and Documents / Warranty certificate /manual of all equipment need to be provided by the Lessor. System to be tested with Lessee engineer before handing over to Lessee"),
    COMMON_AREAS_CLAUSE_A_TEXT_AREA("Common Areas", "(Lease Term)", AttributeNames.COMMON_AREAS_CLAUSE_A_TEXT_AREA, AttributeNames.LIGHTING_AND_POWER_TO_BE_INSTALLED_REMARKS, "If common areas shared by Lessor & Lessee, the lighting & power to be installed & maintained by Lessor"),
    COMMON_AREAS_CLAUSE_B_TEXT_AREA("Common Areas", "(One Time)", AttributeNames.COMMON_AREAS_CLAUSE_B_TEXT_AREA, AttributeNames.INTERIOR_PAINT_COMMON_AREA_REMARKS, "The entire interior space (common areas) to be painted as per Lessee specifications, specified in the design manual"),
    COMMON_AREAS_CLAUSE_C_TEXT_AREA("Common Areas", "(One Time)", AttributeNames.COMMON_AREAS_CLAUSE_C_TEXT_AREA, AttributeNames.BERGER_PAINT_CODE_COMMON_AREA_REMARKS, "Berger Paint Code for Common Areas<br/>Wall Paint - Show Steeler | 8T 2694 | Without Texture"),
    COMMON_AREAS_CLAUSE_D_TEXT_AREA("Common Areas", "(One Time)", AttributeNames.COMMON_AREAS_CLAUSE_D_TEXT_AREA, AttributeNames.GENERAL_LIGHTING_COMMON_AREA_REMARKS, "General Lighting to be provided for common area as per the requirements of the Lessee specified in the design manual"),
    COMMON_AREAS_CLAUSE_E_TEXT_AREA("Common Areas", "(Lease Term)", AttributeNames.COMMON_AREAS_CLAUSE_E_TEXT_AREA, AttributeNames.DIESEL_GENERATOR_AMC_COMMON_AREA_REMARKS, "Diesel Generator with auto change over facility with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessee. Capacity of power backup to be determined considering the basic requirement of the running of 1 light at every common area, entry & exit area"),

	SIGNAGE_CLAUSE_A_TEXT_AREA("Signage", "(One Time Before Handing Over)", AttributeNames.SIGNAGE_CLAUSE_A_TEXT_AREA, AttributeNames.SIGNAGE_CLAUSE_A_REMARK, "a. Electrical connections as required for facade signage in locations defined by Service Provider"),
	IT_CLAUSE_A_TEXT_AREA("CCTV with DVR", "(One Time Before Handing Over)", AttributeNames.IT_CLAUSE_A_TEXT_AREA, AttributeNames.IT_CLAUSE_A_REMARK, "CCTV with DVR as per the Specifications and Layout Provided by the Service Provider"),
	IT_CLAUSE_B_TEXT_AREA("High Speed Broadband/Network Line", "(One Time Before Handing Over)", AttributeNames.IT_CLAUSE_B_TEXT_AREA, AttributeNames.IT_CLAUSE_B_REMARK, "High Speed Broadband/Line from Network Operators Defined by Service Provider to be Installed"),
	IT_CLAUSE_C_TEXT_AREA("DTH Connection", "(One Time Before Handing Over)", AttributeNames.IT_CLAUSE_C_TEXT_AREA, AttributeNames.IT_CLAUSE_C_REMARK, "DTH connection to be provided for all Televisions installed in the building"),
	
	SUPERVISOR_ROOM_CLAUSE_A_TEXT_AREA("Supervisor Room", "(One Time Before Handing Over)", AttributeNames.SUPERVISOR_ROOM_CLAUSE_A_TEXT_AREA, AttributeNames.SUPERVISOR_ROOM_CLAUSE_A_REMARK, "To be provided with table, chair, bed, wardrobe, TV connection and provision for CCTV monitoring"),
	PARKING_CLAUSE_A_TEXT_AREA("Residents Parking and Access Control", "(One Time Before Handing Over)", AttributeNames.PARKING_CLAUSE_A_TEXT_AREA, AttributeNames.PARKING_CLAUSE_A_REMARK, "Provision for bike/car parking for residents. Access control to be installed for on-premise parking space"),

	LANDSCAPE_CLAUSE_A_TEXT_AREA("Soft and Hard Scape", "(One Time Before Handing Over)", AttributeNames.LANDSCAPE_CLAUSE_A_TEXT_AREA, AttributeNames.LANDSCAPE_CLAUSE_A_REMARK, "Soft and hard scape in the external areas"),
	LANDSCAPE_CLAUSE_B_TEXT_AREA("Pavers/CC in the Cirulation Area", "(One Time Before Handing Over)", AttributeNames.LANDSCAPE_CLAUSE_B_TEXT_AREA, AttributeNames.LANDSCAPE_CLAUSE_B_REMARK, "Pavers/CC in the circulation area"),

	BOUNDARY_WALL_CLAUSE_A_TEXT_AREA("Boundary Wall Paint", "(One Time Before Handing Over)", AttributeNames.BOUNDARY_WALL_CLAUSE_A_TEXT_AREA, AttributeNames.BOUNDARY_WALL_CLAUSE_A_REMARK, "a. To be painted with the waterproof paint as per the specifications provided by the Service Provider"),
	BOUNDARY_WALL_CLAUSE_B_TEXT_AREA("Light Fixture on Entrance & Boundary Wall Paint", "(One Time Before Handing Over)", AttributeNames.BOUNDARY_WALL_CLAUSE_B_TEXT_AREA, AttributeNames.BOUNDARY_WALL_CLAUSE_B_REMARK, "b. Light fixtures to be provided with IP 65 rating at the entrance and on the boundary wall"),

    CORRIDOR_CLAUSE_A_TEXT_AREA("Corridor", "(One Time)", AttributeNames.CORRIDOR_CLAUSE_A_TEXT_AREA, AttributeNames.INTERIOR_PAINT_CORRIDOR_REMARKS, "The entire interior space (corridors) to be painted as per Lessee specifications, specified in the design manual"),
    CORRIDOR_CLAUSE_B_TEXT_AREA("Corridor", "(One Time)", AttributeNames.CORRIDOR_CLAUSE_B_TEXT_AREA, AttributeNames.BERGER_PAINT_CODE_CORRIDOR_REMARKS, "Berger Paint Codes for Corridors & Staircase<br/>Texture Paint - Tree Shade | Texture-Ruff N Tuff (Scratch Fine) 8T 0346 | With Texture Wall"),
    CORRIDOR_CLAUSE_C_TEXT_AREA("Corridor", "(One Time)", AttributeNames.CORRIDOR_CLAUSE_C_TEXT_AREA, AttributeNames.GENERAL_LIGHTING_CORRIDOR_REMARKS, "General Lighting to be provided for corridors as per the requirements of the Lessee specified in the design manual"),
    CORRIDOR_CLAUSE_D_TEXT_AREA("Corridor", "(Lease Term)", AttributeNames.CORRIDOR_CLAUSE_D_TEXT_AREA, AttributeNames.DIESEL_GENERATOR_AMC_CORRIDOR_REMARKS, "Diesel Generator with auto change over facility with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessee. Capacity of power backup to be determined considering the basic requirement of the running of 1 light per corridor at every turn or within a distance of 75 ft in a continuous space");
    private String item;

    private String defaultDuration;

    private String scopeDefinitionKey;

    private String remarksKey;

    //private Integer orderNum;       //not required, as enums are already sorted by ordinal

    private String defaultScopeDefinition;

    public static TreeSet<String> estateAttributeTreeSet = new TreeSet<>();

    static {
        for (AtlDetailsEnum atlDetailsEnum : AtlDetailsEnum.values()) {
            estateAttributeTreeSet.add(atlDetailsEnum.getScopeDefinitionKey());
            estateAttributeTreeSet.add(atlDetailsEnum.getRemarksKey());
        }
    }

}


package com.stanzaliving.core.legal.enums;

import com.stanzaliving.core.estate.constants.AttributeNames;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.TreeSet;

@AllArgsConstructor
@Getter
public enum AtlDetailsEnum {

    //This enum can be kept in table as well, depending upon whether defaultDuration, scopeDefinitionKey, remarksKey, orderNum or defaultScopeDefinition needs to be modifiable
    STRUCTURE_CLAUSE_A_TEXT_AREA("Structure", "(Lease Term)", AttributeNames.STRUCTURE_CLAUSE_A_TEXT_AREA, AttributeNames.STRUCTURE_REMARKS, "Implementing any amendment based on the structural integrity check carried out by the Lessee.", false),

    FIRE_CLAUSE_A_TEXT_AREA("Fire", "(Lease Term)", AttributeNames.FIRE_CLAUSE_A_TEXT_AREA, AttributeNames.FIRE_COMPLIANCE_REMARKS, "Provide Fire NOC/Certificate, as applicable.", false),
    FIRE_CLAUSE_B_TEXT_AREA("Fire", "(One Time)", AttributeNames.FIRE_CLAUSE_B_TEXT_AREA, AttributeNames.FIRE_DEVICES_SUPPLY_INSTALLATION_TESTING_REMARKS,
            "Supply, Installation, Testing & Commissioning of the Fire Fighting System /equipment:</br>" +
                    "i. Automatic sprinklers (if basement area exceeds 200sqmt)</br>" +
                    "ii. Fire Hose Reel (BH >15 mts)</br>" +
                    "iii. Terrace tank with Pump capacity 900 lt/min (BH >15 mts)</br>" +
                    "iv. Emergency Exit & Fire Escape Staircase. (BH >15 mts)", false),
    FIRE_CLAUSE_C_TEXT_AREA("Fire", "(Lease Term)", AttributeNames.FIRE_CLAUSE_C_TEXT_AREA, AttributeNames.FIRE_CLAUSE_C_REMARKS, "Any Periodical approvals (if any) to be obtained by Lessor.", false),
    FIRE_CLAUSE_D_TEXT_AREA("Fire", "(Lease Term)", AttributeNames.FIRE_CLAUSE_D_TEXT_AREA, AttributeNames.FIRE_CLAUSE_D_REMARKS, "Transfer working AMC or bear one-time cost for new AMC.", false),
    FIRE_CLAUSE_E_TEXT_AREA("Fire", "(One Time)", AttributeNames.FIRE_CLAUSE_E_TEXT_AREA, AttributeNames.FIRE_CLAUSE_E_REMARKS, "Provide Fire Extinguishers.", false),

    SEEPAGE_CLAUSE_A_TEXT_AREA("Seepage", "(Lease Term)", AttributeNames.SEEPAGE_CLAUSE_A_TEXT_AREA, AttributeNames.CORRECTION_OF_SEEPAGE_REMARKS, "Rectify Seepage arising out of plumbing pipes/faulty sanitaryware/ external wall seepage etc.", false),
    SEEPAGE_CLAUSE_B_TEXT_AREA("Seepage", "(Lease Term)", AttributeNames.SEEPAGE_CLAUSE_B_TEXT_AREA, AttributeNames.FIX_ISSUES_RELATED_TO_DRAINAGE_REMARKS, "Repair surface with proper painting/tiling as per Lessee’s satisfaction.", false),
    SEEPAGE_CLAUSE_C_TEXT_AREA("Seepage", "(Lease Term)", AttributeNames.SEEPAGE_CLAUSE_C_TEXT_AREA, AttributeNames.WATER_PROOFING_WORK_ON_TERRACE_REMARKS, "Waterproofing work on terrace, wet balcony, external surfaces and washroom with proper drainage and slopes.", false),
    SEEPAGE_CLAUSE_D_TEXT_AREA("Seepage", "(One Time)", AttributeNames.SEEPAGE_CLAUSE_D_TEXT_AREA, AttributeNames.SEEPAGE_CLAUSE_D_REMARKS, "Prevent and weather protect ingress of water from openings causing damage to  assets/infra, ensuring proper ventilation.", false),

    DRAINAGE_CLAUSE_A_TEXT_AREA("Drainage", "(One Time)", AttributeNames.DRAINAGE_CLAUSE_A_TEXT_AREA, AttributeNames.DRAINAGE_CLAUSE_A_REMARKS, "Provide sump to pump out water from basement/other areas. Transfer working AMC or bear one-time cost for new AMC.", false),

    WATER_SUPPLY_CLAUSE_A_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_A_TEXT_AREA, AttributeNames.CONNECTED_WATER_SUPPLY_REMARKS, "Provide water supply connection from the municipal authority with functional water meters, provide separate water meter in case of multiple tenants. Previous arrears to be cleared by Lessor before HO.", false),
    WATER_SUPPLY_CLAUSE_B_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_B_TEXT_AREA, AttributeNames.FULLY_FUNCTIONAL_WATER_PUMPS_REMARKS, "All water pumps/motors etc. to be safeguarded with metal cage(s) as per the specs provided by Lessee.", false),
    WATER_SUPPLY_CLAUSE_C_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_C_TEXT_AREA, AttributeNames.AUTOMATION_OF_WATER_STORAGE_REMARKS, "Provide automated water storage and pumping system. Transfer working AMC or bear one-time cost for new AMC.", false),
    WATER_SUPPLY_CLAUSE_D_TEXT_AREA("Water Supply", "(Lease Term)", AttributeNames.WATER_SUPPLY_CLAUSE_D_TEXT_AREA, AttributeNames.BASEMENT_OTHER_AREAS_MAY_REMARKS, "In case the ground water quality is not potable/high TDS or there is inadequate discharge of water, share the cost of water purchased from the external source.", true),
    WATER_SUPPLY_CLAUSE_E_TEXT_AREA("Water Supply", "(Lease Term)", AttributeNames.WATER_SUPPLY_CLAUSE_E_TEXT_AREA, AttributeNames.WATER_SUPPLY_BOREWELL_REMARKS, "Provide Borewells (number as specified) with appropriate water levels.", false),
    WATER_SUPPLY_CLAUSE_F_TEXT_AREA("Water Supply", "(One Time)", AttributeNames.WATER_SUPPLY_CLAUSE_F_TEXT_AREA, AttributeNames.WATER_SUPPLY_WATER_COST_REMARKS, "In case of unavailability of water or borewells running dry the water cost to be equally shared between Lessee and Lessor.", true),
    WATER_SUPPLY_CLAUSE_G_TEXT_AREA("Water Supply", "(Lease Term)", AttributeNames.WATER_SUPPLY_CLAUSE_G_TEXT_AREA, AttributeNames.WATER_SUPPLY_CLAUSE_G_REMARKS, "In the event there is shortage of water in the Leased Premises, owing to the fact that the Lessor(s) has either provided a municipal water connection [& where supply of water is less than 200 litres/person/day] with or without an operational borewell; and/or in case the ground water quality is not potable; or the water contains high levels of TDS [i.e TDS > 500 ppm];or there is inadequate discharge of water, in such case any alternate arrangement for water (including water tankers), shall be done by the Lessor(s), the cost of which will be equally borne by both the parties.", false),
    WATER_SUPPLY_CLAUSE_H_TEXT_AREA("Water Supply", "(Lease Term)", AttributeNames.WATER_SUPPLY_CLAUSE_H_TEXT_AREA, AttributeNames.WATER_SUPPLY_CLAUSE_H_REMARKS, "In the event there is of shortage water in the Leased Premises, owing to the fact that the Lessor(s) has either not provided municipal water connection (with or without an operational borewell); and/or in case the ground water quality is not potable; or the water contains high levels of TDS [i.e TDS > 500  ppm];or there is inadequate discharge of water, in such case any alternate arrangement for water (including water tankers), shall be done by the Lessor(s), the cost of which will be solely borne by the Lessor(s).", false),

    WATER_STORAGE_CLAUSE_A_TEXT_AREA("Water Storage", "(One Time)", AttributeNames.WATER_STORAGE_CLAUSE_A_TEXT_AREA, AttributeNames.WATER_TANK_CAPACITY_TO_BE_CALCULATED_REMARKS, "Water tank capacity to be calculated at 200 Litres/bed. All over head tanks to be inter-connected. Please mention the total storage capacity of OH+UG tank.", false),
    WATER_STORAGE_CLAUSE_B_TEXT_AREA("Water Storage", "(One Time)", AttributeNames.WATER_STORAGE_CLAUSE_B_TEXT_AREA, AttributeNames.WATER_STORAGE_CLAUSE_B_REMARKS, "Water tanks to be cleaned before handover.", false),
    WATER_STORAGE_CLAUSE_C_TEXT_AREA("Water Storage", "(One Time)", AttributeNames.WATER_STORAGE_CLAUSE_C_TEXT_AREA, AttributeNames.WATER_STORAGE_CLAUSE_C_REMARKS, "Provide tanks with automated overflow alarm & starter for cut-off.", false),


    SITE_CLAUSE_A_TEXT_AREA("SITE", "(Lease Term)", AttributeNames.SITE_CLAUSE_A_TEXT_AREA, AttributeNames.SITE_CLAUSE_A_REMARKS, "Secure building/site from all sides and repair or gate any openings in the boundary walls.", false),
    SITE_CLAUSE_B_TEXT_AREA("SITE", "(Lease Term)", AttributeNames.SITE_CLAUSE_B_TEXT_AREA, AttributeNames.SITE_CLAUSE_B_REMARKS, "If the site is shared by other tenants, separate secure entrance and area to be provided to the Lessee.", false),
    SITE_CLAUSE_C_TEXT_AREA("SITE", "(One Time)", AttributeNames.SITE_CLAUSE_C_TEXT_AREA, AttributeNames.SITE_CLAUSE_C_REMARKS, "Provide basic cleaning and landscaping of the area around the property. Remove debris or scrap materials.", false),

    FACADE_CLAUSE_A_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_A_TEXT_AREA, AttributeNames.ANY_MASONRY_PLASTER_CRACKS_REMARKS, "Any masonry/plaster cracks to be fixed and painted post fixing as per Lessee specified brand colours or the scheme shared by the Lessee.", false),
    FACADE_CLAUSE_B_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_B_TEXT_AREA, AttributeNames.EXTERNAL_DOOR_WINDOWS_REMARKS, "External door/windows – Check and repair faults in external doors and windows. Faults include but are not limited to:" +
            "<ol type=\"1.\"><li> Defective hinges - Replaced with functioning ones.</li>" +
            "<li> Cracked or broken shutters- repair and replace keeping same finishes as previous ones.</li>" +
            "<li> In sliding windows- the channel to allow for easy movement and a functional drain hole.</li>" +
            "<li> All openings at the GF and upper floors/areas accessible from adjacent properties to be secured with grills.</li>" +
            "<li> Open shafts to be closed with safety net and to be made weatherproof.</li></ol>", false),
    FACADE_CLAUSE_C_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_C_TEXT_AREA, AttributeNames.EXTERIOR_FACADE_CLOSER_REMARKS, "Mosquito mesh / safety nets to be provided on all windows.", false),
    FACADE_CLAUSE_D_TEXT_AREA("Facade", "(One Time)", AttributeNames.FACADE_CLAUSE_D_TEXT_AREA, AttributeNames.FACADE_REPAINTING_REMARKS, "Lessor to paint the façade as per Lessee’s Specification.\n" +
            "<br/>Façade paint code to be followed:" +
            "<br/>-Asian Paints: Base Colour -  Grand Grape (Blue), Accent Colour – Eggshell (White), Dessert Glow (Yellow)", false),

    COMMON_FACILITIES_CLAUSE_A("Common Facilities", "(One Time)", AttributeNames.COMMON_FLTY_CLAUSE_A_TEXT_AREA, AttributeNames.COMMON_FLTY_CLAUSE_A_REMARKS, "Provide secure entrance with doors or to be align for debit for work executed by the Lessee.", false),
    COMMON_FACILITIES_CLAUSE_B("Common Facilities", "(One Time)", AttributeNames.COMMON_FLTY_CLAUSE_B_TEXT_AREA, AttributeNames.COMMON_FLTY_CLAUSE_B_REMARKS, "Provide functional toilets at stilt or ground.", false),
    COMMON_FACILITIES_CLAUSE_C("Common Facilities", "(One Time)", AttributeNames.COMMON_FLTY_CLAUSE_C_TEXT_AREA, AttributeNames.COMMON_FLTY_CLAUSE_C_REMARKS, "Protective railing of min 1200 mm from FFL is required on terrace (Bamboo and MS are acceptable extensions)", false),
    COMMON_FACILITIES_CLAUSE_D("Common Facilities", "(One Time)", AttributeNames.COMMON_FLTY_CLAUSE_D_TEXT_AREA, AttributeNames.COMMON_FLTY_CLAUSE_D_REMARKS, "Secure terrace with fence if it is accessible from adjacent blocks or if there is potential risk of loss of life or limb.", false),

    DINING_CLAUSE_A("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_A_TEXT_AREA, AttributeNames.DINING_CLAUSE_A_REMARKS, "Provide Dining space (enclosed, weather-proof and finished) with minimum space of 20 sq. ft/person for total bed count. Weatherproof roof and side walls/enclosures, tile/ stone flooring (cement flooring not acceptable) and adequate ventilation to be provided.", false),
    DINING_CLAUSE_B("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_B_TEXT_AREA, AttributeNames.DINING_CLAUSE_B_REMARKS, "Steel truss with closed system and insulated metal sheeting, waterproof cladding with one fan per 120 sq. ft and general lighting.", false),
    DINING_CLAUSE_C("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_C_TEXT_AREA, AttributeNames.DINING_CLAUSE_C_REMARKS, "Aluminium framing with glass infill on brick toe wall with adequate waterproofing to prevent ingress of water from the outside into the dining/common area and one operable window in every 10 ft grid. Detail to be picked from design manual.", false),
    DINING_CLAUSE_D("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_D_TEXT_AREA, AttributeNames.DINING_CLAUSE_D_REMARKS, "MS angle Grid (minimum 600x600) with acrylic infill on brick toe wall with adequate waterproofing to prevent ingress of water from the outside into the dining/common area and one operable window in every 10 ft grid. Detail to be picked from design manual.", false),
    DINING_CLAUSE_E("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_E_TEXT_AREA, AttributeNames.DINING_CLAUSE_E_REMARKS, "Brick/ block Masonry/weatherproof dry wall partition with operable windows (aluminium frame with infill glass)", false),
    DINING_CLAUSE_F("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_F_TEXT_AREA, AttributeNames.DINING_CLAUSE_F_REMARKS, "All finished flooring (tiles/stone of approved spec), electrical connections, plumbing tap-offs, paint, general lighting must be provided to the satisfaction of the Lessee.", false),
    DINING_CLAUSE_G("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_G_TEXT_AREA, AttributeNames.DINING_CLAUSE_G_REMARKS, "Insulated metal sheeting with proper arrangement for water drainage.", false),
    DINING_CLAUSE_H("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_H_TEXT_AREA, AttributeNames.DINING_CLAUSE_H_REMARKS, "RCC roof with proper arrangement for water drainage.", false),
    DINING_CLAUSE_I("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_I_TEXT_AREA, AttributeNames.DINING_CLAUSE_I_REMARKS, "If the basement is large, ample light and ventilation to be provided. Ensure air changes are adequate.", false),
    DINING_CLAUSE_J("Dining", "(One Time)", AttributeNames.DINING_CLAUSE_J_TEXT_AREA, AttributeNames.DINING_CLAUSE_J_REMARKS, "Functional sump (with working sump pump) has to be present for kitchen sink and handwash.", false),


    KITCHEN_CLAUSE_A("Kitchen", "(One Time)", AttributeNames.KITCHEN_CLAUSE_A_TEXT_AREA, AttributeNames.KITCHEN_CLAUSE_A_REMARKS, "Kitchen area (enclosed space) to be additionally provided with an area of between 150 sq. ft. to 300 sq. ft or as per the Lessee's specification.", false),
    KITCHEN_CLAUSE_B("Kitchen", "(One Time)", AttributeNames.KITCHEN_CLAUSE_B_TEXT_AREA, AttributeNames.KITCHEN_CLAUSE_B_REMARKS, "Provide exhaust fan and lighting (LED tube light -18W-6000K).", false),
    KITCHEN_CLAUSE_C("Kitchen", "(One Time)", AttributeNames.KITCHEN_CLAUSE_C_TEXT_AREA, AttributeNames.KITCHEN_CLAUSE_C_REMARKS, "All kitchen/utensil wash/pantry areas to have hard flooring as per the Lessee’s specification.", false),
    KITCHEN_CLAUSE_D("Kitchen", "(One Time)", AttributeNames.KITCHEN_CLAUSE_D_TEXT_AREA, AttributeNames.KITCHEN_CLAUSE_D_REMARKS, "All kitchen to have proper plumbing, drainage and electrical points as per Lessee's specification.", false),

    CIRCULATION_CLAUSE_A("Circulation Spaces", "(One Time)", AttributeNames.CIRCULATION_CLAUSE_A_TEXT_AREA, AttributeNames.CIRCULATION_CLAUSE_A_REMARKS, "The entire interior space of common area/ dining to be painted as per design manual or as specified by the Lessee.", false),
    CIRCULATION_CLAUSE_B("Circulation Spaces", "(One Time)", AttributeNames.CIRCULATION_CLAUSE_B_TEXT_AREA, AttributeNames.CIRCULATION_CLAUSE_B_REMARKS, "The entire interior space of corridors & staircases to be painted as per design manual or as specified by the Lessee.", false),
    CIRCULATION_CLAUSE_C("Circulation Spaces", "(One Time)", AttributeNames.CIRCULATION_CLAUSE_C_TEXT_AREA, AttributeNames.CIRCULATION_CLAUSE_C_REMARKS, "Any cracks in the interior spaces to be repaired and repainted", false),
    CIRCULATION_CLAUSE_D("Circulation Spaces", "(One Time)", AttributeNames.CIRCULATION_CLAUSE_D_TEXT_AREA, AttributeNames.CIRCULATION_CLAUSE_D_REMARKS, "Lighting to be provided for corridors, common areas etc. as per the requirements & specs shared by the Lessee. (Bulbs are not acceptable)", false),
    CIRCULATION_CLAUSE_E("Circulation Spaces", "(One Time)", AttributeNames.CIRCULATION_CLAUSE_E_TEXT_AREA, AttributeNames.CIRCULATION_CLAUSE_E_REMARKS, "Specification for corridor & common area:<br/>" +
            "Berger Paint codes<br/>" +
            "For corridor & Staircase texture Paint – Tree shade| Texture-Ruff N Tuff (Scratch Fine) 8T 0346|With texture wall Berger Paint Code for Common Area Wall Paint – Show Steeler | 8T 2694 | Without texture Ceiling Paint Berger – White Swan 2P 1847", false),


    TERRACE_AREA_CLAUSE_A_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_A_TEXT_AREA, AttributeNames.WEATHER_PROOF_ROOF_REMARKS, "In case terrace/stilt/basement level is being used for common areas or dining, weatherproof roof and side walls / enclosures to be provided (steel truss with closed system and insulated metal sheeting, waterproof cladding.). Lessor to provide wall closure (aluminum framing with glass infill or any other material acceptable to the Lessee) to make area weatherproof.", true),
    TERRACE_AREA_CLAUSE_B_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_B_TEXT_AREA, AttributeNames.USABLE_TERRACE_REMARKS, "In case the stilt, terrace or basement is being used for common areas or dining, all finished flooring (tiles/stone of approved spec), electrical connections, plumbing tap-offs and general lighting must be provided to the satisfaction of the Lessee", true),
    TERRACE_AREA_CLAUSE_C_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(Lease Term)", AttributeNames.TERRACE_AREA_CLAUSE_C_TEXT_AREA, AttributeNames.FINISHED_FLOORING_REMARKS, "LL to provide functional toilets at terrace, basement, stilt or ground level if the level is usable. Any sewage in the basements to the ground floor should be pumped via sump.", true),
    TERRACE_AREA_CLAUSE_D_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_D_TEXT_AREA, AttributeNames.LL_FUNCTIONAL_TOILETS_REMARKS, "Dining space (enclosed and weather-proof) is to be provided for residents. It must have the capacity to seat a minimum of 30% of the number of beds. A minimum of 10-15 sq. ft. per person must be considered for this.", true),
    TERRACE_AREA_CLAUSE_E_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_E_TEXT_AREA, AttributeNames.FFL_ON_TERRACE_REMARKS, "The associated kitchen area (enclosed space) to be additionally provided with an area of between 150 sq. ft. to 300 sq. ft basis the number of beds in the property. The size of the kitchen to be as per the Lessee's satisfaction.", true),
    TERRACE_AREA_CLAUSE_F_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_F_TEXT_AREA, AttributeNames.LL_EXTERIOR_FACADE_REMARKS, "All kitchen/utensil wash/pantry areas to have hard flooring as per the Lessee’s specs.", true),
    TERRACE_AREA_CLAUSE_G_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_G_TEXT_AREA, AttributeNames.PROTECTIVE_RAILING_REMARKS, "Protective railing up to 5 feet from FFL on terrace is required. Bamboo and MS are acceptable.", true),
    TERRACE_AREA_CLAUSE_H_TEXT_AREA("STILT / TERRACE / BASEMENT LEVEL", "(One Time)", AttributeNames.TERRACE_AREA_CLAUSE_H_TEXT_AREA, AttributeNames.EXTERIOR_FACADE_REMARKS, "LL to close the exterior facade of the building (typical floors, stilt levels and terrace levels), to the satisfaction of the Lessee as specified in the design scheme", true),

    OCCUPIED_LEVELS_CLAUSE_A_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_A_TEXT_AREA, AttributeNames.ENTIRE_INTERIOR_SPACE_REMARKS, "The entire interior space (rooms, corridors, common areas) to be painted as per Lessee specifications, specified in the design manual\n" +
            "Berger Paint Codes for Corridors & Staircase\n" +
            "Texture / Enamel Paint - Tree Shade | Texture-Ruff N Tuff (Scratch Fine) 8T 0346 | With Texture Wall (Enamel Paint code to be confirmed by Lessee)\n" +
            "Berger Paint Code for Common Areas\n" +
            "Wall Paint - Show Steeler | 8T 2694 | Without Texture\n" +
            "Berger Paint Code for Ceiling Paint \n" +
            "Berger - White Swan 2P 1847", true),
    OCCUPIED_LEVELS_CLAUSE_B_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_B_TEXT_AREA, AttributeNames.ANY_CRACKS_IN_THE_WALLS_REMARKS, "Any cracks in the walls/ plaster in the interior spaces to be repaired and repainted", true),
    OCCUPIED_LEVELS_CLAUSE_C_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_C_TEXT_AREA, AttributeNames.GENERAL_LIGHTING_REMARKS, "General Lighting to be provided for corridors, common areas, etc as per the requirements of the Lessee specified in the design manual", true),
    OCCUPIED_LEVELS_CLAUSE_D_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_D_TEXT_AREA, AttributeNames.DINING_SPACE_REMARKS, "Dining space is to be provided and it must have the capacity to seat a minimum of 30% of the number of beds. Approx.  20-22sq. ft. per person on carpet area must be considered for this, but a minimum of 500 sq. ft. carpet area must be provided for a functional dining .The associated kitchen to be additionally ,provided with an area of between 150 sq. ft. to 300 sq. ft basis the number of beds in the property. Size of the kitchen to be to the lessee's satisfaction", true),
    OCCUPIED_LEVELS_CLAUSE_E_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_E_TEXT_AREA, AttributeNames.ALL_FLOORING_FOR_COMMON_AREAS_REMARKS, "In case the stilt, terrace or basement is being used for common areas or dining, all flooring (tiles/stone of approved spec), electrical connections and general lighting must be provided for", true),
    OCCUPIED_LEVELS_CLAUSE_F_TEXT_AREA("Occupied Levels/Common", "(One Time)", AttributeNames.OCCUPIED_LEVELS_CLAUSE_F_TEXT_AREA, AttributeNames.ALL_FLOORING_FOR_KITCHEN_REMARKS, "All kitchen/utensil wash/pantry areas to have hard flooring as per lessee’s specs.", true),


    ROOM_CLAUSE_A_TEXT_AREA("Rooms", "(One Time)", AttributeNames.ROOM_CLAUSE_A_TEXT_AREA, AttributeNames.ALL_BROKEN_CRACKED_FURNITURE_REMARKS, "Lessor’s furniture to be repaired (woodwork, metalwork & hardware, lamination) or Lessee to repair and debit from Lessor.", false),
    ROOM_CLAUSE_B_TEXT_AREA("Rooms", "(One Time)", AttributeNames.ROOM_CLAUSE_B_TEXT_AREA, AttributeNames.KEYS_TO_LOCKS_OF_DOORS_REMARKS, "For all Lessor’s almirahs and room doors, 3 unique keys must be provided or Lessee to arrange and debit from the Lessor.", false),
    ROOM_CLAUSE_C_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_C_TEXT_AREA, AttributeNames.LIVEABLE_ROOM_AREA_REMARKS, "Provide two lights of 12 W each per 120 sq. ft.", false),
    ROOM_CLAUSE_D_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_D_TEXT_AREA, AttributeNames.ROOM_INTERIORS_REMARKS, "The entire interior space (rooms, corridors, common areas) to be painted as per design manual or as specified by the Lessee.", false),

    ROOM_CLAUSE_F_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_F_TEXT_AREA, AttributeNames.CURTAIN_RODS_REMARKS, "Provide curtain rods.", false),
    ROOM_CLAUSE_G_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_G_TEXT_AREA, AttributeNames.ROOM_CLAUSE_G_REMARKS, "Provide 1 fan per 120 sq. ft (2 fans are mandatory above 120 sq. ft)", false),
    ROOM_CLAUSE_H_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_H_TEXT_AREA, AttributeNames.ROOM_CLAUSE_H_REMARKS, "Provide one 6 Amp point per bed and one 16 Amp point per room.", false),
    ROOM_CLAUSE_I_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_I_TEXT_AREA, AttributeNames.ROOM_CLAUSE_I_REMARKS, "Provide Cloth hooks.", false),
    ROOM_CLAUSE_J_TEXT_AREA("Room infra", "(One Time)", AttributeNames.ROOM_CLAUSE_J_TEXT_AREA, AttributeNames.ROOM_CLAUSE_J_REMARKS, "Provide Room mirrors.", false),

    ROOM_CLAUSE_E_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_E_TEXT_AREA, AttributeNames.BATHROOM_ACCESSORIES_REMARKS, "Provide washbasin and bathroom mirrors.", false),
    ROOM_CLAUSE_K_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_K_TEXT_AREA, AttributeNames.ROOM_CLAUSE_K_REMARKS, "Provide showers.", false),
    ROOM_CLAUSE_L_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_L_TEXT_AREA, AttributeNames.ROOM_CLAUSE_L_REMARKS, "Provide WC with Health faucet.", false),
    ROOM_CLAUSE_M_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_M_TEXT_AREA, AttributeNames.ROOM_CLAUSE_M_REMARKS, "Provide Min one light in toilet (LED-5W-8W).", false),
    ROOM_CLAUSE_N_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_N_TEXT_AREA, AttributeNames.ROOM_CLAUSE_N_REMARKS, "Provide exhaust/ glass louvers in toilet window.", false),
    ROOM_CLAUSE_O_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_O_TEXT_AREA, AttributeNames.ROOM_CLAUSE_O_REMARKS, "Provide clothes hook/ towel racks in toilet.", false),
    ROOM_CLAUSE_P_TEXT_AREA("Bathroom", "(One Time)", AttributeNames.ROOM_CLAUSE_P_TEXT_AREA, AttributeNames.ROOM_CLAUSE_P_REMARKS, "Provide deep cleaning in toilets to the satisfaction of Lessee.", false),
    ROOM_CLAUSE_Q_TEXT_AREA("Rooms", "(One Time)", AttributeNames.ROOM_CLAUSE_Q_TEXT_AREA, AttributeNames.ROOM_CLAUSE_Q_REMARKS, "The entire interior space to be painted as per design manual or as specified by the Lessee.<br> \n" +
            "Specification for room paint:<br>\n" +
            "Wall Paint Berger - Yellow Slicker 3D 0759 (Room Accent wall) Asian Paint - Desert Glow 7910 (Room Accent wall) Berger - White Swan 2P 1847 (Remaining walls in room) Ceiling Paint Berger - White Swan 2P 1847 Room Doors - Berger Yellow Slicker 3D 0759 (In case of laminate - Yellow laminate: Sonear - Sunflower Yellow (Suede) -9076 OR Virgo Golden Yellow -1073SF, Door Frame - Berger White Swan 2P 1847.", false),


    ROOM_PAINT_TEXT_AREA("ROOM PAINT","(One Time)",AttributeNames.ROOM_PAINT_CLAUSE_TEXT_AREA,AttributeNames.ROOM_PAINT_REMARKS,
           "The room interiors to be painted in the scheme provided by the Lessee in minimum 2 coats of paint, or as many as required to achieve the acceptable finish. Any cracks/ blemishes on the existing walls to be repaired and finished well to ensure uniform look with adjacent wall.<br/><strong>Wall Paint</strong><br/>Berger - Yellow Slicker 3D 0759 (Room Accent wall)<br/>Asian Paint - Desert Glow 7910 (Room Accent wall)<br/>Berger - White Swan 2P 1847 (Remaining walls in room)<br/><strong>Ceiling Paint </strong><br/>Berger - White Swan 2P 1847<br/><strong>Room Doors</strong> - Berger Yellow Slicker 3D 0759 (In case of laminate - Yellow laminate: Sonear - Sunflower Yellow (Suede) -9076 OR Virgo Golden Yellow -1073SF, <br/><strong>Door Frame</strong> - Berger White Swan 2P 1847<br/><strong>Main Entrance Door</strong> - Teal Color Asian Paint - Ice Cabbage -7551", true),


    SANITARY_CLAUSE_A_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_A_TEXT_AREA, AttributeNames.PLUMBING_PIPES_ASSOCIATED_COSTS_REMARKS, "Plumbing faults- Repair/replace plumbing pipes, and restore the entire surface in good condition. Finishing (Tiles/Paints) to be done on the complete affected wall.", false),
    SANITARY_CLAUSE_B_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_B_TEXT_AREA, AttributeNames.WATER_PRESSURE_FLOODING_ISSUES_REMARKS, "Fixing of water pressure & flooding issues, arising due to narrow drainpipe or low-capacity drainpipe.", false),
    SANITARY_CLAUSE_C_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_C_TEXT_AREA, AttributeNames.REPLACEMENT_OF_BROKEN_DAMAGED_SANITARY_WARE_REMARKS, "Replacement of broken/damaged sanitary ware before handover including replacement of all Indian WCs (if any) with western WCs.", false),

    SANITARY_CLAUSE_D_TEXT_AREA("Sanitary", "(Lease Term)", AttributeNames.SANITARY_CLAUSE_D_TEXT_AREA, AttributeNames.LIAISONING_FOR_COMMERCIAL_WATER_METER_REMARKS, "Liaisoning for commercial water meter connection will be under Lessor’s scope. Lessor will provide commercial water connection of minimum inlet size 50mm dia with water meter exclusive for Lessee. Lessor will lay pipe from water meter up to LESSEE UG tank", true),
    SANITARY_CLAUSE_E_TEXT_AREA("Sanitary", "(One Time)", AttributeNames.SANITARY_CLAUSE_E_TEXT_AREA, AttributeNames.LESSEE_SEWER_LINE_REMARKS, "Lessor need to connect Lessee sewer line to municipal sewer line", true),


    WHITE_GOODS_CLAUSE_A_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_A_TEXT_AREA, AttributeNames.FUNCTIONING_A_C_REMOTES_REMARKS, "Functioning AC remotes & stabilizer to be provided with all ACs", true),
    WHITE_GOODS_CLAUSE_B_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_B_TEXT_AREA, AttributeNames._A_C_DRAINIAGE_AND_CONNECTIONS_REMARKS, "AC drainage & connection to outdoor units in case of split ACs to be planned & provided. In B.T.S. sites, AC drainage provisioning to be done along with piping for outdoor units, with piping preferably being embedded in walls/ hidden in shafts", true),
    WHITE_GOODS_CLAUSE_C_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_C_TEXT_AREA, AttributeNames.STORAGE_GEYSER_REMARKS, "Storage geyser > 15 ltrs. or instant geyser (3 ltrs. with 2/3 KW), Age < 4 years old", true),
    WHITE_GOODS_CLAUSE_D_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_D_TEXT_AREA, AttributeNames.ELECTRICAL_SOLAR_BOILER_CAPACITY_REMARKS, "Electrical /Solar boiler capacity should be > 25 ltrs per bed (Wood fired boiler not allowed). Energy efficient Heat pump is preferred over boiler and individual geysers", true),
    WHITE_GOODS_CLAUSE_E_TEXT_AREA("White Goods", "(One Time)", AttributeNames.WHITE_GOODS_CLAUSE_E_TEXT_AREA, AttributeNames.ALL_WHITE_GOODS_REQUIRING_DRAINAGE_POINT_REMARKS, "For all white goods requiring drainage point like washing machine, water cooler etc., Lessor to provide domestic water connection of 20mm dia. UPVC pipe with drain point & tap as per Lessee layout", true),
    WHITE_GOODS_CLAUSE_F_TEXT_AREA("White Goods", "(Lease Term)", AttributeNames.WHITE_GOODS_CLAUSE_F_TEXT_AREA, AttributeNames.WHITE_GOODS_REPLACEMENT_REMARKS,
            "The Lessor shall replace and provide fresh / new whitegoods, once the life of such goods has concluded, i.e. once these goods are neither repairable nor serviceable. The life of these goods will be mutually agreed and decided by the Lessor and the Lessee.", true),


    ELECTRICAL_CLAUSE_D_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_D_TEXT_AREA, AttributeNames.SUFFICIENT_CONNECTED_LOAD_CATERING_REMARKS, "Load catering to 100% occupancy (load requirement to be provided) and power factor correction as per existing load requirements to be provided based on below calculation:" +
            "</br>- Non-AC buildings: @ 0.6KW per room; Air-conditioned buildings: @ 1.5KW per room. Additional 5KW for common area or as specified by the Lessee. <b>Mention total connected load.</b>" +
            "</br>Liaising under Lessor’s scope. Power sanction to be in the name of Lessor. CEIG approvals for all equipment to be taken by Lessor.", false),
    ELECTRICAL_CLAUSE_B_TEXT_AREA("Electrical", "(Lease Term)", AttributeNames.ELECTRICAL_CLAUSE_B_TEXT_AREA, AttributeNames.WORK_ON_THE_H_T_SIDE_REMARKS, "Work on the HT side incl. transformers, servo stabilizer, metering and isolator panel, main panel with fire suppression system. Provision of 3-phase electrical line, earthing as per requirements of the Lessee.", false),

    ELECTRICAL_CLAUSE_A_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_A_TEXT_AREA, AttributeNames.ENTIRE_LIAISONING_REMARKS, "Entire Liaisoning will be under Lessor’s scope. Power sanction will be in the name of Lessor. All CEIG approvals for all equipment to be taken by Lessor", true),
    ELECTRICAL_CLAUSE_C_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_C_TEXT_AREA, AttributeNames.ROOM_WISE_SEPARATE_WIRING_REMARKS, "Room wise separate wiring with adequately sized MCCBs & RCCBs. Specifications of wiring used to be as per industry norms for different items", true),
    ELECTRICAL_CLAUSE_E_TEXT_AREA("Electrical", "(One Time)", AttributeNames.ELECTRICAL_CLAUSE_E_TEXT_AREA, AttributeNames.ALL_GEYSERS_IN_THE_BUILDING_REMARKS, "All geysers in the building to be connected to a single panel. One geyser per bath is a mandatory reqt.", true),


    POWER_BACKUP_CLAUSE_A_TEXT_AREA("Power Backup", "(Lease Term)", AttributeNames.POWER_BACKUP_CLAUSE_A_TEXT_AREA, AttributeNames.DIESEL_GENERATOR_WITH_AUTO_CHANGE_REMARKS, "Diesel Generator with auto changeover facility. Transfer working AMC or bear one-time cost for new AMC.", false),
    POWER_BACKUP_CLAUSE_B_TEXT_AREA("Power Backup", "(Lease Term)", AttributeNames.POWER_BACKUP_CLAUSE_B_TEXT_AREA, AttributeNames.REPLACEMENT_OF_D_G_REMARKS, "Provide 0.4KW inverter capacity per room with end-to-end wiring. Mention total backup load.", false),
    POWER_BACKUP_CLAUSE_C_TEXT_AREA("Power Backup", "(One Time)", AttributeNames.POWER_BACKUP_CLAUSE_C_TEXT_AREA, AttributeNames._N_O_C_P_U_C_LICENSE_FROM_LOCAL_AUTHORITY_REMARKS, "NOC/PUC license from local authority for DG. All fire safety norms and arrangements to be maintained. In cases where DG is kept within an enclosed space, there should be adequate ventilation away from living space.", false),
    POWER_BACKUP_CLAUSE_D_TEXT_AREA("Power Backup", "(Lease Term)", AttributeNames.POWER_BACKUP_CLAUSE_D_TEXT_AREA, AttributeNames.POWER_BACK_UP_WIRING_REMARKS, "Provide 0.4KW DG capacity per room with end-to-end wiring. Mention total DG capacity.", false),

    LIFT_CLAUSE_A_TEXT_AREA("Lift", "(One Time)", AttributeNames.LIFT_CLAUSE_A_TEXT_AREA, AttributeNames.LIFT_ONE_TIME_REFURBISHMENT_REMARKS, "One-time refurbishment (interiors, motor, etc.) by OEM to be done before handing over the lift. If the lift is unusable, Lessor to replace.", false),
    LIFT_CLAUSE_B_TEXT_AREA("Lift", "(One Time)", AttributeNames.LIFT_CLAUSE_B_TEXT_AREA, AttributeNames.AUTO_RESCUE_DEVICE_REMARKS, "Auto Rescue Device in working condition to be installed.", false),
    LIFT_CLAUSE_C_TEXT_AREA("Lift", "(One Time)", AttributeNames.LIFT_CLAUSE_C_TEXT_AREA, AttributeNames.WORKING_LIFT_A_M_C_REMARKS, "Provided working AMC for Lifts or bear one-time cost for new AMC.", false),
    LIFT_CLAUSE_D_TEXT_AREA("Lift", "(Lease Term)", AttributeNames.LIFT_CLAUSE_D_TEXT_AREA, AttributeNames.REPLACEMENT_OF_LIFT_REMARKS, "Lessor to ensure all lifts have proper operational panel, lights and flooring to the satisfaction of the Lessee.", false),
    LIFT_CLAUSE_E_TEXT_AREA("Lift", "(Lease Term)", AttributeNames.LIFT_CLAUSE_E_TEXT_AREA, AttributeNames.LIFT_LICENSE_RENEWAL_REMARKS, "Lift license renewal / fitness deed (wherever applicable)", false),

    EQUIPMENT_CLAUSE_A("Equipment", "(One Time)", AttributeNames.EQUIPMENT_CLAUSE_A_TEXT_AREA, AttributeNames.EQUIPMENT_CLAUSE_A_REMARKS, "Storage geyser (15 lts) or instant geyser (3 lts) of Age < 4 years old." +
            "</br>Minimum 1 per toilet.", false),
    EQUIPMENT_CLAUSE_B("Equipment", "(One Time)", AttributeNames.EQUIPMENT_CLAUSE_B_TEXT_AREA, AttributeNames.EQUIPMENT_CLAUSE_B_REMARKS, "Electric/Solar boiler of capacity > 25 lts/bed; (Wood fired boiler not allowed). Mention total hot water storage capacity.", false),
    EQUIPMENT_CLAUSE_C("Washing machine", "(One Time)", AttributeNames.EQUIPMENT_CLAUSE_C_TEXT_AREA, AttributeNames.EQUIPMENT_CLAUSE_C_REMARKS, "A covered space with plumbing and drainage points to be provided as specified by Lessee.", false),
    EQUIPMENT_CLAUSE_D("AC", "(One Time)", AttributeNames.EQUIPMENT_CLAUSE_D_TEXT_AREA, AttributeNames.EQUIPMENT_CLAUSE_D_REMARKS, "Functioning AC remotes & stabilizer to be provided for all ACs.", false),
    EQUIPMENT_CLAUSE_E("AC", "(One Time)", AttributeNames.EQUIPMENT_CLAUSE_E_TEXT_AREA, AttributeNames.EQUIPMENT_CLAUSE_E_REMARKS, "AC drainage & connection to outdoor units in case of split ACs to be planned & provided.", false),

    DOCS_AND_A_M_C_CLAUSE_A_TEXT_AREA("Docs And AMC", "(One Time)", AttributeNames.DOCS_AND_A_M_C_CLAUSE_A_TEXT_AREA, AttributeNames.ALL_TEST_CERTIFICATE_AND_DOCUMENTS, "All test certificates and Documents / Warranty certificate /manual of all equipment to be provided by the Lessor. System to be tested with Lessee’s designated engineer before handover.", false),

    ASSET_CLASE_A("Life Of Asset","(Lease Term)", AttributeNames.ASSET_CLAUSE_A_TEXT_AREA, AttributeNames.ASSET_CLAUSE_A_REMARKS, "White goods like AC, Geyser, Solar panel, Solar heater, Lifts, DG, Inverter and batteries, water pump, sump, washing machine, RO, Fridge, Microwave, TV, Furniture, fans & other electrical infrastructure etc.(if being provided by the Lessor)to be repaired/replaced by the Lessor at the end of usable life or to be taken on rent by Lessee and debited from Lessor, unless damage to such asset, is caused either by the Lessee / the residents, wherein the Lessor will not be responsible. Further, the Lessee will be responsible for the minor / day to day repairs of the assets.", false),

    COMMON_AREAS_CLAUSE_A_TEXT_AREA("Common Areas", "(Lease Term)", AttributeNames.COMMON_AREAS_CLAUSE_A_TEXT_AREA, AttributeNames.LIGHTING_AND_POWER_TO_BE_INSTALLED_REMARKS, "If common areas shared by Lessor & Lessee, the lighting & power to be installed & maintained by Lessor.", false),
    COMMON_AREAS_CLAUSE_B_TEXT_AREA("Common Areas", "(One Time)", AttributeNames.COMMON_AREAS_CLAUSE_B_TEXT_AREA, AttributeNames.INTERIOR_PAINT_COMMON_AREA_REMARKS, "The entire interior space (common areas) to be painted as per Lessee specifications, specified in the design manual", true),
    COMMON_AREAS_CLAUSE_C_TEXT_AREA("Common Areas", "(One Time)", AttributeNames.COMMON_AREAS_CLAUSE_C_TEXT_AREA, AttributeNames.BERGER_PAINT_CODE_COMMON_AREA_REMARKS, "Berger Paint Code for Common Areas<br/>Wall Paint - Show Steeler | 8T 2694 | Without Texture", true),
    COMMON_AREAS_CLAUSE_D_TEXT_AREA("Common Areas", "(One Time)", AttributeNames.COMMON_AREAS_CLAUSE_D_TEXT_AREA, AttributeNames.GENERAL_LIGHTING_COMMON_AREA_REMARKS, "General Lighting to be provided for common area as per the requirements of the Lessee specified in the design manual", true),
    COMMON_AREAS_CLAUSE_E_TEXT_AREA("Common Areas", "(Lease Term)", AttributeNames.COMMON_AREAS_CLAUSE_E_TEXT_AREA, AttributeNames.DIESEL_GENERATOR_AMC_COMMON_AREA_REMARKS, "Diesel Generator with auto change over facility with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessee. Capacity of power backup to be determined considering the basic requirement of the running of 1 light at every common area, entry & exit area", true),

	SIGNAGE_CLAUSE_A_TEXT_AREA("Signage", "(One Time Before Handing Over)", AttributeNames.SIGNAGE_CLAUSE_A_TEXT_AREA, AttributeNames.SIGNAGE_CLAUSE_A_REMARK, "a. Electrical connections as required for facade signage in locations defined by Service Provider", true),
	IT_CLAUSE_A_TEXT_AREA("CCTV with DVR", "(One Time Before Handing Over)", AttributeNames.IT_CLAUSE_A_TEXT_AREA, AttributeNames.IT_CLAUSE_A_REMARK, "CCTV with DVR as per the Specifications and Layout Provided by the Service Provider", true),
	IT_CLAUSE_B_TEXT_AREA("High Speed Broadband/Network Line", "(One Time Before Handing Over)", AttributeNames.IT_CLAUSE_B_TEXT_AREA, AttributeNames.IT_CLAUSE_B_REMARK, "High Speed Broadband/Line from Network Operators Defined by Service Provider to be Installed", true),
	IT_CLAUSE_C_TEXT_AREA("DTH Connection", "(One Time Before Handing Over)", AttributeNames.IT_CLAUSE_C_TEXT_AREA, AttributeNames.IT_CLAUSE_C_REMARK, "DTH connection to be provided for all Televisions installed in the building", true),
	
	SUPERVISOR_ROOM_CLAUSE_A_TEXT_AREA("Supervisor Room", "(One Time Before Handing Over)", AttributeNames.SUPERVISOR_ROOM_CLAUSE_A_TEXT_AREA, AttributeNames.SUPERVISOR_ROOM_CLAUSE_A_REMARK, "To be provided with table, chair, bed, wardrobe, TV connection and provision for CCTV monitoring", true),
	PARKING_CLAUSE_A_TEXT_AREA("Residents Parking and Access Control", "(One Time Before Handing Over)", AttributeNames.PARKING_CLAUSE_A_TEXT_AREA, AttributeNames.PARKING_CLAUSE_A_REMARK, "Provision for bike/car parking for residents. Access control to be installed for on-premise parking space", true),

	LANDSCAPE_CLAUSE_A_TEXT_AREA("Soft and Hard Scape", "(One Time Before Handing Over)", AttributeNames.LANDSCAPE_CLAUSE_A_TEXT_AREA, AttributeNames.LANDSCAPE_CLAUSE_A_REMARK, "Soft and hard scape in the external areas", true),
	LANDSCAPE_CLAUSE_B_TEXT_AREA("Pavers/CC in the Cirulation Area", "(One Time Before Handing Over)", AttributeNames.LANDSCAPE_CLAUSE_B_TEXT_AREA, AttributeNames.LANDSCAPE_CLAUSE_B_REMARK, "Pavers/CC in the circulation area", true),

	BOUNDARY_WALL_CLAUSE_A_TEXT_AREA("Boundary Wall Paint", "(One Time Before Handing Over)", AttributeNames.BOUNDARY_WALL_CLAUSE_A_TEXT_AREA, AttributeNames.BOUNDARY_WALL_CLAUSE_A_REMARK, "a. To be painted with the waterproof paint as per the specifications provided by the Service Provider", true),
	BOUNDARY_WALL_CLAUSE_B_TEXT_AREA("Light Fixture on Entrance & Boundary Wall Paint", "(One Time Before Handing Over)", AttributeNames.BOUNDARY_WALL_CLAUSE_B_TEXT_AREA, AttributeNames.BOUNDARY_WALL_CLAUSE_B_REMARK, "b. Light fixtures to be provided with IP 65 rating at the entrance and on the boundary wall", true),

    CORRIDOR_CLAUSE_A_TEXT_AREA("Corridor", "(One Time)", AttributeNames.CORRIDOR_CLAUSE_A_TEXT_AREA, AttributeNames.INTERIOR_PAINT_CORRIDOR_REMARKS, "The entire interior space (corridors) to be painted as per Lessee specifications, specified in the design manual", true),
    CORRIDOR_CLAUSE_B_TEXT_AREA("Corridor", "(One Time)", AttributeNames.CORRIDOR_CLAUSE_B_TEXT_AREA, AttributeNames.BERGER_PAINT_CODE_CORRIDOR_REMARKS, "Berger Paint Codes for Corridors & Staircase<br/>Texture Paint - Tree Shade | Texture-Ruff N Tuff (Scratch Fine) 8T 0346 | With Texture Wall", true),
    CORRIDOR_CLAUSE_C_TEXT_AREA("Corridor", "(One Time)", AttributeNames.CORRIDOR_CLAUSE_C_TEXT_AREA, AttributeNames.GENERAL_LIGHTING_CORRIDOR_REMARKS, "General Lighting to be provided for corridors as per the requirements of the Lessee specified in the design manual", true),
    CORRIDOR_CLAUSE_D_TEXT_AREA("Corridor", "(Lease Term)", AttributeNames.CORRIDOR_CLAUSE_D_TEXT_AREA, AttributeNames.DIESEL_GENERATOR_AMC_CORRIDOR_REMARKS, "Diesel Generator with auto change over facility with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessee. Capacity of power backup to be determined considering the basic requirement of the running of 1 light per corridor at every turn or within a distance of 75 ft in a continuous space", true);
    private String item;

    private String defaultDuration;

    private String scopeDefinitionKey;

    private String remarksKey;

    //private Integer orderNum;       //not required, as enums are already sorted by ordinal

    private String defaultScopeDefinition;

    private boolean excludeFromATL;

    public static TreeSet<String> estateAttributeTreeSet = new TreeSet<>();

    static {
        for (AtlDetailsEnum atlDetailsEnum : AtlDetailsEnum.values()) {
            estateAttributeTreeSet.add(atlDetailsEnum.getScopeDefinitionKey());
            estateAttributeTreeSet.add(atlDetailsEnum.getRemarksKey());
        }
    }

}


package com.stanzaliving.documentgenerator.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.documentgenerator.dto.DocumentDto;
import com.stanzaliving.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.stanzaliving.documentgenerator.dto.PdfDocumentDto;
import com.stanzaliving.documentgenerator.dto.PdfRequestDto;
import com.stanzaliving.documentgenerator.enums.DocumentGeneratorTemplateType;

public class ATLPdfTestData {

	public static Map<String, Object> getAtlPdfData() {
		Map<String, Object> atlData = new HashMap<>();
		atlData.put("atlDate", "31-Dec-2019");
		atlData.put("lessorNameAddressAndPan", "Debendra Dhinda ,<br/> Noida Sector 34, PAN : ARKPD678E");
		atlData.put("lesseeNameAddressAndPan", "Ankit Jindal ,<br/> Mahipalpur, PAN : ARKPD645N");

		atlData.put("siteAddress", "Address: Mahipalpur ,<br/> City: South Delhi, State : Delhi,<br/> PIN : 201302");
		atlData.put("purposeOfLease",
				"Long-stay accommodation for individuals including but not limited to students and working professionals.");
		atlData.put("totalPlotArea", "5000");
		atlData.put("totalPropertyArea", "4000");
		atlData.put("leasedPremisesArea", "2000");
//		atlData.put("noOfRooms", "60");
//		atlData.put("rentRate", "10lkh");
//		atlData.put("noOfRentInstalments", "10");
//		atlData.put("rentEscalation", "30");
//		atlData.put("rentEscalationYear", "5");
//		atlData.put("ifrsdMonths", "5");
//		atlData.put("advanceRentAdjustmentMonth", "3");
//		atlData.put("advanceRentAdjustmentMonthIn", "2");
//		atlData.put("leaseTerm", "20");
//		atlData.put("leasedPremisesHandoverDate", "2-Jan-2020");
//		
//		atlData.put("rentFreeFitOutPeriod", "60");
//		atlData.put("rentStartDate", "01-Jan-2020");
//		atlData.put("lesseLockInPeriod", "10");
//		atlData.put("noticePeriodForExitByLease", "5");
//		atlData.put("stampDuty", "Stanza");
//		atlData.put("stampDutyBy", "Branch Manager");
//		atlData.put("tokenDepositRate", "150000");
//		atlData.put("termsOfRunningHostelMonthYear", "Jan 2020");
//		atlData.put("lessorName", "Debendra Dhinda");
//		atlData.put("lessorDesignation", "Business Person");
//		atlData.put("DTwelveName", "Ankit Jindal");
//		atlData.put("DTwelveDesignation", "Branch Manager");
		
		
		
		atlData.put("commonAreasClauseATextArea","If common areas shared by Lessor & Lessee, the lighting & power to be installed & maintained by Lessor");
		atlData.put("docsAndAMCClauseATextArea","All test certificate and Documents / Warranty certificate /manual of all equipment need to be provided by the Lessor. System to be tested with Lessee engineer before handing over to Lessee");
		atlData.put("electricalClauseATextArea","Entire Liaisoning will be under Lessor’s scope. Power sanction will be in the name of Lessee Living. All CEIG approvals for all equipment to be taken by Lessor");
		atlData.put("electricalClauseBTextArea","Work on the HT side incl. transformers, voltage fluctuations in the region, servo stabilizer, metering work and isolator panel, electrical wiring, electrical infrastructure, electrical panel with fire suppression, provision of 3-phase electrical line, earthing as per requirements of the Lessee");
		atlData.put("electricalClauseCTextArea","Room wise separate wiring with adequately sized MCCBs & RCCBs. Specifications of wiring used to be as per industry norms for different items");
		atlData.put("electricalClauseDTextArea","Sufficient connected load catering to 100% occupancy (load requirement to be provided) and power factor correction as per existing load requirements. Overall load calculation of a building for- Non-AC buildings: 90% rooms to be ); .45kW + 10% rooms to be ); 1.5kW- Air-conditioned buildings: 100% rooms ); 1.5kW.");
		atlData.put("electricalClauseETextArea","All geysers in the building to be connected to a single panel. One geyser per bath is a mandatory reqt.");
		atlData.put("facadeClauseATextArea","Any masonry/plaster cracks in the facade to be fixed and façade to be painted post fixing in Lessee specified brand colors, as per scheme shared by Lessee. Any broken glass to be replaced");
		atlData.put("facadeClauseBTextArea","External door/windows - All external door and windows to be checked for faults and repaired. Faults include but are not limited to:1. Defective hinges - these need to be replaced with functioning ones. 2. Cracked or broken shutters or mosquito nets need to be repaired/replaced keeping the same finishes as the existing shutters. 3. In sliding windows - the channel to allow for easy movement and a functional drain hole.");
		atlData.put("fireClauseATextArea","Fire compliance/NOC required");
		atlData.put("fireClauseBTextArea","Supply, Installation, Testing & Commissioning of the Entire Fire Fighting System including Provision of Fire extinguishers or Sprinkler system wherever required, activated firefighting system with charged plumbing line, working hose reels and motor and separate water tanks, to run in auto mode & in compliance with codes & local norms with full working AMC. If no running AMC is there, then one-time cost required to activate a new AMC to be borne by Lessor. Lessor to get unconditional fire NOC at his own cost");
		atlData.put("liftClauseATextArea","If required, one-time refurbishment (interiors, motor, etc.) by OEM to be done before handing over the lift. In case damage makes the lift unusable, Lessor to replace.");
		atlData.put("liftClauseBTextArea","Auto Rescue Device should be installed and in working condition");
		atlData.put("liftClauseCTextArea","Lift to be provided with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessor");
		atlData.put("liftClauseDTextArea","Replacement of Lift > 12 years old");
		atlData.put("liftClauseETextArea","Lift license renewal / fitness Deed (wherever applicable).");
		atlData.put("occupiedLevelsClauseATextArea","The entire interior space (rooms, corridors, common areas) to be painted as per Lessee specifications, specified in the design manual");
		atlData.put("occupiedLevelsClauseBTextArea","Any cracks in the walls/ plaster in the interior spaces to be repaired and repainted");
		atlData.put("occupiedLevelsClauseCTextArea","General Lighting to be provided for corridors, common areas, etc as per the requirements of the Lessee specified in the design manual");
		atlData.put("occupiedLevelsClauseDTextArea","Dining space is to be provided for students. It must have the capacity to seat a minimum of 30% of the number of beds. A minimum of 10-15 sq. ft. per person must be considered for this. The associated kitchen to be approx. 20% of dining space, with a min. area of 120 sq. ft.");
		atlData.put("occupiedLevelsClauseETextArea","In case the stilt, terrace or basement is being used for common areas or dining, all flooring (tiles/stone of approved spec), electrical connections and general lighting must be provided for");
		atlData.put("occupiedLevelsClauseFTextArea","All kitchen/utensil wash/pantry areas to have hard flooring as per lessee’s specs.");
		atlData.put("powerBackupClauseATextArea","Diesel Generator with auto change over facility with working AMC. If the current system does not have AMC, then one-time cost required to activate a new AMC to be borne by Lessee. Capacity of power backup to be determined considering the basic requirement of the running of 1 light & 1 fan per room, 1 light per bathroom, 1 light per corridor at every turn or within a distance of 75 ft in a continuous space, 1 light at every common area, entry & exit area");
		atlData.put("powerBackupClauseBTextArea","Replacement of DG after 10 years of life");
		atlData.put("powerBackupClauseCTextArea","NOC / PUC license from local authority for DG. All fire safety norms and arrangements to be maintained. In cases where DG is kept within an enclosed space, there should be available ventilation or provisioning for escape of heat & smoke.");
		atlData.put("powerBackupClauseDTextArea","Power back up wiring to be done for inverter/DG.");
		atlData.put("roomClauseATextArea","All broken/cracked furniture to be repaired (woodwork, metalwork & hardware, lamination)");
		atlData.put("roomClauseBTextArea","All keys to locks of doors & almirahs must be unique and handed over with 3 key sets");
		atlData.put("roomClauseCTextArea","Two tube lights, one ceiling fan & One power point 16A per 120 sq. ft. of liveable room area in working condition and One power point of 6A per bed. General lighting and mirror light to be provided in bathrooms in working condition");
		atlData.put("roomClauseDTextArea","The room interiors to be painted in the scheme provided by the Lessee in minimum 2 coats of paint, or as many as required to achieve the acceptable finish. Any cracks/ blemishes on the existing walls to be repaired and finished well to ensure uniform look with adjacent wall.");
		atlData.put("roomClauseETextArea","Each bathroom to be fully fitted with bathroom accessories like bathroom mirror, soap dish, towel rod etc. along with basic sanitary ware like EWC, health faucet, wash basin with hot & cold mixture, shower head, bath hot & cold mixture. All components must be functioning correctly");
		atlData.put("roomClauseFTextArea","Curtain rods to be provided for windows in all rooms preferably as per lessee's specs.");
		atlData.put("sanitaryClauseATextArea","Repair/replacement of plumbing pipes & associated costs (breaking & replacing of tiles etc.)");
		atlData.put("sanitaryClauseBTextArea","Fixing of water pressure & flooding issues, arising due to narrow drainpipe or low capacity drainpipe");
		atlData.put("sanitaryClauseCTextArea","Replacement of broken/damaged sanitary ware before handover to Lessee including replacement of all Indian WCs (if any) by western WCs");
		atlData.put("sanitaryClauseDTextArea","Liaisoning for commercial water meter connection will be under Lessor’s scope. Lessor will provide commercial water connection of minimum inlet size 50mm dia with water meter exclusive for Lessee. Lessor will lay pipe from water meter up to LESSEE UG tank");
		atlData.put("sanitaryClauseETextArea","Lessor need to connect Lessee sewer line to main municipal sewer line");
		atlData.put("seepageClauseATextArea","Correction of seepage affecting any area in the building. In case of leakage in plumbing pipes, breaking of wall/ floor tiles, get leakage fixed and retiling done");
		atlData.put("seepageClauseBTextArea","Fix Issues related to drainage in the building & interface with municipal authorities");
		atlData.put("seepageClauseCTextArea","Waterproofing work on terrace, wet balcony, external surfaces and washroom to be done with proper drainage and slopes, where required");
		atlData.put("structureClauseATextArea","Implementing any amendment based on the structural integrity check carried out by Lessee");
		atlData.put("terraceAreaClauseATextArea","In case terrace level is being used for common areas or dining, weatherproof roof to be provided (steel truss with closed system and insulated metal sheeting, waterproof cladding.). Lessor to provide wall closure (aluminum framing with glass infill) to make room weatherproof.");
		atlData.put("terraceAreaClauseBTextArea","All required plumbing tap-offs and electrical connections for the usable terrace, basement, stilt floor to be provided to the satisfaction of the Lessee.");
		atlData.put("terraceAreaClauseCTextArea","Finished flooring to be provided in either stone or tile at terrace, basement, ground level if the level is usable, to the satisfaction of the Lessee.");
		atlData.put("terraceAreaClauseDTextArea","LL to provide functional toilets at terrace, basement, ground level if the level is usable. Any sewage in the basements to the be pumped via sump.");
		atlData.put("terraceAreaClauseETextArea","Protective railing up to 5 feet from FFL on terrace is required. Bamboo and MS are acceptable");
		atlData.put("terraceAreaClauseFTextArea","LL to close the exterior facade of the building (typical floors, stilt levels and terrace levels), to the satisfaction of the Lessee as specified in the design scheme");
		atlData.put("waterStorageClauseATextArea","Water tank capacity to be calculated at 200Litres/bed for both the OHT and underground tank. All OHT plumbing tanks need to be connected");
		atlData.put("waterSupplyClauseATextArea","Connected water supply from the municipal corporation to be provided for the building, with all municipal clearances and functional water meters");
		atlData.put("waterSupplyClauseBTextArea","Fully functional water pumps with full working AMC. If the current system does not have AMC, then one-time cost required for a new AMC to be borne by Lessor");
		atlData.put("waterSupplyClauseCTextArea","Automation of water storage and pumping system with full working AMC. If tno running AMC is present, then one-time cost required for new AMC to be borne by Lessor");
		atlData.put("waterSupplyClauseDTextArea","Basement/other areas may be susceptible to ingress of water - a sump to pump out water must be installed with working AMC. If no running AMC, then one-time cost to be borne by Lessor");
		atlData.put("whiteGoodsClauseATextArea","Functioning AC remotes & stabilizer are to be provided with each AC");
		atlData.put("whiteGoodsClauseBTextArea","AC drainage & connection to outdoor units in case of split ACs to be planned & provided. In B.T.S. sites, AC drainage provisioning to be done along with piping for outdoor units, with piping preferably being embedded in walls/ hidden in shafts");
		atlData.put("whiteGoodsClauseCTextArea","Storage geyser > 15 ltrs. or instant geyser (3 ltrs. with 2/3 KW), Age < 4 years old");
		atlData.put("whiteGoodsClauseDTextArea","Electrical /Solar boiler capacity should be > 25 ltrs per bed (Wood fired boiler not allowed). Energy efficient Heat pump is preferred over boiler and individual geysers");
		atlData.put("whiteGoodsClauseETextArea","For all white goods requiring drainage point like washing machine, water cooler etc., Lessor to provide domestic water connection of 20mm dia. UPVC pipe with drain point & tap as per Lessee layout.");
		
		return atlData;
	}

	
	public static PdfRequestDto getATLPDFDocumentDto() {

		DocumentDto documentDto = DocumentDto.builder().documentOutputFileName("ATL Document").serviceName("ATL")
				.build();

		Map<String, Object> modelData = getAtlPdfData();
		DocumentGeneratorTemplateRequestDto templateRequestDto = DocumentGeneratorTemplateRequestDto.builder()
				.templateName("ATL_Template_HTML.html").templateType(DocumentGeneratorTemplateType.TYPE_HTML.getName())
				.templateModelData(modelData).build();

		PdfDocumentDto pdfDocumentDto = PdfDocumentDto.builder().documentDto(documentDto)
				.templateDto(templateRequestDto).build();

		PdfRequestDto pdfRequestDto = PdfRequestDto.builder().pdfDocumentDtos(Arrays.asList(pdfDocumentDto)).build();

		return pdfRequestDto;
	}
}

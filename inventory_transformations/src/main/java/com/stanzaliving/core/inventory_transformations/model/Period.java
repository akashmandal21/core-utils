package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Period {
	private Date startDate;
	private Date endDate;
	private int basePrice;
	private double mandatoryServicesPrice;
	
	public boolean equals(Period p){
	return (startDate.equals(p.startDate) && endDate.equals(p.getEndDate()));
	}
	
	public InventoryPricing findForPeriod(List<InventoryPricing> inventoryPricingList) {
	
		for(InventoryPricing ip : inventoryPricingList) {
			if(ip.getStartDate().equals(startDate) && ip.getEndDate().equals(endDate)) {
				return ip;
			}
		}
		return null;
	}
	
	
	public int hashCode(){
		return 0;
	}

	public boolean existsIn(List<Period> currentDates) {
	
		for(Period p : currentDates) {
			if(p.getStartDate().equals(startDate) && p.getEndDate().equals(endDate)) {
				p.setBasePrice(this.getBasePrice());
				p.setMandatoryServicesPrice(this.getMandatoryServicesPrice());
				return true;
			}
		}
		return false;
	}
}

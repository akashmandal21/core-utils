package com.stanzaliving.core.inventory_transformations.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public enum MaintenanceFeeType {
	ONE_TIME_UPFRONT("One time upfront"){
		public String getValue(InventoryPricing inventoryPricing) {
			dfs.setCurrencySymbol("\u20B9");
			formatter.setDecimalFormatSymbols(dfs);
			return "(" + formatter.format(Math.round(inventoryPricing.getWpMaintainanceFee()*12 * 100D) / 100D).replaceAll("\\.00", "") + " for contract" + ")";
		}
		
		public int getMaintenanceFeeTypeId() {
			return 0;
		}
	},MONTHLY("Monthly"){
		public String getValue(InventoryPricing inventoryPricing) {
			dfs.setCurrencySymbol("\u20B9");
			formatter.setDecimalFormatSymbols(dfs);
			return "(" + formatter.format(Math.round(inventoryPricing.getProratedMaintainanceFee().intValue() * 100D) / 100D).replaceAll("\\.00", "") + " / mo" + ")";
		}
		
		public int getMaintenanceFeeTypeId() {
			return 1;
		}
	};
	
	private final String name;

	MaintenanceFeeType(String name) {
		this.name = name;
	}

	public String getDisplayName() {
        return name;
    }
	
    public static final Locale locale = new Locale("en","IN");
    
	public static final DecimalFormat formatter = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
	
	public static final DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
	
	public abstract String getValue(InventoryPricing inventoryPricing);
	
	public abstract int getMaintenanceFeeTypeId();
}

package com.stanzaliving.core.inventory_transformations.model;

public enum MessageType {
	N("NEFT"), R("RTGS"), I("INTERNAL"), IMPS("IMPS"), FT("FT");

	private MessageType(String msg) {
		this.msg = msg;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}
}

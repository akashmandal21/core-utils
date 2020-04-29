package com.stanzaliving.core.inventory_transformations.model;

public enum StudentDocumentVerification {
	NO_ACTION,APPROVED,REJECTED;
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static StudentDocumentVerification getType(Integer id) {
		switch(id) {
		case 0 : 
			return StudentDocumentVerification.NO_ACTION;
		case 1 :
			return StudentDocumentVerification.APPROVED;
		}
		return StudentDocumentVerification.REJECTED;
	}
}

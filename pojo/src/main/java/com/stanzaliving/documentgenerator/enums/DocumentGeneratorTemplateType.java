package com.stanzaliving.documentgenerator.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/***
 * 
 * Document Generator template type basically used for the type of document generator.
 * Based on the type, the corresponding template resolver engine will be instantiated. 
 *  
 *  @author debendra.dhinda
 * */

@Getter
public enum DocumentGeneratorTemplateType {

	TYPE_FTL("FTL"),
	TYPE_HTML("HTML"),
	EXTENSION_FTL(".ftl"),
	EXTENSION_HTML(".html");
	
	private String name;

	private DocumentGeneratorTemplateType(String name) {
		this.name = name;
	}

	private static Map<String, DocumentGeneratorTemplateType> documentGeneratorTemplateTypes = new HashMap<>();

	static {

		for (DocumentGeneratorTemplateType type : DocumentGeneratorTemplateType.values()) {
			documentGeneratorTemplateTypes.put(type.getName(), type);
		}
	}

	public static DocumentGeneratorTemplateType getTemplateTypeByName(String name) {
		return documentGeneratorTemplateTypes.get(name);
	}

}

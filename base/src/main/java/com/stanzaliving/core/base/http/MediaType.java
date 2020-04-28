package com.stanzaliving.core.base.http;


import java.nio.charset.Charset;
import java.util.Map;

public class MediaType extends org.springframework.http.MediaType {
	public MediaType(String type) {
		super(type);
	}

	public MediaType(String type, String subtype) {
		super(type, subtype);
	}

	public MediaType(String type, String subtype, Charset charset) {
		super(type, subtype, charset);
	}

	public MediaType(String type, String subtype, double qualityValue) {
		super(type, subtype, qualityValue);
	}

	public MediaType(org.springframework.http.MediaType other, Charset charset) {
		super(other, charset);
	}

	public MediaType(org.springframework.http.MediaType other, Map<String, String> parameters) {
		super(other, parameters);
	}

	public MediaType(String type, String subtype, Map<String, String> parameters) {
		super(type, subtype, parameters);
	}


	public static final org.springframework.http.MediaType APPLICATION_XLS = valueOf("application/vnd.ms-excel");
	public static final String APPLICATION_XLS_VALUE = "application/vnd.ms-excel";

	public static final org.springframework.http.MediaType APPLICATION_XLSX = valueOf("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	public static final String APPLICATION_XLSX_VALUE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";


}

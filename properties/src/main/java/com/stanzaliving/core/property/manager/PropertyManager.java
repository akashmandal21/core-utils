package com.stanzaliving.core.property.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyManager {

	private static final Logger logger = Logger.getLogger(PropertyManager.class);

	@Autowired(required = true)
	private Environment properties;

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public String getProperty(String key, String option) {
		String value = properties.getProperty(key);
		if (StringUtils.isEmpty(value)) {
			value = option;
		}
		return value;
	}

	public Integer getPropertyAsInt(String key) {
		Integer retValue = 0;

		try {
			retValue = Integer.parseInt(properties.getProperty(key));
		} catch (NumberFormatException nfExp) {
			logger.error("Integer property not found - " + key, nfExp);
		}

		return retValue;
	}

	public Long getPropertyAsLong(String key) {
		Long retValue = 0L;

		try {
			retValue = Long.parseLong(properties.getProperty(key));
		} catch (NumberFormatException nfExp) {
			logger.error("Long property not found - " + key, nfExp);
		}

		return retValue;
	}

	public Double getPropertyAsDouble(String key) {
		Double retValue = 0D;

		try {
			retValue = Double.parseDouble(properties.getProperty(key));
		} catch (NumberFormatException nfExp) {
			logger.error("Double property not found - " + key, nfExp);
		}

		return retValue;
	}

	public Boolean getPropertyAsBoolean(String key) {
		String objProperty = properties.getProperty(key);

		if (StringUtils.isNotBlank(objProperty)) {
			return new Boolean(objProperty);
		} else {
			return false;
		}
	}

	public Byte getPropertyAsByte(String key) {
		Byte retValue = null;

		try {
			retValue = Byte.parseByte(properties.getProperty(key));
		} catch (NumberFormatException nfExp) {
			logger.error("Byte property not found - " + key, nfExp);
		}

		return retValue;
	}

	public String[] getPropertyAsStringArray(String key) {
		String stringProp = properties.getProperty(key);

		if (stringProp == null) {
			return new String[] {};
		}

		return stringProp.split(",");
	}

	public Boolean[] getPropertyAsBooleanArray(String key) {
		String stringProp = properties.getProperty(key);

		String[] strPieces = stringProp.split(",");
		Boolean[] boolPieces = new Boolean[strPieces.length];

		for (int i = 0; i < strPieces.length; i++) {
			boolPieces[i] = Boolean.parseBoolean(strPieces[i]);
		}
		return boolPieces;
	}

	public Integer[] getPropertyAsIntArray(String key) {
		String stringProp = properties.getProperty(key);
		String[] strPieces = stringProp.split(",");
		Integer[] intPieces = new Integer[strPieces.length];

		for (int i = 0; i < strPieces.length; i++) {
			intPieces[i] = Integer.parseInt(strPieces[i]);
		}
		return intPieces;
	}

	public String getNonNullProperty(String key) {
		String value = getProperty(key);

		if (StringUtils.isBlank(key) || StringUtils.isBlank(value)) {
			return StringUtils.EMPTY;
		}
		return value;
	}

	public String x(String key, String defaultValue) {
		String retValue = getNonNullProperty(key);

		if (StringUtils.isBlank(retValue)) {
			retValue = defaultValue;
		}
		return retValue;
	}

	public List<String> getPropertyAsList(String key) {
		List<String> list = new ArrayList<>();
		String stringProp = properties.getProperty(key);

		if (StringUtils.isBlank(stringProp)) {
			return list;
		}

		String[] strPieces = stringProp.split("&");
		for (int i = 0; i < strPieces.length; i++) {
			list.add(strPieces[i]);
		}

		return list;
	}

	public Map<String, String> getPropertyAsMap(String key) {
		Map<String, String> map = new HashMap<>();
		List<String> list = getPropertyAsList(key);

		if (CollectionUtils.isNotEmpty(list)) {
			for (String row : list) {
				String[] keyAndValue = row.split("=");

				if (keyAndValue.length == 1) {
					map.put(keyAndValue[0], "null");
				} else {
					map.put(keyAndValue[0], keyAndValue[1]);
				}
			}
		}
		return map;
	}

	public List<Integer> getPropertyAsListInt(String key) {
		List<String> items = getPropertyAsList(key);

		if (CollectionUtils.isNotEmpty(items)) {
			return items.parallelStream().map(Integer::parseInt).collect(Collectors.toList());
		}

		return new ArrayList<>();
	}

	public List<Long> getPropertyAsListLong(String key) {
		List<String> items = getPropertyAsList(key);

		if (CollectionUtils.isNotEmpty(items)) {
			return items.parallelStream().map(Long::parseLong).collect(Collectors.toList());
		}

		return new ArrayList<>();
	}

	public List<Float> getPropertyAsListFloat(String key) {
		List<String> items = getPropertyAsList(key);

		if (CollectionUtils.isNotEmpty(items)) {
			return items.parallelStream().map(Float::parseFloat).collect(Collectors.toList());
		}

		return new ArrayList<>();
	}

	public List<Double> getPropertyAsListDouble(String key) {
		List<String> items = getPropertyAsList(key);

		if (CollectionUtils.isNotEmpty(items)) {
			return items.parallelStream().map(Double::parseDouble).collect(Collectors.toList());
		}

		return new ArrayList<>();
	}

}
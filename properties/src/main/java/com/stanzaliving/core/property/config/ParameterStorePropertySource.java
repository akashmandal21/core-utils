package com.stanzaliving.core.property.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.core.env.EnumerablePropertySource;

import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathRequest;
import com.amazonaws.services.simplesystemsmanagement.model.GetParametersByPathResult;
import com.amazonaws.services.simplesystemsmanagement.model.Parameter;
import com.stanzaliving.core.property.exception.ParameterStoreRuntimeException;

public class ParameterStorePropertySource extends EnumerablePropertySource<AWSSimpleSystemsManagement> {

	private Map<String, Object> properties = new HashMap<>();

	public ParameterStorePropertySource(String context, AWSSimpleSystemsManagement ssmClient) {
		super(context, ssmClient);
		init();
	}

	private void init() {

		GetParametersByPathRequest paramsRequest =
				new GetParametersByPathRequest()
						.withPath(name)
						.withRecursive(true)
						.withWithDecryption(true);

		getParameters(paramsRequest);
	}

	private void getParameters(GetParametersByPathRequest paramsRequest) {

		try {
			GetParametersByPathResult paramsResult = source.getParametersByPath(paramsRequest);

			for (Parameter parameter : paramsResult.getParameters()) {
				System.out.println("Loading Property: " + parameter.getName());

				properties.put(parameter.getName(), parameter.getValue());
			}

			if (paramsResult.getNextToken() != null) {
				getParameters(paramsRequest.withNextToken(paramsResult.getNextToken()));
			}
		} catch (Exception e) {
			throw new ParameterStoreRuntimeException("Error Retriving Properties for Path: " + name, e);
		}
	}

	@Override
	public String[] getPropertyNames() {
		Set<String> propertyKeys = properties.keySet();

		return propertyKeys.toArray(new String[propertyKeys.size()]);
	}

	@Override
	public Object getProperty(String name) {
		return properties.get(name);
	}

}
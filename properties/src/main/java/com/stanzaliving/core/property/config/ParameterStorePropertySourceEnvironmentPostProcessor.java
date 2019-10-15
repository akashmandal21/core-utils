/**
 * 
 */
package com.stanzaliving.core.property.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder;

/**
 * @author naveen
 *
 * @date 29-Sep-2019
 */
public class ParameterStorePropertySourceEnvironmentPostProcessor implements EnvironmentPostProcessor {

	static final String PARAMETER_STORE_ENABLED_CONFIGURATION_PROPERTY = "awsParameterStorePropertySource.enabled";

	private static final String PARAMETER_STORE_PROPERTY_SOURCE_NAME = "awsParameterStorePropertyContextPath";

	private boolean initialized;

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

		System.out.println("Running Parameter Store Post Processor");

		if (!initialized && isParameterStorePropertySourceEnabled(environment)) {

			System.out.println("Initializing Parameter Store Properties");
			environment.getPropertySources()
					.addFirst(
							new ParameterStorePropertySource(
									environment.getProperty(PARAMETER_STORE_PROPERTY_SOURCE_NAME), getAwsSystemManager(environment)));

			initialized = true;

			System.out.println("Initialized Parameter Store Properties");
		}

		System.out.println("Exit Parameter Store Post Processor");

	}

	private AWSSimpleSystemsManagement getAwsSystemManager(ConfigurableEnvironment environment) {

		AWSCredentialsProvider credentials =
				new AWSStaticCredentialsProvider(
						new BasicAWSCredentials(
								environment.getProperty("cloud.aws.credentials.accessKey"),
								environment.getProperty("cloud.aws.credentials.secretKey")));

		System.out.println("Generated AWS Credentials for Parameters");

		return AWSSimpleSystemsManagementClientBuilder
				.standard()
				.withCredentials(credentials)
				.withRegion(environment.getProperty("cloud.aws.region"))
				.build();
	}

	private boolean isParameterStorePropertySourceEnabled(ConfigurableEnvironment environment) {
		return environment.getProperty(PARAMETER_STORE_ENABLED_CONFIGURATION_PROPERTY, Boolean.class, Boolean.FALSE);

	}

}

/**
 * 
 */
package com.stanzaliving.core.amazons3.util;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.amazonaws.services.s3.AmazonS3;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 10-Jan-2019
 */
@UtilityClass
public class S3Util {

	private static final String DELIMETER = "/";

	public static String createFilePathWithPrefix(String prefix, String fileName) {

		if (StringUtils.isNotBlank(prefix)) {

			if (prefix.endsWith(DELIMETER)) {
				fileName = prefix + fileName;
			} else {
				fileName = prefix + DELIMETER + fileName;
			}
		}

		return fileName;
	}

	public static AmazonS3 getAmazonS3Client(AmazonS3 s3Client) throws IllegalAccessException {

		if (Objects.nonNull(s3Client)) {
			return s3Client;
		}

		throw new IllegalAccessException("Amazon S3 Client Configuration Not Provided");
	}
}
/**
 * 
 */
package com.stanzaliving.core.paytm.pg.mercant;

import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.paytm.EncryptConstants;
import com.stanzaliving.core.paytm.pg.crypto.Encryption;
import com.stanzaliving.core.paytm.pg.crypto.impl.CryptoUtils;
import com.stanzaliving.core.paytm.pg.crypto.impl.EncryptionFactory;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * @author naveen
 *
 * @date 16-Jul-2018
 */
@Log4j2
@UtilityClass
public class CheckSumServiceHelper {

	private static final String CHECKSUM_VERSION = "2.0";

	public static String getVersion() {
		return CHECKSUM_VERSION;
	}

	public String generateCheckSum(String key, SortedMap<String, String> paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);

			return getChecksumForParamMap(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating check sum: ", e);
		}

		return null;
	}

	public String generateRefundCheckSum(String key, SortedMap<String, String> paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);

			return getRefundChecksumForParamMap(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating refund check sum: ", e);
		}

		return null;
	}

	public String generateCheckSumGAE(String key, SortedMap<String, String> paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_GAE_SUN_JCE);

			return getChecksumForParamMap(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating checksum using GAE Sun JCE: ", e);
		}

		return null;
	}

	public String generateRefundCheckSumGAE(String key, SortedMap<String, String> paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_GAE_SUN_JCE);

			return getRefundChecksumForParamMap(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating refund checksum using GAE Sun JCE: ", e);
		}

		return null;
	}

	public String generateCheckSumIBMJCE(String key, SortedMap<String, String> paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_IBM_JCE);

			return getChecksumForParamMap(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating checksum using IBM JCE: ", e);
		}

		return null;
	}

	public String generateRefundCheckSumIBMJCE(String key, SortedMap<String, String> paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_IBM_JCE);

			return getRefundChecksumForParamMap(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating refund checksum using IBM JCE: ", e);
		}

		return null;
	}

	public String generateCheckSumIBMJCEQueryStr(String key, String paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_IBM_JCE);

			return getChecksumFromQueryStr(key, paramMap, encryption);

		} catch (SecurityException e) {
			log.error("Error generating checksum with string query params using IBM JCE: ", e);
		}

		return null;
	}

	private String getChecksumForParamMap(String key, SortedMap<String, String> paramMap, Encryption encryptionType) {

		return getChecksum(key, encryptionType, getCheckSumString(paramMap));
	}

	private String getRefundChecksumForParamMap(String key, SortedMap<String, String> paramMap, Encryption encryption) {

		return getChecksum(key, encryption, getRefundCheckSumString(paramMap));
	}

	private String getChecksumFromQueryStr(String key, String paramMap, Encryption encryption) {

		return getChecksum(key, encryption, getCheckSumStringByQueryString(paramMap));
	}

	private String getChecksum(String key, Encryption encryption, StringBuilder response) {

		String checkSumValue;

		String randomNo = CryptoUtils.generateRandomString(4);
		response.append(randomNo);

		String checkSumHash = CryptoUtils.getSHA256(response.toString());
		checkSumHash = checkSumHash.concat(randomNo);

		checkSumValue = encryption.encrypt(checkSumHash, key);

		if (checkSumValue != null) {
			checkSumValue = checkSumValue.replaceAll("\r\n", "");
			checkSumValue = checkSumValue.replaceAll("\r", "");
			checkSumValue = checkSumValue.replaceAll("\n", "");
		}

		return checkSumValue;
	}

	private StringBuilder getCheckSumString(SortedMap<String, String> paramMap) {

		StringBuilder checkSumStringBuffer = new StringBuilder("");

		prepareCheckSumString(paramMap, (String value) -> {
			if (!value.toLowerCase().contains("|") && !value.toLowerCase().contains("refund")) {
				checkSumStringBuffer.append(value).append("|");
			}
		});

		return checkSumStringBuffer;
	}

	public StringBuilder getRefundCheckSumString(SortedMap<String, String> paramMap) {

		StringBuilder checkSumStringBuffer = new StringBuilder("");

		prepareCheckSumString(paramMap, (String value) -> {
			if (!value.toLowerCase().contains("|")) {
				checkSumStringBuffer.append(value).append("|");
			}
		});

		return checkSumStringBuffer;
	}

	private StringBuilder getCheckSumStringByQueryString(String paramString) {

		SortedMap<String, String> paramMap = getParamMapFromString(paramString);

		StringBuilder checkSumStringBuffer = new StringBuilder("");

		prepareCheckSumString(paramMap, (String value) -> {
			if (!value.toLowerCase().contains("|") && !value.toLowerCase().contains("refund")) {
				checkSumStringBuffer.append(value).append("|");
			}
		});

		return checkSumStringBuffer;
	}

	private void prepareCheckSumString(SortedMap<String, String> paramMap, Consumer<String> action) {
		for (Entry<String, String> entry : paramMap.entrySet()) {
			if (!"CHECKSUMHASH".equalsIgnoreCase(entry.getKey())) {
				String value = entry.getValue();

				if (value == null || value.trim().equalsIgnoreCase("NULL")) {
					value = "";
				}

				action.accept(value);
			}
		}
	}

	private SortedMap<String, String> getParamMapFromString(String paramString) {
		SortedMap<String, String> paramMap = new TreeMap<>();

		if (StringUtils.isNotBlank(paramString)) {
			String[] params = paramString.split("&");
			String[] keyValue;

			if (params != null && params.length > 0) {

				String[] arrayOfString1 = params;

				for (int i = 0; i < arrayOfString1.length; i++) {

					String param = arrayOfString1[i];
					keyValue = param.split("=");

					addValueToMap(paramMap, keyValue);
				}
			}
		}

		return paramMap;
	}

	public String generateCheckSum(String key, String paramMap) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);

			StringBuilder response = new StringBuilder(paramMap);
			response.append("|");

			return getChecksum(key, encryption, response);

		} catch (SecurityException e) {
			log.error("Error generating checksum: ", e);
		}

		return null;
	}

	public SortedMap<String, String> getParamsMapFromEncParam(String masterKey, String encParam) {
		try {

			if (masterKey != null && encParam != null) {

				Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);
				String paramsString = encryption.decrypt(encParam, masterKey);

				if (paramsString != null) {
					return getMapForRawData(paramsString);
				}
			}

		} catch (Exception e) {
			log.error("Error generating param map from encrypted string: ", e);
		}

		return null;
	}

	public String getDecryptedValue(String masterKey, String decryptTo) {

		try {
			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);
			return encryption.decrypt(decryptTo, masterKey);
		} catch (Exception e) {
			log.error("Error while decrypting value: ", e);
		}

		return null;
	}

	private SortedMap<String, String> getMapForRawData(String rawData) {

		if (rawData != null) {

			String[] params = rawData.split("\\|");

			if (params != null && params.length > 0) {

				SortedMap<String, String> resp = new TreeMap<>();
				String[] arrayOfString1 = params;

				for (int i = 0; i < arrayOfString1.length; i++) {

					String param = arrayOfString1[i];
					String[] keyValue = param.split("=");

					addValueToMap(resp, keyValue);
				}

				return resp;
			}
		}

		return null;
	}

	private void addValueToMap(SortedMap<String, String> resp, String[] keyValue) {
		if (keyValue != null) {

			if (keyValue.length == 2) {
				resp.put(keyValue[0], keyValue[1]);
			} else if (keyValue.length == 1) {
				resp.put(keyValue[0], "");
			}
		}
	}

	public String getEncryptedParam(String masterKey, SortedMap<String, String> paramMap) {

		StringBuilder params = new StringBuilder();

		try {
			if (MapUtils.isNotEmpty(paramMap)) {

				for (Map.Entry<String, String> entry : paramMap.entrySet()) {
					params.append((entry.getKey()).trim()).append("=").append((entry.getValue()).trim()).append("|");
				}
			}

			Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);
			return encryption.encrypt(params.toString(), masterKey);

		} catch (Exception e) {
			log.error("Error generating encryted params: ", e);
		}

		return null;
	}

	public boolean verifyCheckSum(String masterKey, SortedMap<String, String> paramMap, String responseCheckSumString) {
		Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);

		StringBuilder response = getCheckSumString(paramMap);
		return validateChecksum(masterKey, responseCheckSumString, encryption, response);
	}

	public boolean verifyCheckSumQueryStr(String masterKey, String paramMap, String responseCheckSumString) {
		Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_TYPE_AES);

		StringBuilder response = getCheckSumStringByQueryString(paramMap);
		return validateChecksum(masterKey, responseCheckSumString, encryption, response);
	}

	public boolean verifyCheckSumGAE(String masterKey, SortedMap<String, String> paramMap, String responseCheckSumString) {
		Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_GAE_SUN_JCE);

		StringBuilder response = getCheckSumString(paramMap);
		return validateChecksum(masterKey, responseCheckSumString, encryption, response);
	}

	public boolean verifyCheckSumGAEQueryStr(String masterKey, String paramMap, String responseCheckSumString) {
		Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_GAE_SUN_JCE);

		StringBuilder response = getCheckSumStringByQueryString(paramMap);
		return validateChecksum(masterKey, responseCheckSumString, encryption, response);
	}

	public static boolean verifyCheckSumIBMJCE(String masterKey, SortedMap<String, String> paramMap, String responseCheckSumString) {

		Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_IBM_JCE);

		StringBuilder response = getCheckSumString(paramMap);
		return validateChecksum(masterKey, responseCheckSumString, encryption, response);
	}

	public static boolean verifyCheckSumIBMJCEQueryStr(String masterKey, String paramMap, String responseCheckSumString) {

		Encryption encryption = EncryptionFactory.getEncryptionInstance(EncryptConstants.ALGTHM_PROVIDER_IBM_JCE);

		StringBuilder response = getCheckSumStringByQueryString(paramMap);
		return validateChecksum(masterKey, responseCheckSumString, encryption, response);
	}

	private static boolean validateChecksum(String masterKey, String responseCheckSumString, Encryption encryption, StringBuilder response) {

		String responseCheckSumHash = encryption.decrypt(responseCheckSumString, masterKey);

		String randomStr = getLastNChars(responseCheckSumHash, 4);
		String paytmCheckSumHash = calculateRequestCheckSum(randomStr, response.toString());

		return responseCheckSumHash != null && paytmCheckSumHash != null && responseCheckSumHash.equals(paytmCheckSumHash);
	}

	private static String getLastNChars(String inputString, int subStringLength) {

		if (StringUtils.isNotBlank(inputString)) {

			int length = inputString.length();

			if (length <= subStringLength) {
				return inputString;
			}

			int startIndex = length - subStringLength;
			return inputString.substring(startIndex);
		}

		return "";
	}

	private static String calculateRequestCheckSum(String randomStr, String checkSumString) {

		String reqCheckSumValue = checkSumString;

		String checkSumHash = CryptoUtils.getSHA256(reqCheckSumValue.concat(randomStr));
		checkSumHash = checkSumHash.concat(randomStr);

		return checkSumHash;
	}

	public static void main(String[] a) {
		try {

			String masterKey = "1234567812345678";
			String encyptedValue = CheckSumServiceHelper.generateCheckSum(masterKey, "naveen");

			System.out.println("encyptedValue= " + encyptedValue);

			System.out.println("verifyChecksum= " + CheckSumServiceHelper.verifyCheckSumQueryStr(masterKey, null, encyptedValue));

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
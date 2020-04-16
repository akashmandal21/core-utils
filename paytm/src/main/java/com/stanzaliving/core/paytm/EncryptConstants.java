/**
 * 
 */
package com.stanzaliving.core.paytm;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 16-Jul-2018
 */
@UtilityClass
public class EncryptConstants {

	public static final String ALGTHM_TYPE_3DES = "DESede";
	public static final String ALGTHM_TYPE_HASH_SHA_256 = "SHA-256";
	public static final String ALGTHM_CBC_PAD_AES = "AES/CBC/PKCS5PADDING";
	public static final String STR_COMMA = ",";
	public static final String KEYSTORE_TYPE = "JCEKS";
	public static final String ALIAS_TYPE_AES = "ALIAS_AES";
	public static final String ALIAS_TYPE_3DES = "ALIAS_3DES";
	public static final String KEYSTORE_NOT_FOUND_MSG = "Not able to load or generate the KeyStore";

	public static final String ALGTHM_TYPE_AES = "AES";

	public static final String ALGTHM_PROVIDER_GAE_SUN_JCE = "SunJCE";
	public static final String ALGTHM_PROVIDER_IBM_JCE = "IBMJCE";

}
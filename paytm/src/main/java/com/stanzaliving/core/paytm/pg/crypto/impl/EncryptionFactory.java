/**
 * 
 */
package com.stanzaliving.core.paytm.pg.crypto.impl;

import com.stanzaliving.core.paytm.EncryptConstants;
import com.stanzaliving.core.paytm.pg.crypto.Encryption;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 16-Jul-2018
 */
@UtilityClass
public class EncryptionFactory {

	public static Encryption getEncryptionInstance(String algorithmType) {

		switch (algorithmType) {
			case EncryptConstants.ALGTHM_TYPE_AES:
				return new AesEncryption();

			case EncryptConstants.ALGTHM_PROVIDER_GAE_SUN_JCE:
				return new AesEncryptionGAE();

			case EncryptConstants.ALGTHM_PROVIDER_IBM_JCE:
				return new AesEncryptionIBMJCE();

			default:
				return new AesEncryption();
		}

	}

}
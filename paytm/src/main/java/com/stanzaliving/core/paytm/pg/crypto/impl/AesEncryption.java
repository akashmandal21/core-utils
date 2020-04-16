package com.stanzaliving.core.paytm.pg.crypto.impl;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.stanzaliving.core.paytm.pg.crypto.Encryption;

import lombok.extern.log4j.Log4j2;

/**
 * @author naveen
 *
 * @date 16-Jul-2018
 */
@Log4j2
public class AesEncryption implements Encryption {

	private static final byte[] ivParamBytes = { 64, 64, 64, 64,
			38, 38, 38, 38,
			35, 35, 35, 35,
			36, 36, 36, 36 };

	public String encrypt(String toEncrypt, String key) {
		String encryptedValue = "";

		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING", "SunJCE");

			cipher.init(1, new SecretKeySpec(key.getBytes(), "AES"), new IvParameterSpec(ivParamBytes));
			encryptedValue = new String(Base64.getEncoder().encode(cipher.doFinal(toEncrypt.getBytes())));

		} catch (NoSuchAlgorithmException
				| NoSuchProviderException
				| NoSuchPaddingException
				| InvalidKeyException
				| InvalidAlgorithmParameterException
				| IllegalBlockSizeException
				| BadPaddingException e) {

			log.error("Error while encrypting key: ", e);
		}

		return encryptedValue;
	}

	public String decrypt(String toDecrypt, String key) {
		String decryptedValue = "";

		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING", "SunJCE");
			cipher.init(2, new SecretKeySpec(key.getBytes(), "AES"), new IvParameterSpec(ivParamBytes));
			decryptedValue = new String(cipher.doFinal(Base64.getDecoder().decode(toDecrypt)));

		} catch (NoSuchAlgorithmException
				| NoSuchProviderException
				| NoSuchPaddingException
				| InvalidKeyException
				| InvalidAlgorithmParameterException
				| IllegalBlockSizeException
				| BadPaddingException e) {

			log.error("Error while decrypting key: ", e);
		}

		return decryptedValue;
	}
}
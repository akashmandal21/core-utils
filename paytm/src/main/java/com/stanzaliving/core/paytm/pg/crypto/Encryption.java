/**
 * 
 */
package com.stanzaliving.core.paytm.pg.crypto;

/**
 * @author naveen
 *
 * @date 16-Jul-2018
 */
public interface Encryption {

	String encrypt(String stringToEncrypt, String password);

	String decrypt(String stringToDecrypt, String password);

}
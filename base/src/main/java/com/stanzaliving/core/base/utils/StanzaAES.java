package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@Log4j2
@UtilityClass
public class StanzaAES {

    private static String ALGO = "AES";
    // Default uses ECB PKCS5Padding

    public String encrypt(String textToEncrypt, String secretKeyEncodedInBase64) throws Exception {
        Key key = generateKey(secretKeyEncodedInBase64);
        Cipher cipher = Cipher.getInstance(ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = cipher.doFinal(textToEncrypt.getBytes());
        String encryptedValue = Base64.getEncoder().encodeToString(encVal);
        return encryptedValue;
    }

    public String decrypt(String textToDecrypt, String secretKeyEncodedInBase64) {
        try {
            Key key = generateKey(secretKeyEncodedInBase64);
            Cipher cipher = Cipher.getInstance(ALGO);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(textToDecrypt)));
        } catch (Exception e) {
            log.error("Error while decrypting: " + e);
        }
        return null;
    }

    private Key generateKey(String secret) throws Exception {
        byte[] decoded = Base64.getDecoder().decode(secret.getBytes());
        Key key = new SecretKeySpec(decoded, ALGO);
        return key;
    }

    public String decodeKeyFromBase64(String str) {
        byte[] decoded = Base64.getDecoder().decode(str.getBytes());
        return new String(decoded);
    }

    public String encodeKeyInBase64(String str) {
        byte[] encoded = Base64.getEncoder().encode(str.getBytes());
        return new String(encoded);
    }

    //Example-
    public static void example() throws Exception {
        /*
         * Secret Key must be in the form of 16 byte like,
         *
         * private static final byte[] secretKey = new byte[] { ‘m’, ‘u’, ‘s’, ‘t’, ‘b’,
         * ‘e’, ‘1’, ‘6’, ‘b’, ‘y’, ‘t’,’e’, ‘s’, ‘k’, ‘e’, ‘y’};
         *
         * below is the direct 16byte string we can use
         */
        String secretKey = "mustbe16byteskey";
        String encodedBase64Key = encodeKeyInBase64(secretKey);
        log.info("EncodedBase64Key = " + encodedBase64Key); // This need to be share between client and server

        // To check actual key from encoded base 64 secretKey
        // String toDecodeBase64Key = decodeKey(encodedBase64Key);
        // log.info("toDecodeBase64Key = "+toDecodeBase64Key);

        String toEncrypt = "Please encrypt this message!";
        log.info("Plain text = " + toEncrypt);

        // AES Encryption based on above secretKey
        String encryptedString = encrypt(toEncrypt, encodedBase64Key);
        log.info("Cipher Text: Encryption of str = " + encryptedString);

        // AES Decryption based on above secretKey
        String decryptedString = StanzaAES.decrypt(encryptedString, encodedBase64Key);
        log.info("Decryption of str = " + decryptedString);
    }
}

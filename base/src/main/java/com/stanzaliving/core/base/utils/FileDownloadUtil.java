/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * @author naveen.kumar
 *
 * @date 05-Apr-2020
 *
 **/
@Log4j2
@UtilityClass
public class FileDownloadUtil {

	public byte[] getFileContentAsBytes(String fileUrl) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {

			URL url = new URL(fileUrl);

			byte[] chunk = new byte[4096];
			int bytesRead;

			InputStream stream = url.openStream();
			while ((bytesRead = stream.read(chunk)) > 0) {
				outputStream.write(chunk, 0, bytesRead);
			}

		} catch (Exception e) {
			log.error("Exception caught while reading content from url: " + fileUrl, e);
			return null;
		}
		return outputStream.toByteArray();
	}
}
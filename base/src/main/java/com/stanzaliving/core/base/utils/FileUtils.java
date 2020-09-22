package com.stanzaliving.core.base.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

@Log4j2
@UtilityClass
public class FileUtils {

	public List<String> readMultipartToCsv(MultipartFile multipartFile) {

		File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + multipartFile.getOriginalFilename()
				+ StanzaUtils.generateUniqueId(10));
		try {
			multipartFile.transferTo(convFile);
		} catch (IllegalStateException | IOException e) {
			log.error("Got error while combining multipart to file", e);
		}

		try {
			return Files.readAllLines(convFile.toPath());
		} catch (IOException e) {
			log.error("Error While reading the file to arraylist",e);
			return Collections.emptyList();
		}
	}

}

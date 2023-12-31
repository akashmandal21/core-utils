package com.stanzaliving.core.base.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import lombok.Getter;

@Getter
public class FileWriterUtil {

	private String fileName;
	private BufferedWriter bufferedWriter;

	public FileWriterUtil(String fileName) throws IOException {

		File file = new File(fileName);

		boolean fileExists = true;

		if (!file.exists()) {
			fileExists = file.createNewFile();
		}

		if (fileExists) {
			this.fileName = fileName;
			this.bufferedWriter = new BufferedWriter(new FileWriter(file));
		}
	}

}
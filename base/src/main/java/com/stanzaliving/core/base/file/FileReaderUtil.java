package com.stanzaliving.core.base.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import lombok.Getter;

@Getter
public class FileReaderUtil {

	private String fileName;
	private BufferedReader bufferedReader;

	public FileReaderUtil(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		this.bufferedReader = (new BufferedReader(new FileReader(fileName)));
	}

}
/**
 * 
 */
package com.stanzaliving.qaservice.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author raj.kumar
 *
 */
public interface CsvUploadService {

	void createQuestionFromCsvFile(MultipartFile csvFile);
	
	void createTextTypeQuestionFromCsvFile(MultipartFile csvFile);
}

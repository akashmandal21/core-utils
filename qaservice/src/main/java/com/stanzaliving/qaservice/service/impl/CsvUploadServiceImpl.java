/**
 * 
 */
package com.stanzaliving.qaservice.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.dto.metadata.SingleOrMultipleChoice;
import com.stanzaliving.qaservice.dto.metadata.OptionsMetadataDto;
import com.stanzaliving.qaservice.dto.metadata.TextQuestion;
import com.stanzaliving.qaservice.enums.QuestionType;
import com.stanzaliving.qaservice.service.CsvUploadService;
import com.stanzaliving.qaservice.service.QuestionService;

import lombok.extern.log4j.Log4j2;

/**
 * @author raj.kumar
 *
 */
@Log4j2
@Service
public class CsvUploadServiceImpl implements CsvUploadService {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private QuestionService questionService;
	
	@Override
	public void createQuestionFromCsvFile(MultipartFile csvFile) {
		
		try {
			
			List<List<String>> csvRecords = getCsvFileRecords(csvFile);
			List<QuestionRequestDto> questionRequestList = new ArrayList<>();
			
			log.info(" CSV Records " + csvRecords);
			
			//No need for csv headers
			csvRecords.remove(0);
			
			for(List<String> csvRecord : csvRecords) {

				QuestionRequestDto questionRequestDto = new QuestionRequestDto();
				questionRequestDto.setQuestionType(QuestionType.valueOf(csvRecord.get(2)));
				questionRequestDto.setFrontendType(csvRecord.get(6));
				questionRequestDto.setQuesHeading(csvRecord.get(0));
				questionRequestDto.setQuestionIdentifier(csvRecord.get(1));
				questionRequestDto.setIsMandatory(Integer.valueOf(csvRecord.get(5)));
				questionRequestDto.setScreenGroupNumber(Integer.valueOf(csvRecord.get(3)));
				questionRequestDto.setScreenNumber(Integer.valueOf(csvRecord.get(4)));
				questionRequestDto.setOrderNumber(Integer.valueOf(csvRecord.get(8)));
				
				List<String> optionList = Arrays.asList(csvRecord.get(7).split("\\|"));
				SingleOrMultipleChoice singleOrMultipleChoice = new SingleOrMultipleChoice();
				List<OptionsMetadataDto> singleOrMultipleChoiceOptionsList = new ArrayList<>();
				
				for(String option : optionList) {
					
					OptionsMetadataDto singleOrMultipleChoiceOptions = new OptionsMetadataDto();
					
					singleOrMultipleChoiceOptions.setId(option);
					singleOrMultipleChoiceOptions.setHeading(option);
					
					singleOrMultipleChoiceOptionsList.add(singleOrMultipleChoiceOptions);
				}
				
				singleOrMultipleChoice.setOptions(singleOrMultipleChoiceOptionsList);
				String metadata = objectMapper.writeValueAsString(singleOrMultipleChoice);
				questionRequestDto.setMetadata(metadata);
				
				questionRequestList.add(questionRequestDto);
			}
			
			questionService.saveAll(questionRequestList);
			
		} catch (Exception e) {
			log.error(" Exception occurred while uploading csv file ", e);
		}
		
	}

	private List<List<String>> getCsvFileRecords(MultipartFile csvFile) throws IOException {
		
		File file = convertMultiPartToFile( csvFile );
		List<List<String>> records = new ArrayList<>();
		
		try (CSVReader csvReader = new CSVReader(new FileReader(file));) {
		    
			String[] values = null;
		    
			while ((values = csvReader.readNext()) != null) {
		        records.add(Arrays.asList(values));
		    }
		    
		}
		
		return records;
	}
	
	private File convertMultiPartToFile( MultipartFile file ) throws IOException{
        File convFile = new File( file.getOriginalFilename() );
        FileOutputStream fos = new FileOutputStream( convFile );
        fos.write( file.getBytes() );
        fos.close();
        return convFile;
    }

	@Override
	public void createTextTypeQuestionFromCsvFile(MultipartFile csvFile) {

		try {
			
			List<List<String>> csvRecords = getCsvFileRecords(csvFile);
			List<QuestionRequestDto> questionRequestList = new ArrayList<>();
			
			log.info(" CSV Records " + csvRecords);
			
			//No need for csv headers
			csvRecords.remove(0);
			
			for(List<String> csvRecord : csvRecords) {

				QuestionRequestDto questionRequestDto = new QuestionRequestDto();
				questionRequestDto.setQuestionType(QuestionType.valueOf(csvRecord.get(2)));
				questionRequestDto.setFrontendType(csvRecord.get(6));
				questionRequestDto.setQuesHeading(csvRecord.get(0));
				questionRequestDto.setQuestionIdentifier(csvRecord.get(1));
				questionRequestDto.setIsMandatory(Integer.valueOf(csvRecord.get(5)));
				questionRequestDto.setScreenGroupNumber(Integer.valueOf(csvRecord.get(3)));
				questionRequestDto.setScreenNumber(Integer.valueOf(csvRecord.get(4)));
				questionRequestDto.setOrderNumber(Integer.valueOf(csvRecord.get(8)));
				
				List<String> optionList = Arrays.asList(csvRecord.get(7).split("\\|"));
				
				TextQuestion textQuestion = new TextQuestion();
				
				textQuestion.setPlaceHolder(optionList.get(0));
				textQuestion.setUnitIdentifier(optionList.get(1));
				textQuestion.setValidationRegex(optionList.get(2));
				
				String metadata = objectMapper.writeValueAsString(textQuestion);
				questionRequestDto.setMetadata(metadata);				
				questionRequestList.add(questionRequestDto);
			}
			
			questionService.saveAll(questionRequestList);
			
		} catch (Exception e) {
			log.error(" Exception occurred while uploading csv file ", e);
		}
		
	}
}

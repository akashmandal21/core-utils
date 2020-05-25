package com.stanzaliving.qrcode.service.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanza.qr.generator.QRGeneratorUtility;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.enums.QRContextType;
import com.stanzaliving.qrcode.repository.QRDataRepository;
import com.stanzaliving.qrcode.service.QRGetService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class QRGetServiceImpl implements QRGetService {

	@Autowired
	private QRDataRepository qrDataRepository;
	
	@Override
	public BufferedImage getQRCode(String contextId, String subContextId, QRContextType qrContextType) {
		
		if(Objects.isNull(contextId) || Objects.isNull(qrContextType)) {
			
			log.info("Either contextId {} or contextType {} is null",contextId,qrContextType);
			
			return null;
		}
		
		String qrContent = ((Long)System.nanoTime()).toString();
		
		BufferedImage image = null;
		
		try {
			image = QRGeneratorUtility.generateQRImageUsingLong(qrContent);
		} catch (IOException e) {
			log.error("Got error while generating image ",e);
			return null;
		}
		
		if(Objects.nonNull(image)) {
			QRData qrData = QRData.builder().contextId(contextId).data(qrContent).qrContextType(qrContextType).subContextId(subContextId).build();
			
			qrData = qrDataRepository.save(qrData);
			
			return (Objects.nonNull(image))?image:null;
		}
		
		return null;
		
	}

}

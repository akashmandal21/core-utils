package com.stanzaliving.qrcode.service.impl;

import java.awt.image.BufferedImage;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanza.qr.validator.QRCodeDataExtractor;
import com.stanza.qr.validator.QRDecoderOptions;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.security.helper.SecurityUtils;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.entity.QRScanHistory;
import com.stanzaliving.qrcode.repository.QRDataRepository;
import com.stanzaliving.qrcode.repository.QRScanHistoryRepository;
import com.stanzaliving.qrcode.service.QRScanService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class QRScanServiceImpl implements QRScanService {

	@Autowired
	private QRDataRepository qrDataRepository;
	
	@Autowired
	private QRScanHistoryRepository qrScanHistoryRepository;
	
	@Override
	public QRData getQRData(BufferedImage image) {
		
		String output = null;
		
		for (QRDecoderOptions qrDecoderOptions : QRDecoderOptions.values()) {
			
			output = QRCodeDataExtractor.decodeSingleQRCode(image, qrDecoderOptions);			
		
			if(Objects.nonNull(output)) {
				break;
			}
		}
		
		log.info("Output after scan is {}",output);
		
		QRData qrData = qrDataRepository.findByData(output);
		
		log.info("QRData after scan is {}",qrData);
		
		if(Objects.nonNull(qrData)) {
			qrScanHistoryRepository.save(
					QRScanHistory.builder().qrUUid(qrData.getUuid()).userId(SecurityUtils.getCurrentUserId()).build());
			return qrData;
		}
		
		throw new StanzaException("Invalid QrCode");
	}

}

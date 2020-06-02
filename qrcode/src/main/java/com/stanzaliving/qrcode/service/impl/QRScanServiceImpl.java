package com.stanzaliving.qrcode.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.security.helper.SecurityUtils;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.entity.QRScanHistory;
import com.stanzaliving.qrcode.enums.QRContextType;
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
	public QRData getQRData(String code,String userId) {
		
		log.info("Output after scan is {}",code);
		
		QRData qrData = qrDataRepository.findByData(code);
		
		log.info("QRData after scan is {}",qrData);
		
		if(Objects.nonNull(qrData)) {
			
			if(Objects.isNull(userId)) {
				userId = SecurityUtils.getCurrentUserId();
			}
			
			qrScanHistoryRepository.save(
					QRScanHistory.builder().qrUUid(qrData.getUuid()).userId(userId).build());
			
			qrData.setScannedTimes(qrData.getScannedTimes()+1);
			
			qrDataRepository.save(qrData);
			
			return qrData;
		}
		
		throw new StanzaException("Invalid QrCode");
	}

	@Override
	public List<QRData> getQRDataByQrContextType(String userUuid, List<QRContextType> qrContextType, Pageable pagination) {		
		return qrDataRepository.findByCreatedByAndQrContextTypeIn(userUuid, qrContextType, pagination);
	}
	
	@Override
	public boolean isScanHistoryPresentForQrUuidAndUserId(String qrUuid, String userId) {
		QRScanHistory qrScanHistory = qrScanHistoryRepository.findByQrUUidAndUserId(qrUuid, userId);
		return qrScanHistory == null ? false : true;
	}
}

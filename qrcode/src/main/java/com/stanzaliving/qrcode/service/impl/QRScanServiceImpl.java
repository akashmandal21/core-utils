package com.stanzaliving.qrcode.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
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
	public QRData getQRData(String code,String userId, String residenceFoodMenuId) {
		
		log.info("Output after scan is {}",code);
		
		QRData qrData = qrDataRepository.findByData(code);
		
		validateWithResidenceFoodMenuId(residenceFoodMenuId, qrData);
		
		log.info("QRData after scan is {}",qrData);
		
		if(Objects.nonNull(qrData)) {
			
			qrData.setScannedTimes(qrData.getScannedTimes()+1);
			
			qrDataRepository.save(qrData);
			
			return qrData;
		}
		
		throw new StanzaException("Invalid QrCode");
	}

	private void validateWithResidenceFoodMenuId(String residenceFoodMenuId, QRData qrData) {
		
		if((qrData.getQrContextType() == QRContextType.FOODTABLE_VEG ||
		   qrData.getQrContextType() == QRContextType.FOODTABLE_NONVEG)
		   && StringUtils.isNotEmpty(residenceFoodMenuId)
		   && !residenceFoodMenuId.equals(qrData.getContextId())) {
			
			throw new StanzaException("Invalid QrCode");
		}
	}

	@Override
	public List<QRData> getQRDataByQrContextType(String userUuid, List<QRContextType> qrContextType, Pageable pagination) {		
		return qrDataRepository.findByQrContextTypeIn(qrContextType, pagination);
	}
	
	@Override
	public QRScanHistory getScanHistoryPresentForQrUuidAndUserId(String qrUuid, String userId) {
		QRScanHistory qrScanHistory = qrScanHistoryRepository.findByQrUUidAndUserId(qrUuid, userId);
		log.debug(" QR Scan History for qrUuid " + qrUuid + " UserId " + userId);
		return qrScanHistory;
	}
	
	@Override
	public QRScanHistory checkScanHistoryForVegAndNonVegFood(String contextId, String userId) {
		List<QRContextType> qrContextTypeList = Arrays.asList(QRContextType.FOODTABLE_VEG, QRContextType.FOODTABLE_NONVEG);
		
		/*
		 * User can scan either one food type, veg or non-veg
		 */
		QRScanHistory qrScanHistory = 
				qrScanHistoryRepository.findByContextIdAndQrContextTypeInAndUserId(contextId, qrContextTypeList, userId);
		
		log.info("Qr scan history for contextId " + contextId + " userId " + userId);
		log.info("Scan history " + qrScanHistory);
		
		return qrScanHistory;
	}
	
	@Override
	public QRScanHistory checkScanHistory(String contextId, String userId, QRContextType qrContextType) {
		
		QRScanHistory qrScanHistory = 
				qrScanHistoryRepository.findByContextIdAndQrContextTypeAndUserId(contextId, qrContextType, userId);
		
		log.info("Qr scan history for contextId " + contextId + " userId " + userId);
		log.info("Scan history " + qrScanHistory);
		
		return qrScanHistory;
	}
	
	@Override
	public void updateScanHistory(QRData qrData, String userId,boolean status) {
		
		if(Objects.nonNull(qrData)) {
			
			if(Objects.isNull(userId)) {
				userId = SecurityUtils.getCurrentUserId();
			}
			
			QRScanHistory qrScanHistory = null;
			
			if(qrData.getQrContextType() == QRContextType.FOODTABLE_VEG || 
			   qrData.getQrContextType() == QRContextType.FOODTABLE_NONVEG)
				qrScanHistory = checkScanHistoryForVegAndNonVegFood(qrData.getContextId(), userId);			
			else
				qrScanHistory = checkScanHistory(qrData.getContextId(), userId, qrData.getQrContextType());

			
			if(qrScanHistory == null) {
				log.debug("Saving scan history data for userId " + userId);
				qrScanHistoryRepository.saveAndFlush(
						QRScanHistory.builder().qrContextType(qrData.getQrContextType())
									.contextId(qrData.getContextId())
								    .qrUUid(qrData.getUuid()).userId(userId)
								    .status(status)
								    .build());
			}
			
		}
	}
	
	@Override
	public Map<String, QRScanHistory> getQRScannedData(List<String> qrUuids, String userId) {
		List<QRScanHistory> qrScanHistoryEntities =  
				qrScanHistoryRepository.findByQrUUidInAndUserId(qrUuids, userId);
		
		if(CollectionUtils.isEmpty(qrScanHistoryEntities)) {
			return new HashMap<>();
		}
		
		return qrScanHistoryEntities.stream().collect(Collectors.toMap(QRScanHistory::getQrUUid, Function.identity()));
	}
	
	@Override
	public Map<String, QRScanHistory> getQRScannedDataByQrUuids(List<String> qrUuids) {
		List<QRScanHistory> qrScanHistoryEntities =  
				qrScanHistoryRepository.findByQrUUidIn(qrUuids);
		
		if(CollectionUtils.isEmpty(qrScanHistoryEntities)) {
			return new HashMap<>();
		}
		
		return qrScanHistoryEntities.stream().collect(Collectors.toMap(QRScanHistory::getQrUUid, Function.identity()));
	}

	@Override
	public boolean removeScanHistoryByQrUuidAndUserId(String qrUuid, String userId) {
		QRScanHistory qrScanHistory =
					qrScanHistoryRepository.findByQrUUidAndUserId(qrUuid, userId);
		
		if(qrScanHistory == null) {
			return false;
		}
		
		qrScanHistoryRepository.delete(qrScanHistory);
		
		return true;
	}

	@Override
	public QRData getQRDataByUuid(String uuid) {
		QRData qrResult = qrDataRepository.findFirstByUuid(uuid);
		
		return qrResult;
	}
	
	@Override
	public List<QRScanHistory> getQrScanHistoryByQrContextTypeAndUserId(String userId, List<QRContextType> qrContextType, Pageable pagination) {		
		return qrScanHistoryRepository.findByQrContextTypeInAndUserId(qrContextType, userId, pagination);
	}

	@Override
	public List<QRData> getQRDataByUuidIn(List<String> uuids) {
		return qrDataRepository.findByUuidIn(uuids);
	}

}

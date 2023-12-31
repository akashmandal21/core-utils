package com.stanzaliving.qrcode.service.impl;

import java.util.Arrays;
import java.util.Collection;
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

import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.security.helper.SecurityUtils;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.entity.QRScanHistory;
import com.stanzaliving.qrcode.enums.FeaturePhoneQrValidation;
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
	public QRData getQRData(String code, String userId, String residenceFoodMenuId) {

		log.info("Output after scan is {}", code);

		QRData qrData = qrDataRepository.findByData(code);

		if (Objects.nonNull(qrData)) {

			log.info("QRData after scan is {}", qrData);
			validateWithResidenceFoodMenuId(residenceFoodMenuId, qrData);

			qrData.setScannedTimes(qrData.getScannedTimes() + 1);

			qrDataRepository.save(qrData);

		}

		return qrData;
	}

	private void validateWithResidenceFoodMenuId(String residenceFoodMenuId, QRData qrData) {

		if ((qrData.getQrContextType() == QRContextType.FOODTABLE_VEG ||
				qrData.getQrContextType() == QRContextType.FOODTABLE_NONVEG)
				&& StringUtils.isNotEmpty(residenceFoodMenuId)
				&& !residenceFoodMenuId.equals(qrData.getContextId())) {

			throw new ApiValidationException("This is not a valid Stanza QR code.");
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

		log.info("Qr scan history for contextId: {} and userId: {} is {}", contextId, userId, qrScanHistory);

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
	public void updateScanHistory(QRData qrData, String userId, boolean status) {

		if (Objects.nonNull(qrData)) {

			if (Objects.isNull(userId)) {
				userId = SecurityUtils.getCurrentUserId();
			}

			QRScanHistory qrScanHistory = null;

			if (qrData.getQrContextType() == QRContextType.FOODTABLE_VEG ||
					qrData.getQrContextType() == QRContextType.FOODTABLE_NONVEG) {

				qrScanHistory = checkScanHistoryForVegAndNonVegFood(qrData.getContextId(), userId);

			} else {

				qrScanHistory = checkScanHistory(qrData.getContextId(), userId, qrData.getQrContextType());
			}

			log.info("Saving scan history data for userId {} with status: {}", userId, status);

			if (qrScanHistory == null) {
				qrScanHistory =
						QRScanHistory.builder()
								.qrContextType(qrData.getQrContextType())
								.contextId(qrData.getContextId())
								.qrUUid(qrData.getUuid())
								.qrValidationType(FeaturePhoneQrValidation.SELF)
								.userId(userId)
								.status(status)
								.build();

				log.info("Adding QR Scan History: {}", qrScanHistory);

				qrScanHistory = qrScanHistoryRepository.saveAndFlush(qrScanHistory);

			} else {
				qrScanHistory.setQrUUid(qrData.getUuid());
				qrScanHistory.setStatus(status);
				qrScanHistory.setQrContextType(qrData.getQrContextType());
				log.info("Updating QR Scan History: {}", qrScanHistory);
				qrScanHistoryRepository.save(qrScanHistory);
			}

		}
	}

	@Override
	public QRScanHistory scanHistory(String contextId, String qrId, String userId, QRContextType qrContextType, boolean status, FeaturePhoneQrValidation validation, String imagePath) {

		QRScanHistory qrScanHistory = qrScanHistoryRepository.findByContextIdAndUserId(contextId, userId);

		if (Objects.isNull(qrScanHistory)) {

			qrScanHistory = QRScanHistory.builder()
					.contextId(contextId)
					.userId(userId)
					.build();
		}

		qrScanHistory.setQrUUid(qrId);
		qrScanHistory.setStatus(status);
		qrScanHistory.setQrContextType(qrContextType);
		qrScanHistory.setQrValidationType(validation);
		qrScanHistory.setValidatedImagePath(imagePath);

		return qrScanHistoryRepository.save(qrScanHistory);
	}

	@Override
	public Map<String, QRScanHistory> getQRScannedData(List<String> qrUuids, String userId) {
		List<QRScanHistory> qrScanHistoryEntities =
				qrScanHistoryRepository.findByQrUUidInAndUserId(qrUuids, userId);

		if (CollectionUtils.isEmpty(qrScanHistoryEntities)) {
			return new HashMap<>();
		}

		return qrScanHistoryEntities.stream().collect(Collectors.toMap(QRScanHistory::getQrUUid, Function.identity()));
	}

	@Override
	public Map<String, QRScanHistory> getQRScannedDataByQrUuids(List<String> qrUuids) {
		List<QRScanHistory> qrScanHistoryEntities =
				qrScanHistoryRepository.findByQrUUidIn(qrUuids);

		if (CollectionUtils.isEmpty(qrScanHistoryEntities)) {
			return new HashMap<>();
		}

		return qrScanHistoryEntities.stream().collect(Collectors.toMap(QRScanHistory::getQrUUid, Function.identity()));
	}

	@Override
	public boolean removeScanHistoryByQrUuidAndUserId(String qrUuid, String userId) {
		QRScanHistory qrScanHistory =
				qrScanHistoryRepository.findByQrUUidAndUserId(qrUuid, userId);

		if (qrScanHistory == null) {
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
		return qrScanHistoryRepository.findByQrContextTypeInAndUserIdAndStatus(qrContextType, userId, pagination, true);
	}

	@Override
	public List<QRData> getQRDataByUuidIn(List<String> uuids) {
		return qrDataRepository.findByUuidIn(uuids);
	}

	@Override
	public boolean existsByContextIdInAndQrContextTypeInAndUserIdAndStatus(Collection<String> contextIds, Collection<QRContextType> contextTypes, String userId, boolean status) {

		boolean scanHistoryExists =
				qrScanHistoryRepository.existsByContextIdInAndQrContextTypeInAndUserIdAndStatus(contextIds, contextTypes, userId, status);

		log.info("Qr scan history for contextIds: {} and userId: {} exists: {}", contextIds, userId, scanHistoryExists);

		return scanHistoryExists;
	}

	@Override
	public List<QRScanHistory> findByContextIdInAndQrContextTypeInAndUserIdAndStatus(Collection<String> contextIds, Collection<QRContextType> contextTypes, String userId, boolean status) {
		List<QRScanHistory> scanHistories =
				qrScanHistoryRepository.findByContextIdInAndQrContextTypeInAndUserIdAndStatus(contextIds, contextTypes, userId, status);

		log.info("Qr scan history for contextIds: {} and userId: {} are: {}", contextIds, userId, scanHistories);

		return scanHistories;
	}


}
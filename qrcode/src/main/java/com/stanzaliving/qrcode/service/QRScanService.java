package com.stanzaliving.qrcode.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.stanzaliving.qrcode.enums.FeaturePhoneQrValidation;
import org.springframework.data.domain.Pageable;

import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.entity.QRScanHistory;
import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRScanService {

	QRData getQRData(String code, String userId, String residenceFoodMenuId);

	List<QRData> getQRDataByQrContextType(String userUuid, List<QRContextType> qrContextType, Pageable pagination);

	QRScanHistory getScanHistoryPresentForQrUuidAndUserId(String qrUuid, String userId);

	void updateScanHistory(QRData qrData, String userId, boolean status);

	QRScanHistory scanHistory(String contextId, String qrId, String userId, QRContextType qrContextType, boolean status, FeaturePhoneQrValidation validation, String imagePath);

	Map<String, QRScanHistory> getQRScannedData(List<String> qrUuids, String userId);

	Map<String, QRScanHistory> getQRScannedDataByQrUuids(List<String> qrUuids);
	
	boolean removeScanHistoryByQrUuidAndUserId(String qrUuid, String userId);
	
	QRData getQRDataByUuid(String uuid);
	
	List<QRData> getQRDataByUuidIn(List<String> uuids);

	QRScanHistory checkScanHistoryForVegAndNonVegFood(String contextId, String userId);

	QRScanHistory checkScanHistory(String contextId, String userId, QRContextType qrContextType);

	List<QRScanHistory> getQrScanHistoryByQrContextTypeAndUserId(String userId, List<QRContextType> qrContextType,
			Pageable pagination);

	boolean existsByContextIdInAndQrContextTypeInAndUserIdAndStatus(Collection<String> contextIds, Collection<QRContextType> contextTypes, String userId, boolean status);

	List<QRScanHistory> findByContextIdInAndQrContextTypeInAndUserIdAndStatus(Collection<String> contextIds, Collection<QRContextType> contextTypes, String userId, boolean status);

}

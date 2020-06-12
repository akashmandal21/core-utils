package com.stanzaliving.qrcode.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.entity.QRScanHistory;
import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRScanService {

	QRData getQRData(String code, String userId);

	List<QRData> getQRDataByQrContextType(String userUuid, List<QRContextType> qrContextType, Pageable pagination);

	QRScanHistory getScanHistoryPresentForQrUuidAndUserId(String qrUuid, String userId);

	void updateScanHistory(QRData qrData, String userId);

	Map<String, QRScanHistory> getQRScannedData(List<String> qrUuids, String userId);

	Map<String, QRScanHistory> getQRScannedDataByQrUuids(List<String> qrUuids);
}

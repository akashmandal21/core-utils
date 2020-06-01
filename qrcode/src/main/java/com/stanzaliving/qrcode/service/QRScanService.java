package com.stanzaliving.qrcode.service;

import java.util.List;

import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRScanService {

	QRData getQRData(String code, String userId);

	List<QRData> getQRDataByQrContextType(List<QRContextType> qrContextType, int page, int limit);
}

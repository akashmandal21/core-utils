package com.stanzaliving.qrcode.service;

import com.stanzaliving.qrcode.entity.QRData;

public interface QRScanService {

	QRData getQRData(String code, String userId);
}

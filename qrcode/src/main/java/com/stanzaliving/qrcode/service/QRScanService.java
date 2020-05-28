package com.stanzaliving.qrcode.service;

import java.awt.image.BufferedImage;

import com.stanzaliving.qrcode.entity.QRData;

public interface QRScanService {

	QRData getQRData(String code);
}

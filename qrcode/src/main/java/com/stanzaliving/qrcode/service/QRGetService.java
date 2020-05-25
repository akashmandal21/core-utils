package com.stanzaliving.qrcode.service;

import java.awt.image.BufferedImage;

import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRGetService {

	BufferedImage getQRCode(String contextId, String subContextId, QRContextType qrContextType);
}

package com.stanzaliving.qrcode.service;

import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRGetService {

	String getQRCode(String contextId, String subContextId, QRContextType qrContextType, String data);
}

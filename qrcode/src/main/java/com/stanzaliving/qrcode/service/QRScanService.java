package com.stanzaliving.qrcode.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRScanService {

	QRData getQRData(String code, String userId);

	List<QRData> getQRDataByQrContextType(String userUuid, List<QRContextType> qrContextType, Pageable pagination);
}

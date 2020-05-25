package com.stanzaliving.qrcode.repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qrcode.entity.QRData;

public interface QRDataRepository extends AbstractJpaRepository<QRData, Long> {

	QRData findByData(String data);
}

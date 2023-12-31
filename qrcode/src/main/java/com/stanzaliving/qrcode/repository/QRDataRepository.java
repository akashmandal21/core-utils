package com.stanzaliving.qrcode.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qrcode.entity.QRData;
import com.stanzaliving.qrcode.enums.QRContextType;

public interface QRDataRepository extends AbstractJpaRepository<QRData, Long> {

	QRData findByData(String data);
	
	List<QRData> findByCreatedByAndQrContextTypeIn(String userUuid, List<QRContextType> contextType, Pageable page);

	QRData findByContextIdAndSubContextIdAndQrContextType
			(String contextId, String subContextId, QRContextType qrContextType);

	List<QRData> findByQrContextTypeIn( List<QRContextType> contextType, Pageable page);

}

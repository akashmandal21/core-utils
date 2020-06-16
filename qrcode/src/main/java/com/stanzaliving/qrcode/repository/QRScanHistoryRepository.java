/**
 * 
 */
package com.stanzaliving.qrcode.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qrcode.entity.QRScanHistory;
import com.stanzaliving.qrcode.enums.QRContextType;

@Repository
public interface QRScanHistoryRepository extends AbstractJpaRepository<QRScanHistory, Long> {

	QRScanHistory findByQrUUidAndUserId(String qrUuid, String userId);
	
	List<QRScanHistory> findByQrUUidInAndUserId(List<String> qrUuids, String userId);
	
	QRScanHistory findByQrUUid(String qrUuid);
	
	List<QRScanHistory> findByQrUUidIn(List<String> qrUuids);
	
	QRScanHistory findByContextIdAndQrContextTypeInAndUserId(String contextId, List<QRContextType> contextType, String userId);

	QRScanHistory findByContextIdAndQrContextTypeAndUserId(String contextId, QRContextType contextType, String userId);

	List<QRScanHistory> findByQrContextTypeInAndUserId(List<QRContextType> qrContextTypes, String userId, Pageable pagination);
}

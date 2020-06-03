/**
 * 
 */
package com.stanzaliving.qrcode.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qrcode.entity.QRScanHistory;

@Repository
public interface QRScanHistoryRepository extends AbstractJpaRepository<QRScanHistory, Long> {

	QRScanHistory findByQrUUidAndUserId(String qrUuid, String userId);
	
	List<QRScanHistory> findByQrUUidInAndUserId(List<String> qrUuids, String userId);
	
	QRScanHistory findByQrUUid(String qrUuid);
}

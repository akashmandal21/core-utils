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

	List<QRScanHistory> findByQrUUidAndUserId(String qrUuid, String userId);
}

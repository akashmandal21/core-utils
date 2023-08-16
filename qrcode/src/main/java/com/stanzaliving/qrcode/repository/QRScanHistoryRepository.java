/**
 * 
 */
package com.stanzaliving.qrcode.repository;

import java.util.Collection;
import java.util.Date;
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

	List<QRScanHistory> findByContextIdInAndQrContextTypeInAndStatus(Collection<String> contextId, List<QRContextType> contextType, boolean status);

	List<QRScanHistory> findByQrContextTypeInAndUserIdAndStatus(List<QRContextType> qrContextTypes, String userId, Pageable pagination,boolean status);

	List<QRScanHistory> findByQrContextTypeInAndStatus(Collection<QRContextType> qrContextType, boolean status);

	boolean existsByContextIdInAndQrContextTypeInAndUserIdAndStatus(Collection<String> contextIds, Collection<QRContextType> contextTypes, String userId, boolean status);

	List<QRScanHistory> findByContextIdInAndQrContextTypeInAndUserIdAndStatus(Collection<String> contextIds, Collection<QRContextType> contextTypes, String userId, boolean status);

	QRScanHistory findByContextIdAndUserId(String contextId, String userId);

	List<QRScanHistory> findByUserIdInAndStatus(List<String> userIds, boolean status);

	List<QRScanHistory> findByUpdatedAtBetweenAndStatus(Date startDate, Date endDate, boolean status);

	List<QRScanHistory> findAllByContextIdIn(List<String> rfmUuids);
}

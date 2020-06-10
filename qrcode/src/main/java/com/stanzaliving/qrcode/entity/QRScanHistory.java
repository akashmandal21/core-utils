package com.stanzaliving.qrcode.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "qr_scan_history")
@Entity(name = "qr_scan_history")
@Getter
@Setter
@SuperBuilder
public class QRScanHistory extends AbstractJpaEntity {

    private static final long serialVersionUID = -7605609816131249236L;

	@Column(name = "qr_uuid", columnDefinition = "char(40)", nullable = false)
    private String qrUUid;

	@Column(name = "user_id", columnDefinition = "char(40)")
	private String userId;
	
}
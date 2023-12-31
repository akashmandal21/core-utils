package com.stanzaliving.qrcode.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.qrcode.enums.FeaturePhoneQrValidation;
import com.stanzaliving.qrcode.enums.QRContextType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "qr_scan_history")
@Entity(name = "qr_scan_history")
public class QRScanHistory extends AbstractJpaEntity {

	private static final long serialVersionUID = -7605609816131249236L;

	@Column(name = "qr_uuid", columnDefinition = "char(40)", nullable = false)
	private String qrUUid;

	@Column(name = "user_id", columnDefinition = "char(40)")
	private String userId;

	@Column(name = "context_id", columnDefinition = "char(40)", nullable = false)
	private String contextId;

	@Column(name = "qr_context_type")
	@Enumerated(EnumType.STRING)
	private QRContextType qrContextType;

	@Column(name = "validation_type", columnDefinition = "varchar(100) DEFAULT 'SELF'")
	@Enumerated(EnumType.STRING)
	private FeaturePhoneQrValidation qrValidationType;

	@Column(name = "validated_image_path", columnDefinition = "varchar(1000)")
	private String validatedImagePath;
}
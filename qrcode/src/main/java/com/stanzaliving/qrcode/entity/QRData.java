package com.stanzaliving.qrcode.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.qrcode.enums.QRContextType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "qrdata")
@Entity(name = "qrdata")
@Getter
@Setter
@SuperBuilder
public class QRData extends AbstractJpaEntity {

    private static final long serialVersionUID = -7605609816131249236L;

	@Column(name = "context_id", columnDefinition = "char(40)", nullable = false)
    private String contextId;

	@Column(name = "sub_context_id", columnDefinition = "char(40)")
	private String subContextId;
	
	@Column(name="qr_context_type")
	@Enumerated(EnumType.STRING)
	private QRContextType qrContextType;
	
	@Column(name="data",columnDefinition = "text")
	private String data;
	
    @Column(name = "scanned_times", columnDefinition = "INT(10)")
    private int scannedTimes;
    
    @Column(name = "content",columnDefinition = "text")
    private String content;
    
	@Column(name = "bucket", columnDefinition = "varchar(50) NOT NULL")
	private String bucket;

	@Column(name = "file_path", columnDefinition = "varchar(255) NOT NULL")
	private String filePath;

	@Column(name = "file_name", columnDefinition = "varchar(255) NOT NULL")
	private String fileName;

}
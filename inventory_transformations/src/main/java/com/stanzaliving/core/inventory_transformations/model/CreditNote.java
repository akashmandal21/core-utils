package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CREDIT_NOTE")
@Data
public class CreditNote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "ISSUE_DATE")
	private Date issueDATE;

	@Column(name = "CREDIT_NOTE_ID")
	private String creditNoteID;

	@Column(name = "COMMENT")
	private String comment;

	@Column(name = "PURPOSE_ID")
	private Integer purposeID;

	@Column(name = "AMOUNT")
	private Double amount;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "STUDENT")
	private Student student;

	@Column(name = "EXECUTION_DATE")
	private Date executionDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "STANZA_INVOICE_ID")
	private String stanzaInvoiceId;

	@Column(name = "IMPACT_TYPE", nullable = false)
	private Integer impactType;

	@Column(name = "VENDOR")
	private String vendor;

	@Column(name = "CREATED")
	private Date created;
	
	@Column(name = "REMARK")
	private String remark;
	
	@Override
	public boolean equals(Object obj) {
		CreditNote cn = (CreditNote) obj;
		if(StringUtils.isEmpty(cn.getStanzaInvoiceId())) {
			return false;
		}
		return cn.getStanzaInvoiceId().equals(this.getStanzaInvoiceId());
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}

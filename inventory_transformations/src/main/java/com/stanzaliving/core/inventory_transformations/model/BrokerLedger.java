package com.stanzaliving.core.inventory_transformations.model;

import java.util.Date;

@Entity
@Table(name = "BROKER_LEDGER")
public class BrokerLedger {


	@Id
	@GeneratedValue
	@Column(name = "LEDGER_ID")
	private int ledgerId;

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "BROKER_ID")
	private Broker broker;

	@Column(name = "PAYOUT_TYPE")
	private BrokerPreferredPaymentMode brokerPreferredPaymentMode;

	@Column(name = "BROKER_LEAD_TRANSACTION_ID")
	private int brokerLeadTransactionId;

	@Column(name = "DEBIT")
	private double debit;

	@Column(name = "CREDIT")
	private double credit;

	@Column(name = "BALANCE")
	private double balance;

	@Column(name = "PAYOUT_DATE")
	private Date payOutDate = null;

	@Column(name = "CREATED")
	private Date created = new Date();

	public int getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public BrokerPreferredPaymentMode getBrokerPreferredPaymentMode() {
		return brokerPreferredPaymentMode;
	}

	public void setBrokerPreferredPaymentMode(BrokerPreferredPaymentMode brokerPreferredPaymentMode) {
		this.brokerPreferredPaymentMode = brokerPreferredPaymentMode;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public int getBrokerLeadTransactionId() {
		return brokerLeadTransactionId;
	}

	public void setBrokerLeadTransactionId(int brokerLeadTransactionId) {
		this.brokerLeadTransactionId = brokerLeadTransactionId;
	}

	public Date getPayOutDate() {
		return payOutDate;
	}

	public void setPayOutDate(Date payOutDate) {
		this.payOutDate = payOutDate;
	}
}

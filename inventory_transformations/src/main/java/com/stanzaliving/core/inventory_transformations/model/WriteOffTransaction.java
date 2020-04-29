package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "WRITE_OFF_TRANSACTION")
public class WriteOffTransaction {
	
		@Id
		@GeneratedValue
		@Column(name = "ID")
		private int id;

		@Column(name = "TRANSACTION_ID", nullable = false)
		private Integer transactionId;

		@Column(name = "WRITE_OFF_REASON", nullable = true)
		private String writeOffReason;

		@Column(name = "STUDENT_ID")
		private String studentId;

		@Column(name="CREATED_BY")
		private String createdBy;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Integer getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(Integer transactionId) {
			this.transactionId = transactionId;
		}

		public String getWriteOffReason() {
			return writeOffReason;
		}

		public void setWriteOffReason(String writeOffReason) {
			this.writeOffReason = writeOffReason;
		}

		public String getStudentId() {
			return studentId;
		}

		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		
}

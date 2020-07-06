//package com.stanzaliving.core.inventory_transformations.entity;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.io.Serializable;
//import java.sql.Timestamp;
//
//@Data
////@Entity
//@Table(name = "STUDENT_CONTACT_AUDIT")
//public class StudentContactAuditEntity implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Column(name = "STUDENT_ID", nullable = false)
//	@JsonProperty("STUDENT_ID")
//    private String studentId = "";
//
//    @Column(name = "TEMPORARY_STUDENTID", nullable = false)
//	@JsonProperty("TEMPORARY_STUDENTID")
//    private String temporaryStudentid;
//
//    @Column(name = "OLD_EMAILID", nullable = false)
//	@JsonProperty("OLD_EMAILID")
//    private String oldEmailid = "";
//
//    @Column(name = "OLD_PHONE", nullable = false)
//	@JsonProperty("OLD_PHONE")
//    private String oldPhone = "";
//
//    @Column(name = "CREATED", nullable = false)
//	@JsonProperty("CREATED")
//    private Timestamp CREATED;
//
//    @Column(name = "UPDATED", nullable = false)
//	@JsonProperty("UPDATED")
//    private Timestamp UPDATED;
//
//
//}
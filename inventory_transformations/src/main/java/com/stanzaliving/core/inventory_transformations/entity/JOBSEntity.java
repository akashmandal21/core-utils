//package com.stanzaliving.core.inventory_transformations.entity;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.sql.Timestamp;
//
//@Data
//@Entity
//@Table(name = "JOBS")
//public class JobsEntity implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "JOB_ID", insertable = false, nullable = false)
//	@JsonProperty("JOB_ID")
//    private Integer jobId;
//
//    @Column(name = "START", columnDefinition = "Timestamp")
//	@JsonProperty("START")
//    private Timestamp START;
//
//    @Column(name = "END", columnDefinition = "Timestamp")
//	@JsonProperty("END")
//    private Timestamp END;
//
//    @Column(name = "STATUS")
//	@JsonProperty("STATUS")
//    private String STATUS;
//
//    @Column(name = "JOB_TYPE", nullable = false)
//	@JsonProperty("JOB_TYPE")
//    private Integer jobType;
//
//
//}
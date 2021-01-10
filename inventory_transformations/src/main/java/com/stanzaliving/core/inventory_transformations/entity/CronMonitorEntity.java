package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "CRON_MONITOR")
@Data
public class CronMonitorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer id;

    @Column(name = "JOB_ID")
	@JsonProperty("JOB_ID")
    private String jobId;

    @Column(name = "JOB_NAME")
	@JsonProperty("JOB_NAME")
    private String jobName;

    @Column(name = "START_TIME")
	@JsonProperty("START_TIME")
    private Timestamp startTime;

    @Column(name = "GRACE_PERIOD")
	@JsonProperty("GRACE_PERIOD")
    private Timestamp gracePeriod;

    @Column(name = "SUCCESS")
	@JsonProperty("SUCCESS")
    private Boolean SUCCESS;

    @Column(name = "NOTIFICATION_SENT")
	@JsonProperty("NOTIFICATION_SENT")
    private Boolean notificationSent;

    @Column(name = "NOTIFICATION_DETAILS")
	@JsonProperty("NOTIFICATION_DETAILS")
    private String notificationDetails;

    @Column(name = "WEBHOOK_URL")
	@JsonProperty("WEBHOOK_URL")
    private String webhookUrl;

    @Column(name = "RUN_TIME")
	@JsonProperty("RUN_TIME")
    private Timestamp runTime;

    @Column(name = "COMPLETION_TIME")
	@JsonProperty("COMPLETION_TIME")
    private Timestamp completionTime;

    
}
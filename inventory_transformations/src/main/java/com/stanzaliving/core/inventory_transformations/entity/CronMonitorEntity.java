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
	@JsonProperty("id")
    private Integer id;

    @Column(name = "JOB_ID")
	@JsonProperty("job_id")
    private String jobId;

    @Column(name = "JOB_NAME")
	@JsonProperty("job_name")
    private String jobName;

    @Column(name = "START_TIME")
	@JsonProperty("start_time")
    private Timestamp startTime;

    @Column(name = "GRACE_PERIOD")
	@JsonProperty("grace_period")
    private Timestamp gracePeriod;

    @Column(name = "SUCCESS")
	@JsonProperty("success")
    private Boolean SUCCESS;

    @Column(name = "NOTIFICATION_SENT")
	@JsonProperty("notification_sent")
    private Boolean notificationSent;

    @Column(name = "NOTIFICATION_DETAILS")
	@JsonProperty("notification_details")
    private String notificationDetails;

    @Column(name = "WEBHOOK_URL")
	@JsonProperty("webhook_url")
    private String webhookUrl;

    @Column(name = "RUN_TIME")
	@JsonProperty("run_time")
    private Timestamp runTime;

    @Column(name = "COMPLETION_TIME")
	@JsonProperty("completion_time")
    private Timestamp completionTime;

    
}
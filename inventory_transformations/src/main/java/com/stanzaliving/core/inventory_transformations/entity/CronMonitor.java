package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "CRON_MONITOR")
@Entity
public class CronMonitor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "START_TIME")
    private LocalDateTime startTime;

    @Column(name = "GRACE_PERIOD")
    private LocalDateTime gracePeriod;

    @Column(name = "SUCCESS")
    private Integer SUCCESS;

    @Column(name = "NOTIFICATION_SENT")
    private Integer notificationSent;

    @Column(name = "NOTIFICATION_DETAILS")
    private String notificationDetails;

    @Column(name = "WEBHOOK_URL")
    private String webhookUrl;

    @Column(name = "RUN_TIME")
    private LocalDateTime runTime;

    @Column(name = "COMPLETION_TIME")
    private LocalDateTime completionTime;

    
}
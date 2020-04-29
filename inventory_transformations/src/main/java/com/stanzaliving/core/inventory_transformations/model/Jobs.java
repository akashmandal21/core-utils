package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name ="JOBS")
public class Jobs{
	
	@Id
	@GeneratedValue
	@Column(name ="JOB_ID")
	private int Job_id;
	
	@Column(name="START")
	private Calendar Start;
	
	@Column(name ="END")
	private Calendar End;
	
	@Column(name="STATUS")
	private String Status;
	
	@Column(name="JOB_TYPE")
	private int JobType;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "JOB_TYPE")
//    private JobsType jobsType;
	
	public int getJobType() {
		return JobType;
	}

	public void setJobType(int jobType) {
		this.JobType = jobType;
	}

//	public JobsType getJobsType() {
//		return jobsType;
//	}
//
//	public void setJobsType(JobsType jobsType) {
//		this.jobsType = jobsType;
//	}

	public int getJob_id() {
		return Job_id;
	}

	public void setJob_id(int job_id) {
		this.Job_id = job_id;
	}

	public Calendar getStart() {
		return Start;
	}

	public void setStart(Calendar start) {
		this.Start = start;
	}

	public Calendar getEnd() {
		return End;
	}

	public void setEnd(Calendar end) {
		this.End = end;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}
	
}
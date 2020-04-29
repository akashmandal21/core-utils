package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="JOBS_TYPE")

public class JobsType{
	
	@Id
//	@GeneratedValue
	@Column(name ="JOB_TYPE")
	public int JobType;
	
	
	@Column(name ="JOB_NAME")
	public String JobName;


	public int getJobType() {
		return JobType;
	}


	public void setJobType(int jobType) {
		this.JobType = jobType;
	}


	public String getJobName() {
		return JobName;
	}


	public void setJobName(String jobName) {
		this.JobName = jobName;
	}

	
	
}
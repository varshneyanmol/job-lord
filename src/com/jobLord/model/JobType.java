package com.jobLord.model;

import java.util.Set;

public class JobType {
	private int id;
	private String jobTypeLabel;

	private Set<JobPost> jobPosts;

	public JobType() {

	}

	public JobType(String jobTypeLabel) {
		this.jobTypeLabel = jobTypeLabel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTypeLabel() {
		return jobTypeLabel;
	}

	public void setJobTypeLabel(String jobTypeLabel) {
		this.jobTypeLabel = jobTypeLabel;
	}

	public Set<JobPost> getJobPosts() {
		return jobPosts;
	}

	public void setJobPosts(Set<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

}

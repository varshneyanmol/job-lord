package com.jobLord.model;

import java.util.Date;

public class JobApply {
	private JobApplyCompositeID id = new JobApplyCompositeID();
	private Date applyDate;

	public JobApply() {

	}

	public JobApply(SeekerProfile seekerProfile, JobPost jobPost, Date applyDate) {
		this.applyDate = applyDate;
		this.id.setIdSeekerProfile(seekerProfile.getId());
		this.id.setIdJobPost(jobPost.getId());
	}

	public JobApplyCompositeID getId() {
		return id;
	}

	public void setId(JobApplyCompositeID id) {
		this.id = id;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

}

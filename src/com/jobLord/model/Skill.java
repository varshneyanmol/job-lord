package com.jobLord.model;

import java.util.Set;

public class Skill {
	private int id;
	private String label;

	private Set<SeekerProfile> seekers;
	private Set<JobPost> jobPosts;

	public Skill() {
	}

	public Skill(String label) {
		this.label = label;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Set<SeekerProfile> getSeekers() {
		return seekers;
	}

	public void setSeekers(Set<SeekerProfile> seekers) {
		this.seekers = seekers;
	}

	public Set<JobPost> getJobPosts() {
		return jobPosts;
	}

	public void setJobPosts(Set<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

}

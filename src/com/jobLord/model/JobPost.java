package com.jobLord.model;

import java.util.Date;
import java.util.Set;

public class JobPost {
	private int id;
	private Date createdDate;
	private long salary;
	private long salaryRangeStart;
	private long salaryRangeEnd;
	private String description;
	private boolean open;

	private Set<Skill> skills;
	private JobType jobType;

	public JobPost() {

	}

	public JobPost(Date createdDate, long salary, long salaryRangeStart, long salaryRangeEnd, String description,
			boolean open) {
		this.createdDate = createdDate;
		this.salary = salary;
		this.salaryRangeStart = salaryRangeStart;
		this.salaryRangeEnd = salaryRangeEnd;
		this.description = description;
		this.open = open;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getSalaryRangeStart() {
		return salaryRangeStart;
	}

	public void setSalaryRangeStart(long salaryRangeStart) {
		this.salaryRangeStart = salaryRangeStart;
	}

	public long getSalaryRangeEnd() {
		return salaryRangeEnd;
	}

	public void setSalaryRangeEnd(long salaryRangeEnd) {
		this.salaryRangeEnd = salaryRangeEnd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

}

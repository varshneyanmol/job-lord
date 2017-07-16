package com.jobLord.model;

import java.util.Date;

public class SeekerEducation {
	private SeekerEducationCompositeID id = new SeekerEducationCompositeID();
	private String university;
	private Date startDate;
	private Date endDate;
	private double percentage;
	private double cgpa;

	private SeekerProfile seekerProfile;
	private Degree degree;

	public SeekerEducation() {

	}

	public SeekerEducation(SeekerProfile seekerProfile, Degree degree, String university, Date startDate, Date endDate,
			double percentage, double cgpa) {
		this.seekerProfile = seekerProfile;
		this.degree = degree;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.percentage = percentage;
		this.cgpa = cgpa;

		System.out.println("SEEKER PROFILE ID: " + seekerProfile.getId());
		this.id.setIdSeekerProfile(seekerProfile.getId());
		this.id.setIdDegree(degree.getId());
	}

	public SeekerEducationCompositeID getId() {
		return id;
	}

	public void setId(SeekerEducationCompositeID id) {
		this.id = id;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public SeekerProfile getSeekerProfile() {
		return seekerProfile;
	}

	public void setSeekerProfile(SeekerProfile seekerProfile) {
		this.seekerProfile = seekerProfile;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

}

package com.jobLord.model;

import java.util.Date;

public class SeekerExperience {

	private SeekerExperienceCompositeID id = new SeekerExperienceCompositeID();

	private Date endDate;
	private String designation;
	private String companyName;
	private String city;
	private String state;
	private String country;
	private String description;
	private boolean isCurrentlyEmployed;

	public SeekerExperience() {
	}

	public SeekerExperience(SeekerProfile seekerProfile, Date startDate, Date endDate, String designation,
			String companyName, String city, String state, String country, String description,
			boolean isCurrentlyEmployed) {
		this.endDate = endDate;
		this.designation = designation;
		this.companyName = companyName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.description = description;
		this.isCurrentlyEmployed = isCurrentlyEmployed;

		this.id.setIdSeekerProfile(seekerProfile.getId());
		this.id.setStartDate(startDate);

	}

	public SeekerExperienceCompositeID getId() {
		return id;
	}

	public void setId(SeekerExperienceCompositeID id) {
		this.id = id;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getIsCurrentlyEmployed() {
		return isCurrentlyEmployed;
	}

	public void setIsCurrentlyEmployed(boolean isCurrentlyEmployed) {
		this.isCurrentlyEmployed = isCurrentlyEmployed;
	}

}

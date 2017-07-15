package com.jobLord.model;

import java.util.Date;
import java.util.Set;

public class SeekerProfile {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private Date DOB;
	private char gender;

	// private List<SeekerExperience> seekerExperiences;

	private Set<Skill> skills;
	private Set<SeekerEducation> seekerEducations;

	public SeekerProfile() {

	}

	public SeekerProfile(String firstName, String lastName, String email, String mobile, Date dOB, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.DOB = dOB;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	/*
	 * public List<SeekerExperience> getSeekerExperiences() { return
	 * seekerExperiences; }
	 * 
	 * public void setSeekerExperiences(List<SeekerExperience>
	 * seekerExperiences) { this.seekerExperiences = seekerExperiences; }
	 */

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

	public Set<SeekerEducation> getSeekerEducations() {
		return seekerEducations;
	}

	public void setSeekerEducations(Set<SeekerEducation> seekerEducations) {
		this.seekerEducations = seekerEducations;
	}

}

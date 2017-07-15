package com.jobLord.model;

import java.util.Set;

public class Degree {
	private int id;
	private String degreeLabel;

	private Set<SeekerEducation> seekerEducations;

	public Degree() {

	}

	public Degree(String degreeLabel) {
		this.degreeLabel = degreeLabel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegreeLabel() {
		return degreeLabel;
	}

	public void setDegreeLabel(String degreeLabel) {
		this.degreeLabel = degreeLabel;
	}

	public Set<SeekerEducation> getSeekerEducations() {
		return seekerEducations;
	}

	public void setSeekerEducations(Set<SeekerEducation> seekerEducations) {
		this.seekerEducations = seekerEducations;
	}

}

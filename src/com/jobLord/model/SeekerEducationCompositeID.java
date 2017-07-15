package com.jobLord.model;

import java.io.Serializable;

public class SeekerEducationCompositeID implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idSeekerProfile;
	private Integer idDegree;

	public SeekerEducationCompositeID() {

	}

	public SeekerEducationCompositeID(Integer idSeekerProfile, Integer idDegree) {
		this.idSeekerProfile = idSeekerProfile;
		this.idDegree = idDegree;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o != null && o instanceof SeekerEducationCompositeID) {
			System.out.println("INSIDE EQUALS");
			SeekerEducationCompositeID id = (SeekerEducationCompositeID) o;
			result = this.idSeekerProfile.equals(id.idSeekerProfile) && this.idDegree.equals(id.idDegree);
		}
		return result;
	}

	@Override
	public int hashCode() {
		System.out.println("INSIDE HASHCODE");
		return idSeekerProfile.hashCode() + idDegree.hashCode();
	}

	public Integer getIdSeekerProfile() {
		return idSeekerProfile;
	}

	public Integer getIdDegree() {
		return idDegree;
	}

	public void setIdSeekerProfile(Integer idSeekerProfile) {
		this.idSeekerProfile = idSeekerProfile;
	}

	public void setIdDegree(Integer idDegree) {
		this.idDegree = idDegree;
	}

}

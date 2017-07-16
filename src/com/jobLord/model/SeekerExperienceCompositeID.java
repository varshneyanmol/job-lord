package com.jobLord.model;

import java.io.Serializable;
import java.util.Date;

public class SeekerExperienceCompositeID implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idSeekerProfile;
	private Date startDate;

	public SeekerExperienceCompositeID() {

	}

	public SeekerExperienceCompositeID(Integer idSeekerProfile, Date startDate) {
		this.idSeekerProfile = idSeekerProfile;
		this.startDate = startDate;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o != null && o instanceof SeekerExperienceCompositeID) {
			SeekerExperienceCompositeID id = (SeekerExperienceCompositeID) o;
			result = this.idSeekerProfile.equals(id.idSeekerProfile) && this.startDate.equals(id.startDate);
		}

		return result;
	}

	@Override
	public int hashCode() {
		return idSeekerProfile.hashCode() + startDate.hashCode();
	}

	public Integer getIdSeekerProfile() {
		return idSeekerProfile;
	}

	public void setIdSeekerProfile(Integer idSeekerProfile) {
		this.idSeekerProfile = idSeekerProfile;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}

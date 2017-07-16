package com.jobLord.model;

import java.io.Serializable;

public class JobApplyCompositeID implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idSeekerProfile;
	private Integer idJobPost;
	
	public JobApplyCompositeID() {
		
	}

	public JobApplyCompositeID(Integer idSeekerProfile, Integer idJobPost) {
		super();
		this.idSeekerProfile = idSeekerProfile;
		this.idJobPost = idJobPost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idJobPost == null) ? 0 : idJobPost.hashCode());
		result = prime * result + ((idSeekerProfile == null) ? 0 : idSeekerProfile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobApplyCompositeID other = (JobApplyCompositeID) obj;
		if (idJobPost == null) {
			if (other.idJobPost != null)
				return false;
		} else if (!idJobPost.equals(other.idJobPost))
			return false;
		if (idSeekerProfile == null) {
			if (other.idSeekerProfile != null)
				return false;
		} else if (!idSeekerProfile.equals(other.idSeekerProfile))
			return false;
		return true;
	}

	public Integer getIdSeekerProfile() {
		return idSeekerProfile;
	}

	public void setIdSeekerProfile(Integer idSeekerProfile) {
		this.idSeekerProfile = idSeekerProfile;
	}

	public Integer getIdJobPost() {
		return idJobPost;
	}

	public void setIdJobPost(Integer idJobPost) {
		this.idJobPost = idJobPost;
	}
	
}
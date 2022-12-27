package com.sevensevengsi.model;

import javax.persistence.Entity;

@Entity
public class Admin extends Users {
	
	private String fullName;
	
	private Boolean isEnabled;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	
}

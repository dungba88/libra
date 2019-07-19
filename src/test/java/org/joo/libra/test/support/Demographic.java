package org.joo.libra.test.support;

public class Demographic {

	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isFemale() {
	    return "female".equals(gender);
	}
}
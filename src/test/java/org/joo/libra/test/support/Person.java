package org.joo.libra.test.support;

public class Person {
	
	private String name;
	
	private int age;
	
	private Demographic demographic;
	
	private String[] jobs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Demographic getDemographic() {
		return demographic;
	}

	public void setDemographic(Demographic demographic) {
		this.demographic = demographic;
	}

	public String[] getJobs() {
		return jobs;
	}

	public void setJobs(String[] jobs) {
		this.jobs = jobs;
	}
}
package org.joo.libra.test.support;

import java.util.List;

public class Person {

    private String name;

    private int age;
    
    private int salary = 0;

    private Demographic demographic;

    private String[] jobs;

    private List<String> jobList;
    
    private boolean female;
    
    private String data;

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

    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
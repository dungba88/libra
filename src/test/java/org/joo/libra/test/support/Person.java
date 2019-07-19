package org.joo.libra.test.support;

import java.util.ArrayList;
import java.util.List;

import org.joo.libra.support.annotations.Itemtype;

import lombok.Data;

@Data
public class Person {

	private String name;

	private long age;

	private int salary = 0;

	private Demographic demographic;

	private String[] jobs;

	private String[] noJobs = new String[0];
	
	private List<JobWithSalary> jobWithSalaries = new ArrayList<>();

	private JobWithSalary[] jobWithSalariesArr = new JobWithSalary[0];

	private List<String> jobList;

	private List<String> noJobList = new ArrayList<>();

	private boolean female;

	private String data;
	
	@Itemtype(String.class)
	public List<String> getJobList() {
	    return jobList;
	}

    @Itemtype(JobWithSalary.class)
    public List<JobWithSalary> getJobWithSalaries() {
        return jobWithSalaries;
    }
}
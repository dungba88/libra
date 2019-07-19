package org.joo.libra.test.support;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Person {

	public String name;

	public long age;

	public int salary = 0;

	public Demographic demographic;

	public String[] jobs;

	public String[] noJobs = new String[0];
	
	public List<JobWithSalary> jobWithSalaries = new ArrayList<>();

	public List<String> jobList;

	public List<String> noJobList = new ArrayList<>();

	public boolean female;

	public String data;
}
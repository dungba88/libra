package org.joo.libra.test.support;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Person {

    private String name;

    private long age;
    
    private int salary = 0;

    private Demographic demographic;

    private String[] jobs;

    private String[] noJobs = new String[0];
    
    private List<String> jobList;
    
    private List<String> noJobList = new ArrayList<>();
    
    private boolean female;
    
    private String data;
}
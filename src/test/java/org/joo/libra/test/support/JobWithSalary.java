package org.joo.libra.test.support;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobWithSalary {

    private String name;
    
    private int salary;
}

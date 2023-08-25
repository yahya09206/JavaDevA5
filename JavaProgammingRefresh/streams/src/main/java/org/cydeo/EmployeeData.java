package org.cydeo;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2065555555", "3105555555")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("4255555555", "2535555555")),
                new Employee(102, "Peter", "Peter@cydeo.com", Arrays.asList("9715555555", "4045555555"))
        );
    }
}

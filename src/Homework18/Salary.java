package Homework18;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Salary {
    public static void main(String[] args){
        List<Employee> employee = Arrays.asList(
                new Employee("Alice","Engineering",6500),
                new Employee("Ion","Marketing",5000),
                new Employee("Anais","Engineering",7000)
        );

        String highSalary = employee.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No departments found");

        System.out.println(highSalary);

    }
}
class Employee{
    private String name;
    private String department;
    private double salary;

    public Employee(String name,String department,double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

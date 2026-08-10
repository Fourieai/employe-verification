/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeidentification;

/**
 *
 * @author Student
 */

// employee class with the enum as a field, plus other fields

public class Employee {
  
private int employeeNumber;
    private String name;
    private String identityNumber;
    private EmployeeIdentification type;

public Employee(int employeeNumber, String name, String identityNumber, EmployeeIdentification type) {
    
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.identityNumber = identityNumber;
        this.type = type;
        
    }

//employee data displayed at the end of the program

    public void printDetails() {
        
        System.out.println("\nEmployee Number: \n" + employeeNumber);
        System.out.println("\nName: \n" + name);
        System.out.println("\nIdentity Number: \n" + identityNumber);
        System.out.println("\nEmployee Type: \n" + type);
        
    }
}

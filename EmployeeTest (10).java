/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeidentification;

/**
 *
 * @author Student
 */
public class EmployeeTest {
    
public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ofentse Fourie", "9801015800083", EmployeeIdentification.FIXED);
        Employee emp2 = new Employee(102, "Refilwe Zulu", "8805126700084", EmployeeIdentification.PERMANENT);
        Employee emp3 = new Employee(103, "Rinae Mvelo", "0002285900085", EmployeeIdentification.TEMPORARY);

        Employee[] employees = { emp1, emp2, emp3 };

        System.out.println("\n   Employee Records   \n");

        for (Employee e : employees) {
            
            e.printDetails();
        }
    }
}

package java8features;

import java8features.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingACustomEmployeeUsingComparatorAndLambda {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(
                List.of(
                        new Employee(2069758,"Chandan"),
                        new Employee(2123456,"Micheal"),
                        new Employee(123456,"Pam")
                )
        );
        Comparator<Employee> c = (e1, e2)->(e1.getEmpNo()<e2.getEmpNo())?-1:(e1.getEmpNo()>e2.getEmpNo())?1:0;
        System.out.println(employeeList);
        Collections.sort(employeeList,c);//sort based on employee number
        System.out.println(employeeList);
        Comparator<Employee> s = (e1,e2)->e1.getEmpName().compareTo(e2.getEmpName());
        Collections.sort(employeeList,s);//sort based on employee name
        System.out.println(employeeList);
    }
}

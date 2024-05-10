package Day13;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

//Here I combine filter and Map
class Employee{
    int empid;
    String empname;
    int salary;

    Employee(int empid,String empname,int salary){
        this.empid=empid;
        this.empname=empname;
        this.salary=salary;
    }


}
public class Filter_Map {
    public static void main(String[] args) {
        List<Employee>employeesList= Arrays.asList(
                new Employee(101,"A",15000),
                new Employee(102,"B",30000),
                new Employee(103,"C",45000),
                new Employee(104,"D",50000)



                );
        //Combination of filter and map

        List<Integer>employeeSalList=employeesList.stream()
                .filter(e->e.salary>20000)
                .map(e->e.salary)
                .collect(Collectors.toList());
        System.out.println("Combination of Filter and map :"+employeeSalList);


    }

}

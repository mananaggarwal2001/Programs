import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Employee Class
        Employee Manan = new Employee("Manan",30);
        Employee Aman = new Employee("Aman",35);
        Employee Naman = new Employee("Naman",20);
        Employee Sarthak = new Employee("Sarthak",15);

        // Department class
        Department department = new Department("Human Resource");
        department.addEmployee(Aman);
        department.addEmployee(Naman);
        department.addEmployee(Sarthak);

        Department Accounting =new Department("Accounting Department");
        Accounting.addEmployee(Manan);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department);
        departmentList.add(Accounting);

        // Flat Map usage in stream

        departmentList.stream()
                .flatMap(department1 -> department1.getEmployees().stream())  // to return the stream of employee.
                // it is called flat Map because it is used for flatten nested list
                // as in this we have gone from the department list to the employee list.
                // It is a intermediate operation
                .forEach(System.out::println);

        // COLLECT METHOD
        // it is a terminal operation
        // it is used for collecting the stream of the data in the list into the another list.

        List<String> someBingoNumbers =  Arrays.asList(
                "N40", "N36",
                "B12","B6",
                "G53", "G49","G50","g69",
                "I26","I17","I29",
                "O71");
//
//        List<String> sortedGNumbers = someBingoNumbers.stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);


        // Collect Method Accept Three Parameters Supplier,Accumulator, Combiner
        // Supplier which will construct a new  array List for Us
        // Accumulator is used when we add initial item into the list
        // Combiner is used to improve the efficiency of the operation


        System.out.println("-------------------------------------------");

        sortedGNumbers.forEach(s -> System.out.println(s));  // using lambda equation

        Map<Integer,List<Employee>> getEmployeeByAge = departmentList
                .stream()
                .flatMap(department1 -> department1.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        // reduced method in the stream :- it is used in the String into the single result.
        // reduce compares the ages of the two employee and return the age of the younger employee.
        // reduce method is used for setting the conditon to retreave the information in the list.
        // reduce method is the TERMINAL OPERATION
        // ifPresent here is acting as an option result.

        // NOTE ON THE STREAM

        // we cant reuse them as we reuse the stream it will throw the Illegal state Exception
        // Operations on the Stream are lazily evaluated.
        // Intermediate operation are not performed until there is a terminal operation
        // we can use type of Stream like int Stream, Long Stream, Double Stream.

        // Parallel Stream is used for increasing performance of execution.
        //

        departmentList.stream()
                .flatMap(department1 -> department1.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge()< e2.getAge() ? e1:e2)  // Here it is used for retreaving the youngest employee name
                .ifPresent(System.out::println);

        // Intermediate operation are not performed until there is a terminal operation
        // Example

        Stream.of("ABC","BAA","AB")
                .filter(s -> {
                    System.out.println(s);
                    return s.length()==3;
                })
                .count();  // Count is a terminal operation.
    }
}

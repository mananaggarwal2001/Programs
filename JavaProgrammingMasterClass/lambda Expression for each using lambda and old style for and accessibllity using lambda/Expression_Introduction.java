import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Expression_Introduction {


    public static void main(String[] args) {
//        new Thread(() -> System.out.println("Printing From the Runnable Class")).start();
//
//
//        new Thread(() -> {
//            System.out.println("Manan is a good Boy");
//            System.out.println("Manan is the Best Guy in the Universe");
//            System.out.println("Manan is the Superhero");
//            System.out.printf("The No of Lines is : %d\n", 3);   // In just Single Statement We cant use the Semicolon
//            // but in Multiple Statements it is important to use semicolon
//        }).start();
//
        Employee Manan = new Employee("Manan ", 30);
        Employee Aman = new Employee("Aman", 40);
        Employee Vishal = new Employee("Vishal", 100);
        Employee Naman = new Employee("Naman", 10);

        List<Employee> employees = new ArrayList<>();
        employees.add(Manan);
        employees.add(Aman);
        employees.add(Vishal);
        employees.add(Naman);
//
//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));  // Using Lambda Expressions With Parameters etc
//
//
//        //        Collections.sort(employees, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee employee1, Employee employee2) {
////                return employee2.getName().compareTo(employee1.getName());
////            }
////        });
//
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
//
//        upperConcat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//
//        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName()); // return Keyword is
//        // Assumed when we are Using Lambda Expression to write Anonymous Class.
//
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        for(Employee employee : employees){

            System.out.println(employee.getName());
            new Thread(() -> System.out.println(employee.getAge())).start(); // the variable is final for
                                                                             // each iteration as in the enhanced for loop it
                                                                             //will create the new variable that seems to be final etc
        }

        System.out.println("////////////////////////////////////////////////////////////////////////////////////");


        for(int i =0 ;i < employees.size();i++){
            Employee employee = employees.get(i);
            System.out.println(employee.getName());
            new Thread(()-> System.out.println(employee.getAge())).start();
            // the variable is final for
            // each iteration as in the enhanced for loop it
            //will create the new variable that seems to be final etc
            // we cant declare the Employee  variable outside the for loop as it will continuesly change the value which will not be final.
        }

    }


    public final static String doStringStuff(upperConcat uc, String s1, String s2) {
        return uc.UpperConcat(s1, s2);
    }


    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    interface upperConcat {
        public String UpperConcat(String s1, String s2);
    }

    static class AnotherClass {
        public String doSomething() {
//            upperConcat uc = (s1, s2) -> {     // the lambda is treated as a nested block of code as it is in the another class and it has the same scope as that of nested block does .
//                System.out.println("the Lambda Class name  should be  " + getClass().getSimpleName());
//                String result = s1.toUpperCase() + s2.toUpperCase();
//                return result;
//
//            };


            int i = 0;

            upperConcat uf = (s1, s2) -> {
                System.out.println("The lambda expression is " + getClass().getSimpleName());
                System.out.println("I am the lambda expression = " + i);   // local variable has to be decelared final if we want to use them as local variable .
                String result = s1.toUpperCase() + s2.toUpperCase(); // values has to be decelared final so that anonymous class knows what value do they want to use .
                return result;
            };
            System.out.println("The AnotherClass name is " + getClass().getSimpleName());
            return doStringStuff(uf, "String 1 ", "String 2");


//            upperConcat uc = new upperConcat() {
//                    @Override
//                    public String UpperConcat(String s1, String s2) {
//                        System.out.println("i within anonymous class is " + i);
//                        return s1.toUpperCase() + s2.toUpperCase();
//                    }
//                };
//                System.out.println("The AnotherClass Name is " + getClass().getSimpleName());
//                i++;
//                System.out.println("i= " + i);
//                return doStringStuff(uc,"String 1","String 2");


            //            System.out.println("The AnotherClass Name is "+ getClass().getSimpleName());
//            return doStringStuff(new upperConcat() {
//                @Override
//                public String UpperConcat(String s1, String s2) {
//                    System.out.println("The Anonymous Class name is "+ getClass().getSimpleName());
//                    return s1.toUpperCase() + s2.toUpperCase();
//                }
//            }, "String1", "String2");


        }

    }

    public void printValue() {
        int number = 23;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("The Value of the lambda is "  + number); // the number is decelared so in the print value class is
                                                                         // effectively final and and anonymous class knows we can use this final class in the anonymous class .
        };

        new Thread(r).start();
    }
}

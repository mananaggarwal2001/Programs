import java.util.*;

public class Expression_Introduction {


    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing From the Runnable Class")).start();


        new Thread(()->{
            System.out.println("Manan is a good Boy");
            System.out.println("Manan is the Best Guy in the Universe");
            System.out.println("Manan is the Superhero");
            System.out.printf("The No of Lines is : %d\n",3);   // In just Single Statement We cant use the Semicolon
                                                                // but in Multiple Statements it is important to use semicolon
        }).start();

        Employee Manan = new Employee("Manan ",30);
        Employee Aman = new Employee("Aman",40);
        Employee Vishal = new Employee("Vishal",100);
        Employee Naman = new Employee("Naman",10);

        List<Employee> employees = new ArrayList<>();
        employees.add(Manan);
        employees.add(Aman);
        employees.add(Vishal);
        employees.add(Naman);

Collections.sort(employees,( employee1, employee2)->
                   employee1.getName().compareTo(employee2.getName()));  // Using Lambda Expressions With Parameters etc





        //        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee2.getName().compareTo(employee1.getName());
//            }
//        });


        for(Employee employee : employees){
            System.out.println(employee.getName());
        }

        String sillyString = doStringStuff((s1,s2) -> s1.toUpperCase() + s2.toUpperCase() , employees.get(0).getName(),employees.get(1).getName()); // return Keyword is
                                                                                                       // Assumed when we are Using Lambda Expression to write Anonymous Class.

        System.out.println(sillyString);

    }
    public final static  String doStringStuff(upperConcat uc , String s1 , String s2){
        return uc.UpperConcat(s1,s2);
    }



    static class Employee{
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

         interface upperConcat{
        public String  UpperConcat(String s1 , String s2);
    }
}

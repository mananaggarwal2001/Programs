import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Employee Manan = new Employee("Manan Aggarwal ", 30);
        Employee Aman = new Employee("Aman Bhaiya", 40);
        Employee Vishal = new Employee("Vishal Thakur", 100);
        Employee Naman = new Employee("Naman Aggarwal", 10);
        Employee red = new Employee("Red Hunt", 31);
        Employee Charming = new Employee("prince Charming", 40);
        Employee white = new Employee("white Hat", 40);

        List<Employee> employees = new ArrayList<>();
        employees.add(Manan);
        employees.add(Aman);
        employees.add(Vishal);
        employees.add(Naman);
        employees.add(red);
        employees.add(Charming);
        employees.add(white);

        printByAge(employees,"Employee age over 30", employee -> employee.getAge()>30); //Third argument is the
                                                                                               // predicate condition which is passed to the predicate interface
        printByAge(employees,"Employee age under 30 or equal 30",employee -> employee.getAge()<=30);
        printByAge(employees, "Employee younger than the 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()< 25;
            }
        });


        // There Are Three Types of predicate
        // Double predicate
        // Int Predicate
        //Long Predicate


//        IntPredicate greaterThan15 = i->i>15;  // we can use same variable as they are within the scope of lambda.
//        IntPredicate lessThan100 = i->i<100;
//        System.out.println(greaterThan15.test(10));
//        int a=20;
//        System.out.println(greaterThan15.test(a+5));
//        System.out.println(greaterThan15.and(lessThan100).test(10)); // chaning two predicates together.
//        System.out.println(greaterThan15.and(lessThan100).test(50));


        // Function interface
        // returns the value and accept the parameter
        // Method used is called apply

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        Function<Employee, String> getFirstName = (Employee employee) -> {
          return employee.getName().substring(0,employee.getName().indexOf(' '));  // Function for first Name
        };

        Random random = new Random();
        for(Employee employee: employees){
            if(random.nextBoolean()){
                System.out.println(getAName(getFirstName,employee));
            }else{
                System.out.println(getAName(getLastName,employee));
            }
        }

//        Function<Employee, String> lastName = new Function<Employee, String>() {  // regular method usage
//            @Override
//            public String apply(Employee employee) {
//                return employee.getName().substring(employee.getName().indexOf(' ')+1);
//            }
//        };
//        //        // there are four types of supplier
//        // 1. int supplier
//        // 2. Double Supplier
//        // 3. Long Supplier
//        // 4. boolean Supplier
//
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = ()->random.nextInt(1000); // range which we give in the brackets. starts from zero
//        for(int i=0;i<10;i++){
//            System.out.println(randomSupplier.get());
//        }
//
//
//        employees.forEach(employee -> {
//            System.out.println( "Last name is : " + employee.getName().substring(employee.getName().indexOf(' ')+1)); // giving the last name
//        });
//
//        LongPredicate longp = L->L>15l;
//        System.out.println(longp.test(10));
        // we can also chain two predicates


        Function<Employee, String> toUpperCaseName = (Employee employee) -> {
            return employee.getName().toUpperCase();
        };

        Function<String,String> firstName = name-> name.substring(0,name.indexOf(' '));

        Function joinedTwoFunction = toUpperCaseName.andThen(firstName);   // Use andThen method to join Two Functions
                                                                           // The function will call the andthen method will
                                                                           //run first and then the function which passed as a parameter will run on its result.
                                                                           // when we chain two function result of one function becomes the argument for the next function
//        System.out.println(joinedTwoFunction.apply(employees.get(0)));

        // bi function which accept two parameters

        BiFunction<String, Employee,String> concatNameAndAge = (String name , Employee employee)->{
            return name.concat(" " + employee.getAge());
        };

        System.out.println(concatNameAndAge.apply( joinedTwoFunction.apply(employees.get(0)).toString() , employees.get(0)));

        // Urinary operator interface accepts one argument and return the argument of the same type.
        // Urinary operator interface extends function interface as they can also be chained like function interface

        IntUnaryOperator intBy5 = i-> i+5;
        System.out.println(intBy5.applyAsInt(10));

        // Consumer interface

         Consumer<String> c1 = s -> s.toUpperCase();
         Consumer<String> c2 = s -> System.out.println(s);

        c1.andThen(c2).accept("Hello World");

    }

    private static String getAName(Function<Employee,String> getName, Employee employee){
        return getName.apply(employee);
    }

    public static void printByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("=================================");
        for(Employee employee: employees){
            if(ageCondition.test(employee)){            // ageCondition is a predicate that uses test
                                                        // function which is inBuild in the Predicate returns true or false
                                                        // according to the condition.
                System.out.println(employee.getName());
            }
        }
    }
}


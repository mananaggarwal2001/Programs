import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Employee Manan = new Employee("Manan ", 30);
        Employee Aman = new Employee("Aman", 40);
        Employee Vishal = new Employee("Vishal", 100);
        Employee Naman = new Employee("Naman", 10);
        Employee red = new Employee("Red", 31);
        Employee Charming = new Employee("prince Charming", 40);
        Employee white = new Employee("white", 40);

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


        IntPredicate greaterThan15 = i->i>15;  // we can use same variable as they are within the scope of lambda.
        IntPredicate lessThan100 = i->i<100;
        System.out.println(greaterThan15.test(10));
        int a=20;
        System.out.println(greaterThan15.test(a+5));
        System.out.println(greaterThan15.and(lessThan100).test(10)); // chaning two predicates together.
        System.out.println(greaterThan15.and(lessThan100).test(50));


        Random random = new Random();
        Supplier<Integer> randomSupplier = ()->random.nextInt(1000); // range which we give in the brackets. starts from zero
        for(int i=0;i<10;i++){
            System.out.println(randomSupplier.get());
        }


        //        LongPredicate longp = L->L>15l;
//        System.out.println(longp.test(10));
        // we can also chain two predicates
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


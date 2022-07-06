public class DateTimeInJava {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        long days = System.currentTimeMillis()/(1000*60*60*24);
        long hours= System.currentTimeMillis()/1000/3600;
        System.out.println("The Number of the Hours Spend is :- " + hours);
        System.out.println(days);
        float years = days/366f;
        System.out.println(years);
        float starting_year= 2022- years;
        System.out.println(starting_year);
        System.out.println("The Largest Value of the long number is :- " + Long.MAX_VALUE);
        System.out.println("No it is not safe to store the number in the long datatype.");

    }
}

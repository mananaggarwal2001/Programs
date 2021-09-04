import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<>();
        languages.put("Java","An high level programming language");
        languages.put("Python","an interpreted object oriented programming language ");
        languages.put("Algo","an algorithmic language");
        languages.put("Basic","Language program");

        System.out.println(languages.get("Java"));
    }
}

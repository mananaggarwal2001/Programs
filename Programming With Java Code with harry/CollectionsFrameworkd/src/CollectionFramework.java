import java.util.ArrayList;

public class CollectionFramework {
    private static final ArrayList<Integer> name = new ArrayList<>();
    private static final ArrayList<Integer> name2 = new ArrayList<>();

    public static void main(String[] args) {
        name.add(100);
        name.add(200);
        name.add(300);
        name.add(400);
        name.add(500);
        name.add(600);
        name2.add(10);
        name2.add(11);
        name2.add(12);
        name2.add(13);
        name2.add(14);
        int length = name.size();
        name.addAll(name2);
        System.out.println(name);

    }
}

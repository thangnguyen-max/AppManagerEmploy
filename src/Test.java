import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(10);
        list.add(3);
        list.add(30);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
    }
}

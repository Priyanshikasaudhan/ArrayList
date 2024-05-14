import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(44);
        list.add(23);
        list.add(22);
        list.add(66);
        list.add(98);
        list.add(123);
        System.out.println(list);
        // sort Acsending order
        Collections.sort(list);
        System.out.println(list);
        // sort desecding 
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        // reverseOrder() comparator function
    }
}

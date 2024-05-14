import java.util.ArrayList;
public class operation {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int element = list.get(4);
        System.out.println(element);
        list.remove(3);
        System.out.println(list);
        list.set(2,55);
        System.out.println(list);
        System.out.println(list.contains(45));
        System.out.println(list.contains(2));
    }
}

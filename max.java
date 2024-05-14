import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(15);
        list.add(12);
        list.add(55);
        list.add(50);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max Element = "+ max);
    }
}

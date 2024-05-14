import java.util.ArrayList;

public class swap {
    public static void swap(ArrayList<Integer> list , int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(44);
        list.add(23);
        list.add(22);
        list.add(66);
        list.add(98);
        list.add(123);
        int idx1=2, idx2=5;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}

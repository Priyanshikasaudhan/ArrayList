import java.util.*;
import java.util.ArrayList;

public class mutilist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        mainList.add(arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3); 
        arr1.add(4);
        mainList.add(arr1);
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}

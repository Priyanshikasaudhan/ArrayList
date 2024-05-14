import java.util.ArrayList;
public class printrevesenumber {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("s");
        list.add("r");
        list.add("q");
        list.add("a");
        list.add("c ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}

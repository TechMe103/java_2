import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    /*static void reverseList(ArrayList<Integer> list){
        int i=0 , j= list.size()-1;

        while(i < j){ //swap method
            Integer temp= Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

    }
         */
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> l1= new ArrayList<>();
        l1.add("Welcome to channel");
        list.add(0);
        list.add(4);
        list.add(43);
        list.add(35);
        list.add(21);
        list.add(50);
        System.out.println("Original list is:" + list);
        System.out.println("Stirng is:" + l1);
       // reverseList(list);
        Collections.sort(list);
        System.out.println("increaing order:" + list);
        Collections.sort( list , Collections.reverseOrder());
        System.out.println("Decreasing order is:" + list);

    }
}

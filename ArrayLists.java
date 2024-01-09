import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        //add
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get element
        int get=list.get(2);
        System.out.println(get);

        //add el in between 
        System.out.println(list.add(4));

        //set element
        System.out.println(list.set(2, 56));
        System.out.println(list);

        //delete element
        int q=list.remove(2);
        System.out.println(q);
        System.out.println(list);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //sorting 
        Collections.sort(list);
        System.out.println(list);


    }
}

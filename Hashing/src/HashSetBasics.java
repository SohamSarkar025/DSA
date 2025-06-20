import java.util.HashSet;
import java.util.Iterator;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert Value in Set
        set.add(1);
        set.add(2);
        set.add(3);

        //Set Doesnot allow duplicate items to add.
        set.add(1);

        //Print Values
        System.out.println("Set Items: "+set);

        //Iterate through Set
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ,");
        }
    }
}

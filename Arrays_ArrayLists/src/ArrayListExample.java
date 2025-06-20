//          | Use Case                                   | Recommended Structure |
//         | --------------------------------         | --------------------- |
//        | Fixed size, fast access                 |    Array        |
//        | Dynamic size, easy insert/delete | ArrayList     |
//        | Storing primitives                     | Array (`int[]`)  |
//        | More flexible structure             | ArrayList        |

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //ArrayList Item Printing Using for Loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        //Using Enhance For Loop
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        System.out.println(list);
        System.out.println(list.size());
    }
}

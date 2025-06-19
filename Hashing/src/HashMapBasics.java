import java.util.*;
public class HashMapBasics {
    public static void main(String[] args) {
         HashMap<String , Integer> map = new  HashMap<>();

         //Insertion in HashMap
         map.put("India",120);
         map.put("US",80);
         map.put("China",90);
        System.out.println(map);

        map.put("China",200); //Update the value corresponding to key "China"
        System.out.println(map);

        //Search
        //map.containsKey() Return true is the Key is Present
        if(map.containsKey("China")){
            System.out.println("Key Present");
        }

        //map.get() Return the result of the key
        System.out.println(map.get("China"));//Return the value of the key if exists
        System.out.println(map.get("Chinaaa")); //Return null if the key is not present

        //Enhanced For Loop
        int[] arr = {1,2,3};
        for(int val : arr){
            System.out.print(val+" ");
        }

        //Iteration in HashMap through Entry Set
        for( Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration in HashMap through Key Set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //Delete
        map.remove("China");
        System.out.println(map);
    }
}

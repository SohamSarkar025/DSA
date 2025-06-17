public class Basics {
    public static void main(String[] args) {

        //String is a class of Java
//        String  name = "Soham Sarkar";
//        System.out.println(name);

        //Comparison

//        String num1 = "Soham";
//        String num2 = "Soham";
//        System.out.println(num1==num2); //This is give true as num1 and num2 is pointing to same object by String Pool
//        System.out.println(num1.equals(num2)); // Output => True because of String Pool

        String num1 = new String("Soham");
        String num2 = new String("Soham");
//        System.out.println(num1.equals(num2)); //It only checks the value , Output => true
//        System.out.println(num1==num2);  // the reference variable is two different object,Output => false

        //charAt() Method
        System.out.println(num1.charAt(0));

    }
}

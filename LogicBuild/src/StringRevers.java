//Reverse of String useing first approach 
//toCharArray() method of String class
import java.util.Scanner;
public class StringRevers {
    public static void main(String[] args) throws Exception {
        //Here We Take the Scanner class to take input from the keyborad
        //Here ditrect represent into try block because it autometically close the Scanner object
        //Try block is the Enhanced version comes in 1.7 with out catch and finally block
       try(Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter the String :");
            String str = sc.nextLine();

            //Here we perfrom Revers given String
            //use the toCharArray() method 

            char str1[] = str.toCharArray();

            //Here we travel the char array to print revers
            for(int i = str1.length-1 ; i >= 0 ; i--) {
                System.out.print(str1[i]);
            }
       }
    }
}

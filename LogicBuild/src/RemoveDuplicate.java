/*
 Q:Remove the Duplicate from the Given String ?

 input :Biswojitjena
 output :Biswojtena

 Using four approach to remove duplicate from the String.
 1>Using java 8
 2>Using indexOf() in String class
 3>Using Charactre Array
 4>Using Set Inteface method

 */



import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the String to find Duplicate :");

            String str = sc.nextLine();

            //Approach-1

            StringBuilder br = new StringBuilder();
            str.chars().distinct().forEach(c -> br.append((char)c));

            System.out.println(br);

            //Approach-2
            StringBuilder br1 = new StringBuilder();
            for(int i = 0 ; i < str.length() ; i++) {
                char ch = str.charAt(i);
                int inx = str.indexOf(ch,i+1);//Check the all character present in the string with given char

                //Here index return is -1 then add the char
                if(inx == -1) {
                    br1 .append(ch);
                }
            }
            System.out.println(br1);

            //Approch-3
            StringBuilder br2 = new StringBuilder();

            char arr[] = str.toCharArray();

            for(int i = 0 ; i < arr.length ; i ++) {
                boolean repate = false;
                for(int j = i + 1 ; j < arr.length ; j ++) {
                    if(arr[i] == arr[j]) {
                        repate = true ;
                        break;
                    }
                }

                if(!repate) {
                    br2.append(arr[i]);
                }
            }

            System.out.println(br2);

            //Approach-4
            StringBuilder br3 = new StringBuilder();
            Set<Character> set = new LinkedHashSet<>();

            for(int i = 0 ; i < str.length(); i++) {
                set.add(str.charAt(i));
            }

            for(Character c : set) {
                br3.append(c);
            }

            System.out.println(br3);


        }
    }
}

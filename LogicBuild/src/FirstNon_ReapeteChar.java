/*
 * Finding the first non-repating character in given string.
 * Use two approach 
 * 1>Without using the Collection
 * 2>useing the Collection.
 * 
 * 
 */

import java.util.Scanner;

public class FirstNon_ReapeteChar {
    public static void main(String []rags) {

        //Use the first Approach-1
        try(Scanner sc = new Scanner(System.in)) {
            //Take the input
            //System.out.println("Enter a String :");
            String str = "AABBCDEE";

            //Here take the two loop to find first occurance 
            for(int i = 0 ; i < str.length() ; i ++) {
                boolean unique = true ;
                for(int j = 0 ; j < str.length() ; j++) {
                    //Here check the i and j not in same position and compare the each charater
                    if(i != j && (str.charAt(i) == str.charAt(i))) {
                        unique = false;
                        break;
                    }
                }
                //Here break because unique is true and we find the first Occurance
                if(unique) {
                    System.out.println("First-Occurance Character is :"+str.charAt(i));
                    break;
                }
            }
            
        }
    }
}

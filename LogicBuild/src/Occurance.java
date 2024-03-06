/*
 * Occurance of each characture in given string.
 * input:Hello
 * 
 * output:
 * 1> H----1
 * 2> e----1
 * 3> l----2
 * 4> 0----1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class Occurance {
    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String :");

            String str = sc.nextLine();

            //here we convert to the charactre Array
            char [] ch = str.toCharArray();

            //Here we take a map interface

            Map<Character,Integer> map = new HashMap<>();

            for(char chr : ch) {
                //Here each character to check that charcter is present or not
                if(!map.containsKey(chr)) {
                    //If not present then add to the map
                    map.put(chr, 1);  
                }else {
                    //if present then get the value according to key
                    int value = map.get(chr);
                    //Incerment the value.
                    map.put(chr, value+1);
                }
            }
            System.out.println("Numbers of time charactre will occure :");
            System.out.println(map);

            System.out.println("First non- repeated character :");
            for(Entry<Character,Integer> entrySets : map.entrySet()) {
                if(entrySets.getValue() == 1) {
                    System.out.println(entrySets.getKey());
                    break;
                }
            }

        }

    }
}

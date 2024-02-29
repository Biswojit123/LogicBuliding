

/*


    Q:Write a java program to reverse each word of the String .

    input : Hi i am Biswojit
    output: iH i ma tijowsiB


*/


import java.util.Scanner;

public class ReversWord {
    public static void main(String []args) {
        //Now take a string 
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the String :");
            String str = sc.nextLine();

            //Split the every word into a array
            String[] word = str.split(" ");

            String output = "";
            //Now reverse
            for(String words : word) {
                String revers = " " ;
                for(int i = words.length()-1;i >=0 ;i--) {
                    revers = revers + words.charAt(i);
                }
                output = output +revers +" ";
            }

            System.out.println(output);

        }
    }
}

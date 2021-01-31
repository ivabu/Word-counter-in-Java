package com.company;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {
	// Auto-generated method stub
        System.out.println("Type your paragraph:");
        Scanner scan = new Scanner(System.in); //initialises scanner variable
        String userInput = scan.nextLine(); // string received by the user
        scan.close();
        userInput = userInput.trim(); //clean by removing leading and lagging spaces
        int count = 0;
        if (userInput.length() != 0) {
            {
                //count in the first word (other words defined by spaces at the beginning and end)
                //first word cannot begin with a space
                count++;
                for(int i = 0; i < userInput.length(); i++) {
                    if (userInput.charAt(i) == ' '
                            && userInput.charAt(i + 1) != ' '){
                        // ' ?' pattern count as 1
                        count++;
                    }
                }
            }
        }
        System.out.println("Word count: " + count);
    }
}

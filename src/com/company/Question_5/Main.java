package com.company.Question_5;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */


    }

    protected void Statement() {



        System.out.println("What is your favorite flavor od ice cream out of these 4?\nChocolate \nVanilla \nStrawberry \nCookie dough");

        switch (input.nextLine()) {
            case "Chocolate":
                System.out.println("Yeah it's pretty good.");
                break;
            case "vanilla":
                System.out.println("YUMMY!!");
                break;
            case "Strawberry":
                System.out.println("It's good, nut last on this list.");
                break;
            case "Cookie dough":
                System.out.println("This flavor is like heaven, it is my favorite.");
                break;
            default:
                System.out.println("You have not selected an option that is valid.\n please try again.");
                Statement();
        }
    }
}
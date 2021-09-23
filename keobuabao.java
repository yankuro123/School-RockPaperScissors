package com.company;

import java.util.Scanner;
import java.util.Random;

public class keobuabao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Scissor (0), Rock(1), Paper(2)");
        System.out.println("put your pick here: ");
        int pick1 = input.nextInt();
        int com = new Random().nextInt(3);
        if ( pick1 > 2 || pick1 < 0)
        System.out.println("Please choose 1 of the 3 valid choices!");
        else{
         if (com == 0)
            System.out.println("The computer is Scissor");
        else if (com == 1)
            System.out.println("The computer is Rock");
        else
            System.out.println("The computer is Paper");
        if (pick1 == 0)
            System.out.println("You are Scissor");
        else if (pick1 == 1)
            System.out.println("You are  Rock");
        else
            System.out.println("You are  Paper");
        if (pick1 == 0)
            switch (com) {
                case 1 -> System.out.println("Computer win");
                case 2 -> System.out.println("You win");
                case 0 -> System.out.println("it's a draw");
            }
        else if (pick1 == 1 )
            switch (com) {
                case 2 -> System.out.println("Computer win");
                case 0 -> System.out.println("You win");
                case 1 -> System.out.println("it's a draw");
            }
         else{
            switch (com) {
                case 0 -> System.out.println("Computer win");
                case 1 -> System.out.println("You win");
                case 2 -> System.out.println("it's a draw");
            }
            }
        }
        System.out.println("do you want to continue 1/0");
        int con = input.nextInt();
        while (con != 0 && con != 1){
            System.out.println("Error, please try again");
            con = input.nextInt();}
        while  (con == 1 || con == 0 ){
            if ( con==1 ) {
                System.out.println("Scissor (0), Rock(1), Paper(2)");
                System.out.println("put your pick here: ");
                int pick = input.nextInt();
                int com1 = new Random().nextInt(3);
                if (pick > 2 || pick < 0)
                    System.out.println("Please choose 1 of the 3 valid choices!");
                else {
                    if (com1 == 0)
                        System.out.println("The computer is Scissor");
                    else if (com1 == 1)
                        System.out.println("The computer is Rock");
                    else
                        System.out.println("The computer is Paper");
                    if (pick == 0)
                        System.out.println("You are Scissor");
                    else if (pick == 1)
                        System.out.println("You are  Rock");
                    else
                        System.out.println("You are  Paper");
                    if (pick == 0)
                        switch (com) {
                            case 1 -> System.out.println("Computer win");
                            case 2 -> System.out.println("You win");
                            case 0 -> System.out.println("it's a draw");
                        }
                    else if (pick == 1)
                        switch (com) {
                            case 2 -> System.out.println("Computer win");
                            case 0 -> System.out.println("You win");
                            case 1 -> System.out.println("it's a draw");
                        }
                    else {
                        switch (com) {
                            case 0 -> System.out.println("Computer win");
                            case 1 -> System.out.println("You win");
                            case 2 -> System.out.println("it's a draw");


                        }
                    }
                }
            }
            else if (con == 0)
                break;
            System.out.println("do you want to continue 1/0");
            con = input.nextInt();
        }
        System.out.println("Thank you for playing!");
    }
}

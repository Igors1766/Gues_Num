package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What is your name");// write your code here
        String name = scan.next();
        System.out.println("Hello," + name);
        int mynum = rand.nextInt(100)+1;
        System.out.println("Cheat" + mynum);
        for (int i = 0; i < 10; i++) {


            System.out.println("Beter your gest");
            int usernum = scan.nextInt();
            if (mynum>usernum){
                System.out.println("your num min");
            }
            if (mynum<usernum){
                System.out.println("your num max");
            }


            if (mynum == usernum){
                System.out.println("You win");
                break;
        }


        }




    }
}

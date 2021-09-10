package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
    App ask = new App();
    int age = ask.age();
    if(age != 16){
        out.println("You are not old enough to legally drive.");
    }
    else out.println("You are old enough to legally drive. ");
     //   System.out.println( "Hello World!" );
    }
    private int age(){
        out.print("What is your age? ");
        return in.nextInt();
    }
}

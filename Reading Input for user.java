package com.foundation;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args)
    {
        int FirstNo;
        int SecondNo;

        Scanner kb = new Scanner(System.in);        //use the Scanner to read input from the user
        System.out.print("Enter Your First Number "); //kb is an variable  
        FirstNo = kb.nextInt();                      //next. is used to  read input from the input device till the line change.
        System.out.print("Enter Your Second Number ");
        SecondNo = kb.nextInt();

        double Average = (FirstNo + SecondNo) / 2;
        System.out.print("Your Average Is "+Average);
        
        kb.nextLine();

        String Name;
        String Surname;

        System.out.print("Enter Your name: ");
        Name = kb.nextLine();
        System.out.print("Enter Your surname: ");
        Surname = kb.nextLine();
        System.out.print("Your Name is "+Name+" "+Surname);

    }
}

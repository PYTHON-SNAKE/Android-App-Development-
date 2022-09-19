package com.foundation;

public class First_Lessons {

    public static void main(String[] args)   //Use main function to print the Text -> public static void main(Strings[] args)
    {
        int firstno;      //int is used to declare a variable data type -> int Variable Name;
        int secondno;     //int is used to declare a variable data type -> int Variable Name;

        firstno = 12;     //Variable is used to declare a no or value  -> Variable Name = Value;
        secondno = 18;    //Variable is used to declare a no or value  -> Variable Name = Value;

        double Calculation;   //double is used to declare a variable data type -> double Variable Name;

        Calculation = firstno * secondno;  //Create a Simple value calculation by multiplying both no

        System.out.print("Your Result is" + Calculation);    //Use main function to print the Text -> System.out.print("Any Text to be printed" + Variable name)

System.out.print("--------------------------------------------------------");

        String name;     //String is used to declare a variable data type -> String Variable Name;
        String surname;  //String is used to declare a variable data type -> String Variable Name;

        name = "Umar";      //Variable is used to declare a no or value  -> Variable Name = Value;
        surname = "Aslam";  //Variable is used to declare a no or value  -> Variable Name = Value;

        System.out.print("Your Name is"+" "+name+" "+surname);  //Use main function to print the Text -> System.out.print("Any Text to be printed" + Variable name)


System.out.print("--------------------------------------------------------");

        boolean Value;  //boolean is a  data type  which is either false or true -> boolean Variable Name;
        Value = false;  //Variable is used to declare a no or value  -> Variable Name = Value;

        System.out.print("Your Answer IS"+Value);  //Use main function to print the Text -> System.out.print("Any Text to be printed" + Variable name)
System.out.print("--------------------------------------------------------");

        char first;
        first = 'u';             
        char second; 
        second = 'm';                      //char is used to declare a variable data type -> char Variable Name;
        char third;                         //Variable is used to declare a no or value  -> Variable Name = Value;
        third = 'a';
        char fourth;
        fourth = 'r';
        System.out.print(first+second+third+fourth);

System.out.print("--------------------------------------------------------");

        System.out.print("Values that are fixed by Owner or deeloper");

        final int firstn;
        int secondn;
                                                #final function to give a value to a variable that cannot change 
        firstn = 12;
        secondn = 50;
                             
        double Calc;

        Calc = (double) (firstn + secondn);

        System.out.print("Your Answer is "+Calc);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	homework4();
    }

    static void homework1()
    {
        boolean weekday = true;
        boolean vacation = false;

        if (weekday == true)
            System.out.println("James sleeps late");
        else if (vacation == true)
            System.out.println("James sleeps late");
        else
            System.out.println("James does not sleep late");
    }

    static void homework2()
    {
        int time = 11;
        boolean shining = true;

        if (time >= 10 && time <=16 && shining)
            System.out.println("Please use sunscreen");
    }

    static void homework3()
    {
        int a = 38, b = 45;
        boolean digit;

        if (a % 10 == b % 10)
            digit = true;
        else
            digit = false;

        System.out.println(digit);
    }

    static void homework4()
    {
        int a = 1;

        if (a % 387 == 0 && a % 6381 == 0)
            System.out.println(a);
        else
            a = a + 1;
    }

}

package com.company;

public class Fizzbuzz {
    public static void main(String[] args) {
        Fizzbuzz();
    }
    public static void Fizzbuzz(){
        int num= 30;
        for (int i = 1; i <= num; i++)
        {
            if (((i % 5)== 0) && ((i % 3) == 0))
                System.out.println("Fizzbuzz");
            else if ((i % 5)== 0)
                System.out.println("Fizz");
            else if ((i % 3)== 0)
                System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}


package Jobsheet5;
import java.util.Scanner;

public class Selection1StudentIDNumber {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.println("Input a number = ");
        int number = input16.nextInt();
        if (number%2 == 0) {
            System.out.println(number+" is an even number!");
        } else {
            System.out.println(number+" is an odd number!");
        }
    }
}
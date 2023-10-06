import java.util.Scanner;

public class experiment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.println("input year : ");
        year =input.nextInt();

        if (year%4 == 0){
            if(year%100 != 0){
                System.out.println("leap year "+ year);
            }
            else
            System.out.println( "not a leap year " + year);
        }

     input.close();

    }
}
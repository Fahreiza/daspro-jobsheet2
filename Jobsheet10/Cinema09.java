package Jobsheet10;

public class Cinema09 {
    public static void main(String[] args) {
        String[][] audience = {
            {"Amin", "Bena"},
            {"Candra", "Dela"},
            {"Eka", "Farhan"},
            {"Gisel", "Hana"}
        };
        
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Contents of row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }
        
        System.out.println("\nPrinting all audience:");
        System.out.printf("%s \t %s \n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s \n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s \n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s \n", audience[3][0], audience[3][1]);

        System.out.println("\nLength of each row:");
        for (String [] rowAudience : audience) {
            System.out.println("lenght of row" + rowAudience.length);
        }

        System.out.println("\nAudience in the row 3 : ");
            for (String i : audience[2]){
            System.out.println(i);
            }
    }
}

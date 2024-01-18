package gr.aueb.cf.ch5;
import java.util.Scanner;

public class FactolrialApp {
    public static void main(String[] args) {
        int n = 0;
        int userNumber = 0;
        Scanner input = new Scanner(System.in);
       System.out.printf("Give a factorial number \n");
       userNumber = input.nextInt();
        System.out.printf("o factorial toy %d einai %d",userNumber,facto(userNumber));
   }
   public static int facto(int n) {
        return (n <= 1) ? 1 : n * facto(n-1);
   }
}



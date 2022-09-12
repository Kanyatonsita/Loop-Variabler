import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String again;

        do {
            System.out.println("Skriv ett årtal");
            int year = sc.nextInt(); //2000 "enter" ( tömt genom sc.nextLine(); )
            sc.nextLine();

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("det är ett skottår");
            } else {
                System.out.println("det är inte ett skottår");
            }

            System.out.println("skriv en till (j/n)");
            again = sc.nextLine();
        } while ( again.equals("j"));


    }
}
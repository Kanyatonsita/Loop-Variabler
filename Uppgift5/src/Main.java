import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lätt skall ge ett tal 1-10
        //Mellan skall ge ett tal 1-100
        //svårt skall ge ett tal 1-1000

        Scanner nummer = new Scanner(System.in);
        String again; //while loopar.

        do{
            System.out.println("Välja mellan Lätt, Mellan, Svårt"); //användare ska välja mellan lätt, mellan, svårt.
            String nummer1 = nummer.nextLine();

            //Skriv in olika nivå.
            int nivå = 0;
            if(nummer1.equals("Lätt")){
                nivå = 10;
            }else if(nummer1.equals("Mellan")){
                nivå = 100;
            }else if(nummer1.equals("Svårt")){
                nivå = 1000;
            }

            int randomNumber = new Random().nextInt(nivå) + 1;
            System.out.println("Skriv ett nummer");
            int guess = nummer.nextInt(); //användare gissa ett nummer.

            //loopar randomNumber.
            while (guess != randomNumber) {
                if (guess > randomNumber) {
                    System.out.println("För hög");
                } else {
                    System.out.println("För låg");
                }
                System.out.println("Skriv ett nytt nummer!"); //om användare gissa fel få de skriva nytt nummer!
                guess = nummer.nextInt();

            }
            System.out.println("Du har rätt!"); // När användare gissa rätt!
            nummer.nextLine();

            System.out.println("Spelar igen (j/n)");
            again =nummer.nextLine();

        }while (again.equals("j"));

    }
}
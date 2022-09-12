import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //loopar
        String again;

        do {
            Scanner sc1 = new Scanner(System.in); //Skriv in vilken värde du vill att det ska omvandlat i cm.
            System.out.println("Välja mellan famnar, alnar, tum och fot för att se längden i cm");
            String val1 = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);//Skriv in längde ex. hur många famnar
            System.out.println("Skriv in längd");
            int val2 = sc2.nextInt();

            if (val1.equals("famnar")) {
                System.out.println(val2 + " famnar = " + 182.8f * val2 + " i cm.");
            } else if (val1.equals("alnar")) {
                System.out.println(val2 + " alnar = " + 59.4f * val2 + " i cm.");
            }
            if (val1.equals("tum")) {
                System.out.println(val2 + " tum = " + 2.5f * val2 + " i cm.");
            } else if (val1.equals("fot")) {
                System.out.println(val2 + " fot = " + 30.5f * val2 + " i cm.");
            }

            System.out.println(" Vill du ser en tabell till (j/n)");
            again = sc.nextLine();
        }while (again.equals("j"));




    }
}
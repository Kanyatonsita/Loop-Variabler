import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //talen 1-100
        //jämnt delbart med 3 = Fizz
        //jämnt delbart med 5 = Buzz
        //jämnt delbart med 3 och 5 = FizzBuzz
        //Kan inte delbart med 3 och 5 = enbart numret.
        Scanner sc = new Scanner(System.in);
        String again;
        do {
            for (int i = 0; i <= 100; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
            System.out.println(" Se engång till (j/n)");
            again = sc.nextLine();
        }while (again.equals("j"));


    }



}

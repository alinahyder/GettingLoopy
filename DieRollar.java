import java.util.Random;
import java.util.Scanner;

public class DieRollar {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        boolean keepRolling = true;

        while (keepRolling) {
            int throwCount=0;
            boolean tripleFound=false;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Throw", "Die 1", "Die 2", "Die 3", "Sum");

            while (!tripleFound){
                int die1 = random.nextInt(6) +1;
                int die2 = random.nextInt(6)+1;
                int die3 =  random.nextInt(6)+1;
                throwCount++;
                int sum = die1+die2+die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", throwCount, die1, die2, die3, sum);

                if (die1==die2 && die2==die3){
                    tripleFound=true;
                }
            }
            System.out.println("Triple found! Do you want to play again? (Y/N)");
            String userInput = scanner.nextLine().toUpperCase();

            if (!userInput.equals("Y")){
                keepRolling=false;
            }
        }

        scanner.close();



    }
}

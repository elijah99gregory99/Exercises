/*.
Input parameters: stressLevel (int), isWounded (boolean)
Expected output: number of dice to roll (int)
Write code that checks if a Panic Roll (1d6 + stress level)
triggers panic effects. If stress level is over 10, add additional conditions.

*/
import java.util.Scanner;
public class Alien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your stress: ");
        int stress = sc.nextInt();

        System.out.println("Are you wounded. 1 for yes, 2 for no: ");


        int totalDice = stress;

        if ( totalDice >= 10) {
            System.out.println ("You now have a additional condition.");}

    }
}
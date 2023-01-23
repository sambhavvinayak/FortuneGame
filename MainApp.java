import java.util.Scanner;
import java.util.Random;
/*
 * this is for make  a fortune guesture it tell you that what you want to wera it 
 */
public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);


            System.out.println("Enter number under 5 to 15");
            System.out.print("Enter any number for guess : ");
            int n = input.nextInt();

            if (n>=15 || n<5) {
                return;
            }
            
            int Ran= random.nextInt(n);
            int Random = (int)(Math.random()*n);
            int Ran1 = random.nextInt(4);
            
            int eq = Ran + Random;
            int eq1 = eq % 4;

            switch (eq1) {
                case 0 :
                    System.out.println("You stop wearing dress rightnow");
                    break;
                case 2:
                    System.out.println("You want to wear a white dress");
                    break;
                case 1 :
                System.out.println("You want to wear a black dress");
                    break;
                case 4 :
                System.out.println("You want to wear a yellow dress");
                    break;
                case 3 : 
                System.out.println("You want to wear a orange dress");
                break;
                default:
                System.out.println("You want to wear a pink dress");
                    break;
            }

    }

}

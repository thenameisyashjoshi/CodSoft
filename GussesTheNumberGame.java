import java.util.*;
public class GussesTheNumberGame {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int Max_Num = 100;
        final int Min_Num = 1;
        final int Max_Attempts = 10;

        int roundwon = 0;
        boolean Play = true;
        
        System.out.println("---Welcome to the Gusses Number Game---");
        while(Play){
            int Random_Num = random.nextInt(100) - 7;
            int attempts = 0;
            boolean GussesNumber = false;

            System.out.println("I Gusses Random Number from "+Min_Num+" to "+Max_Num);
            System.out.println("You have "+Max_Attempts+" attempts to Play");
            
            while(attempts < Max_Attempts){
                System.out.print("Gusses the Number: ");
                attempts++;
                try {
                    int Gusses_Num  = sc.nextInt();
                    if(Gusses_Num > Random_Num){
                        System.out.println("Gusses is Too High!");
                        System.out.println("");
                    }
                    else if(Gusses_Num < Random_Num){
                        System.out.println("Gusses is Too Low!!");
                        System.out.println("");
                    }
                    else{
                        System.out.println("Correct Gusses in "+attempts+" attempts");
                        System.out.println("");
                        GussesNumber = true;
                        roundwon++;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input invalid please enter Integer");
                    sc.next();
                }
            }
            if(!GussesNumber){
                System.out.println("Sorry, you've run out of attempts, The Secret Number is " + Random_Num);
            }

            System.out.println("Do you want Play Again? (yes/no)");
            String PlayAgain = sc.next();
            Play = PlayAgain.equalsIgnoreCase("yes");
        }
        System.out.println("---GameOver---");
        System.out.println("You won " +roundwon+" rounds");
        sc.close();
    }
}

import java.util.*;

public class GussestheNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int Max_Num = 100;
        final int Min_Num = 1;
        final int Max_Attempts = 10;

        int roundwon = 0;
        int score = 0;
        boolean Play = true;

        System.out.println("---Wellcome to the Gusses The Number Game---");
        while (Play) {

             //It will take Ramdom Number from 100 and substract the random number by 1
            int Random_Num = random.nextInt(100) - 7;
            int attempts = 0;
            boolean GussesNumber = false;

            System.out.println("I am Gussesing Secret Number from " + Min_Num +" to " + Max_Num);
            System.out.println("You have " + Max_Attempts + " attempts to Play");

            while(attempts < Max_Attempts){
                System.out.print("Gusses the Number: ");

                try{
                    int Gusses_Num = sc.nextInt();
                    attempts++;

                    if(Gusses_Num > Random_Num){
                        System.out.println("Gusses is Too High!! ");
                    }
                    else if(Gusses_Num < Random_Num){
                        System.out.println("Gusses is Too Low!! ");
                    }
                    else{
                        System.out.println("Correct gusses in " + attempts + " attempts");
                        GussesNumber = true;
                        roundwon++;
                        int point = (Max_Attempts - attempts) + 10;
                        score += point; 
                        break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("Invalid input please enter an integer");
                    sc.next(); // it will Clear the invalid input from the scanner
                }
            }

                if(!GussesNumber){
                    System.out.println("Sorry, you've run out of attempts, The Secret Number is " + Random_Num);
                }

            System.out.print("Do you want to play again? (yes / no)");
                String playAgain = sc.next();
                //IgnoreCase: This is the key part. It means the comparison is case-insensitive. It doesn't care if the letters are uppercase or lowercase.
                Play = playAgain.equalsIgnoreCase("yes");   
        }

        System.out.println("---GameOver---");
        System.out.println("You won " + roundwon + " rounds");
        System.out.println("You Score "+ score + " points");
        System.out.println("Thankyou for Playing");
        sc.close();
    }
}

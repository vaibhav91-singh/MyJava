package Projects;

import java.util.Random;
import java.util.Scanner;


public class DiceROll {
    
    public static void main(String[] args) {
        // DECLARE VARIABLE
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberOfDice;
        int total = 0;
        // GET  # OF DICE FROM USER
        
        System.out.print("How many dice you want to roll : ");
        numberOfDice = scanner.nextInt();

        // ROLL DICE`
        if(numberOfDice > 0){
            for(int i= 0 ;i < numberOfDice ; i++){
                int roll = random.nextInt(6)+1;
                printDice(roll);
                System.out.println("You rolled : "+roll);
                System.out.println("------------------------");
                total = total + roll;
            }
            System.out.println("Total : "+total);
        }


        // DISPLAY DICE 

        // TOTAL 

        // DISPLAY ASCII OF DICE 
    }
    static void printDice(int roll){
        switch(roll){
            case 1:
            System.out.println("┌─────┐");
            System.out.println("│     │");
            System.out.println("│  ●  │");
            System.out.println("│     │");
            System.out.println("└─────┘");
            break;
            case 2:
            System.out.println("┌─────┐");
            System.out.println("│ ●   │");
            System.out.println("│     │");
            System.out.println("│   ● │");
            System.out.println("└─────┘");
            break;
            case 3:
            System.out.println("┌─────┐");
            System.out.println("│ ●   │");
            System.out.println("│  ●  │");
            System.out.println("│   ● │");
            System.out.println("└─────┘");
            break;
            case 4:
            System.out.println("┌─────┐");
            System.out.println("│ ●   │");
            System.out.println("│     │");
            System.out.println("│ ●   │");
            System.out.println("└─────┘");
            break;
            case 5:
            System.out.println("┌─────┐");
            System.out.println("│ ●   │");
            System.out.println("│  ●  │");
            System.out.println("│ ●   │");
            System.out.println("└─────┘");
            break;
            case 6:
            System.out.println("┌─────┐");
            System.out.println("│ ●   │");
            System.out.println("│ ●   │");
            System.out.println("│ ●   │");
            System.out.println("└─────┘");
            break;
        }
    }
}

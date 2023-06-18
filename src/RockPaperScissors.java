import java.util.Objects;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain = "";
        String moveA = "";
        String moveB = "";
        while (true){
            System.out.println("Do you want to play again Y or N");
            playAgain = in.nextLine();
            if (!Objects.equals(playAgain, "Y")) {break;}
            System.out.println("Enter R for rock, P for paper, S for scissor.");
            while (true){
                System.out.println("Player A, enter your move (R/P/S): ");
                moveA = in.nextLine();
                //Valid A input
                if((moveA.equalsIgnoreCase("R")||moveA.equalsIgnoreCase("P")||moveA.equalsIgnoreCase("S"))){break;}
                {System.out.println("Invalid move, please enter R for rock, P for paper, S for scissor. ");}
            }
            while (true){
                System.out.println("Player B, enter your move (R/P/S): ");
                moveB = in.nextLine();
                //Valid B input
                if((moveB.equalsIgnoreCase("R")||moveB.equalsIgnoreCase("P")||moveB.equalsIgnoreCase("S"))){break;}
                {System.out.println("Invalid move, please enter R for rock, P for paper, S for scissor. ");}
            }
            if (moveA.equalsIgnoreCase("R")){
                if (moveB.equalsIgnoreCase("R")) {
                        System.out.println("it's a tie");}
                else if (moveB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers Rock, player A loses!");}
                else {System.out.println("Rock break Scissors, player A wins!");}
            }
            else if (moveA.equalsIgnoreCase("P")){
                if (moveB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock, player A wins");}
                else if (moveB.equalsIgnoreCase("P")) {
                        System.out.println("It's a tie");}
                else {System.out.println("Scissors cuts Paper, player A loses!");}
            }
            else {
                if (moveB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissors, player A wins");}
                else if (moveB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cuts Paper, player A wins!");}
                else {System.out.println("It's a tie");}
            }
        }
    }
}
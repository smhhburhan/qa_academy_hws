package week2;
import java.util.Random;
//semih burhan - getir
public class diceGamblingGame {

    public static void main(String[] args) {
        int totalDice;
        int i = 0;

        System.out.println("Welcome the Dice Gambling Game!!" + "\n"+ "With each additional roll, you have the chance to win more money," +"\n" + "or you might roll a game-ending 1 or 2 at which time the game is over" + "\n"+ "and you keep whatever winnings you have accumulated.\n");

        for(totalDice = 0; totalDice < 50; i++){
            Random random = new Random();
            int dice = random.nextInt(6) + 1;

            if ((dice == 1) || (dice == 2)) {
                System.out.println("Dice is:" + dice + "\n" + "Game over!Try again!");
                break;
            }
            if (dice == 3) {
                totalDice = totalDice + 0;
                System.out.println("Dice is:" + dice);
                System.out.println("Your earning is: " + totalDice + "$");
                System.out.println("The dice is rolled again.");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 4) {
                totalDice = totalDice + 4;
                System.out.println("Dice is:" + dice);
                System.out.println("Your earning is: " + totalDice + "$");
                System.out.println("The dice is rolled again.");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 5) {
                totalDice = totalDice + 5;
                System.out.println("Dice is:" + dice);
                System.out.println("Your earning is: " + totalDice + "$");
                System.out.println("The dice is rolled again.");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 6) {
                totalDice = totalDice + 6;
                System.out.println("Dice is:" + dice);
                System.out.println("Your earning is: " + totalDice + "$");
                System.out.println("The dice is rolled again.");
                dice = random.nextInt(6) + 1;
            }
        }
        if (totalDice >= 50) {
            System.out.println("You have earned the maximum amount of money you can earn." + "\n" + "Your total earning is: " + totalDice + "$");
        }
    }
}
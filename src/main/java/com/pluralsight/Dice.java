package com.pluralsight;

public class Dice {

    //main method
    public static void main(String[] args) {
        //declare variables
        int i = 0;
        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        //create new instance of Dice named dice
        Dice dice = new Dice();

        //loop that executes 100 times
        while (i < 100) {
            i++;
            //call roll method two times
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            //print value of each roll and their sum
            System.out.printf("Roll %d: %d - %d Sum: %d\n", i, roll1, roll2, sum);

            //check sum and increment counter for 2,4,6, and 7
            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }
        //display counters
        System.out.printf("Roll sum was 2: %d times\n" +
                "Roll sum was 4: %d times\n" +
                "Roll sum was 6: %d times\n" +
                "Roll sum was 7: %d times", twoCounter, fourCounter, sixCounter, sevenCounter);
    }
    //roll method
    public int roll() {
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}

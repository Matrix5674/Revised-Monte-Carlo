public class monteCarloProblem0_New_ {
    public static int trials = 10000;
    public static void main(String[] args) {
        runSimulation(trials, 100);
    }
    public static void runSimulation(int trials, int amountOfDice){

        double evenDiceSum;
        for (int currNumOfDice = 0; currNumOfDice < amountOfDice; currNumOfDice++) {
            getAverageOfSingleDie(currNumOfDice);

        }
    }

    public static void getAverageOfSingleDie(int currNumOfDice){
        double evenDiceSum = 0;
        for (int trial = 0; trial < trials; trial++) {
            evenDiceSum += getOneTrial(currNumOfDice);
        }
        System.out.println(evenDiceSum/trials + " is the average of the sum of even numbers when rolling " + currNumOfDice + " 6 sided dice.");
    }
    public static double getOneTrial(int amountOfDice){
        double evenDiceSum = 0;
        for (int diceIndex = 0; diceIndex < amountOfDice; diceIndex++) {
            int currDice = (int) (Math.random() * 6 + 1);
            if (currDice % 2 == 0) {
                evenDiceSum += currDice;
            }
        }
        return evenDiceSum;
    }

}

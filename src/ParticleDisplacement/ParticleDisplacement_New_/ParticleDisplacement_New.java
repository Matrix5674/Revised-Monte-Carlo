package ParticleDisplacement_New_;

import ParticleDisplacement.ParticleDisplacement_New_.Point_New;

public class ParticleDisplacement_New {


    /*
       1 = Up
       2 = right
       3 = down
       4 = left
       */
    public static int trials = 10000;
    public static int randomSteps = 100;



    public static void main(String[] args) {
        runSimulation(randomSteps, trials);


    }

    public static void runSimulation (int randomSteps, int trials){
        for (int step = 0; step < randomSteps; step++) {
            double avgDistance = conductTrial(step);
            printResults(step, avgDistance, trials);
        }
    }

    public static double conductTrial(int step){
        double avgDistance = 0;
        for (int i = 0; i < trials; i++) {
            Point_New point = new Point_New(0, 0);
            point = takeSteps(step, point);
            avgDistance += point.distance();
        }
        return avgDistance;
    }

    public static Point_New takeSteps(int step, Point_New point){
        for (int j = 0; j < step; j++)
            point = simulateRandomMovement(point);
        return point;
    }



    public static Point_New simulateRandomMovement (Point_New p){
        Point_New point = p;
        switch ((int) (Math.random() * 4 + 1)) {
            case 1 -> point.setY((point.getY() + 1));
            case 2 -> point.setX(point.getX() + 1);
            case 3 -> point.setY((point.getY() - 1));
            case 4 -> point.setX(point.getX() - 1);
        }
        return point;

    }

    public static void printResults(int step, double avgDistance, int trials) {
        System.out.println(step + " random steps have average displacement " +
                avgDistance/10000);
    }


}


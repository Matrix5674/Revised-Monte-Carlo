package ParticleDisplacement.ParticleDisplacement_Old_;



public class ParticleDisplacement_Old {
        /*
        1 = Up
        2 = right
        3 = down
        4 = left
        */
        public static int trials = 10000;
        public static int randomSteps = 100;


        public static void main(String[] args) {


            for (int step = 0; step < randomSteps; step++) {
                double avgDistance = 0;
                for (int i = 0; i < trials; i++) {
                    Point_Old point = new Point_Old (0, 0);
                    for (int j = 0; j < step; j++) {

                        switch ((int) (Math.random() * 4 + 1)) {
                            case 1 -> point.setY((point.getY() + 1));
                            case 2 -> point.setX(point.getX() + 1);
                            case 3 -> point.setY((point.getY() - 1));
                            case 4 -> point.setX(point.getX() - 1);

                        }

                        avgDistance += point.distance();

                    }
                }

                System.out.println(step + " random steps have average displacement " +
                        avgDistance/10000);
            }
        }


}

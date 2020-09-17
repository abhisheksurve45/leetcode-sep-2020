public class RobotBoundedInCircle {

    class Solution {
        public boolean isRobotBounded(String instructions) {

            int direction = 'N';
            int x = 0;
            int y = 0;

            for (char c : instructions.toCharArray()) {

                switch (c) {

                    case 'G':

                        if (direction == 'N') {
                            y++;
                        } else if (direction == 'S') {
                            y--;
                        } else if (direction == 'W') {
                            x--;
                        } else {
                            x++;
                        }

                        break;

                    case 'L':

                        if (direction == 'N') {
                            direction = 'W';
                        } else if (direction == 'S') {
                            direction = 'E';
                        } else if (direction == 'W') {
                            direction = 'S';
                        } else {
                            direction = 'N';
                        }

                        break;

                    default:

                        if (direction == 'N') {
                            direction = 'E';
                        } else if (direction == 'S') {
                            direction = 'W';
                        } else if (direction == 'W') {
                            direction = 'N';
                        } else {
                            direction = 'S';
                        }

                }

            }

            return (x == 0 && y == 0) || direction != 'N';
        }
    }

}

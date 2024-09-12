/*
A robot on an infinite XY-plane starts at point (0, 0) facing north. 
The robot receives an array of integers commands, which represents a sequence of moves that it needs to execute. 
There are only three possible types of instructions the robot can receive:

-2: Turn left 90 degrees.
-1: Turn right 90 degrees.
1 <= k <= 9: Move forward k units, one unit at a time.
Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi). 
If the robot runs into an obstacle, it will stay in its current location (on the block adjacent to the obstacle) and move onto the next command.

Return the maximum squared Euclidean distance that the robot reaches at any point in its path (i.e. if the distance is 5, return 25).

Note:

There can be an obstacle at (0, 0). If this happens, the robot will ignore the obstacle until it has moved off the origin. 
However, it will be unable to return to (0, 0) due to the obstacle.
North means +Y direction.
East means +X direction.
South means -Y direction.
West means -X direction.
*/

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
     // Directions are represented as (dx, dy) pairs
        int[][] directions = new int[][] {
            {0, 1},   // North
            {1, 0},   // East
            {0, -1},  // South
            {-1, 0}   // West
        };

        // Start at origin (0, 0)
        int x = 0, y = 0;
        int directionIndex = 0; // Start facing North
        int maxDistance = 0;

        // Convert obstacles array to a set for fast lookup
        HashSet<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);  // Store as a string "x,y"
        }

        // Process each command
        for (int command : commands) {
            if (command == -2) { // Turn left 90 degrees
                directionIndex = (directionIndex + 3) % 4; // %4 for 360 degrees
            } else if (command == -1) { // Turn right 90 degrees
                directionIndex = (directionIndex + 1) % 4;
            } else { // Move forward k units
                int dx = directions[directionIndex][0];
                int dy = directions[directionIndex][1];

                for (int i = 0; i < command; i++) {
                    int newX = x + dx;
                    int newY = y + dy;

                    // Check if the next position is an obstacle
                    if (obstacleSet.contains(newX + "," + newY)) {
                        break;
                    }

                    x = newX;
                    y = newY;

                    // Update max distance from origin
                    maxDistance = Math.max(maxDistance, x * x + y * y);
                }
            }
        }

        return maxDistance;
    }
}
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class FindMissingandRepeatedValues {
    static void main(String[] args) {
        // Creates a 2x3 matrix with specific values
        int[][] numbers = {
                {1, 2, 2},
                {4, 5, 6}
        };
        System.out.print((Missing(numbers)));
    }

    public static Stack<Integer> Missing(int[][] grid) {
        Set<Integer> newset = new HashSet<>();
        Stack<Integer> ans = new Stack<>();
        int n = grid.length;
        int repeted = 0;
        int sum = 0;
        int expectedsum = 0;
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
                if (!newset.contains(grid[i][j])) {
                    newset.add(grid[i][j]);
                } else {
                    repeted = grid[i][j];
                    ans.push(repeted);
                }
            }
        }
        //find Missing number
        int m = grid.length * grid[0].length;
        expectedsum = m * (m + 1) / 2;
        result = expectedsum + repeted - sum;
        ans.push(result);
        return ans;
    }
}

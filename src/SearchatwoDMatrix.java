public class SearchatwoDMatrix {
    static void main(String[] args) {
        // Creates a 2x3 matrix with predefined values
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int target = 6;
        System.out.print(searchMatrix(matrix, target));
    }

    public static boolean SerchInfo(int[][] mat, int target, int row) {
        int n = mat[0].length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target == mat[row][mid]) {
                return true;
            } else if (target > mat[row][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] mat, int target) {
        int n = mat[0].length;
        int m = mat.length;
        int startrow = 0;
        int endrow = mat.length - 1;
        boolean found = false;
        while (startrow < endrow) {
            int midrow = startrow + (endrow - startrow) / 2;

            if (target >= mat[midrow][0] && target <= mat[midrow][n - 1]) {
                SerchInfo(mat, target, midrow);
            } else if (target >= mat[midrow][n - 1]) {
                startrow = midrow + 1;
            } else {
                endrow = midrow - 1;
            }
        }
        return false;
    }
}

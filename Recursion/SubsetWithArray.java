import java.util.ArrayList;

public class SubsetWithArray {
    public static void main(String[] args) {
        // var ans = new ArrayList<Integer>();
        // subsetWithArrayHelper(ans, new int[] { 1, 2, 3 }, 0);
        // ArrayList<ArrayList<Integer>> result = combinationHelper(ans, new int[] { 2,
        // 1, 6, 7 }, 0, 7);
        // System.out.println(result);
        // System.out.println((char) ('2'));
        // letterCombinationsOfANumberHelper("", "23");
        // printPaths(0, 0, "", 3, 3);
        boolean[][] board = new boolean[2][3];
        printPathsWithFourDirection(0, 0, "", board);
        // board[0][1] = true;
        // board[1][2] = true;
        // board[2][0] = true;
        // printPathsWithBoard(0, 0, "", board);

    }

    public static void subsetWithArrayHelper(ArrayList<Integer> processed, int[] unprocessed, int current) {

        if (current == unprocessed.length) {

            System.out.println(processed.toString());
            return;
        }

        processed.add(unprocessed[current]);
        subsetWithArrayHelper(processed, unprocessed, current + 1);
        // This is to backtrack,Since that it is an object we revert this
        processed.remove(processed.size() - 1);
        subsetWithArrayHelper(processed, unprocessed, current + 1);

    }

    public static ArrayList<ArrayList<Integer>> combinationHelper(ArrayList<Integer> processed, int[] unprocessed,
            int current, int target) {

        if (target == 0) {
            // System.out.println(processed);
            var ans = new ArrayList<ArrayList<Integer>>();
            ans.add(new ArrayList<>(processed));
            return ans;

        }

        if (processed.size() == 0 || target < 0 || current == unprocessed.length) {

            return new ArrayList<>();
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        processed.add(unprocessed[current]);
        var left = combinationHelper(processed, unprocessed, current,
                target - unprocessed[current]);
        result.addAll(left);
        // This is to backtrack,Since that
        processed.remove(processed.size() - 1);
        var right = combinationHelper(processed, unprocessed, current + 1, target);
        result.addAll(right);
        return result;

    }

    public static void letterCombinationsOfANumber(String s) {
        letterCombinationsOfANumberHelper("", s);

    }

    public static void letterCombinationsOfANumberHelper(String processed, String unprocessed) {

        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        int start;
        int end;// exclusive
        char c = (char) unprocessed.charAt(0);
        // System.err.println(c);
        // System.out.println(c - '0');

        switch (c) {
            case '7':
                start = 15;
                end = 19;

                break;
            case '8':
                start = 19;
                end = 22;
                break;
            case '9':
                start = 22;
                end = 26;
                break;

            default:
                start = 3 * (c - '0') - 6;
                end = start + 3;
        }
        for (int i = start; i < end; i++) {
            char cur = (char) ('a' + i);
            letterCombinationsOfANumberHelper(processed + cur, unprocessed.substring(1));
        }
    }

    public static void printPaths(int currentRow, int currentColumn, String path,
            int r, int c) {
        if (currentRow >= r || currentColumn >= c) {
            return;
        }
        if (currentRow == r - 1 && currentColumn == c - 1) {
            System.err.println(path);
            return;
        }

        printPaths(currentRow + 1, currentColumn, path + 'D', r, c);
        printPaths(currentRow, currentColumn + 1, path + 'R', r, c);

    }

    public static void printPathsWithBoard(int currentRow, int currentColumn, String path, boolean[][] board) {
        if (currentRow >= board.length || currentColumn >= board[0].length) {
            return;
        }
        if (board[currentRow][currentColumn]) {
            return;
        }
        if (currentRow == board.length - 1 && currentColumn == board[0].length - 1) {
            System.err.println(path);
            return;
        }

        printPathsWithBoard(currentRow + 1, currentColumn, path + 'D', board);
        printPathsWithBoard(currentRow, currentColumn + 1, path + 'R', board);

    }

    public static void printPathsWithFourDirection(int currentRow, int currentColumn, String path, boolean[][] board) {
        if (currentRow < 0 || currentColumn < 0 || currentRow >= board.length || currentColumn >= board[0].length) {
            return;
        }
        if (board[currentRow][currentColumn]) {
            return;
        }
        if (currentRow == board.length - 1 && currentColumn == board[0].length - 1) {
            System.err.println(path);
            return;
        }
        board[currentRow][currentColumn] = true;
        printPathsWithFourDirection(currentRow + 1, currentColumn, path + 'D', board);
        printPathsWithFourDirection(currentRow, currentColumn + 1, path + 'R', board);
        printPathsWithFourDirection(currentRow, currentColumn - 1, path + 'L', board);
        printPathsWithFourDirection(currentRow - 1, currentColumn, path + 'U', board);
        board[currentRow][currentColumn] = false;
    }

}

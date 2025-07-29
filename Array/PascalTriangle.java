import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        // pascalTriangle(5);
        // System.out.println(getElement(5, 0));
        // System.out.println(generateRow(4));
        var res = pascalTriangle(5);
        for (List<Integer> list : res) {
            System.out.println(list.toString());
        }
    }

    // Brute Force
    public static int getElement(int row, int column) {
        // In pascal triangle the each element can computed with help of combination
        // formula that is n!/r!*(n-r)!;
        // here row is n and column is r and we should always give 0 indexed position
        // int result = 0;
        // int numberator = factorial(row);
        // int denominator1 = factorial(column);
        // int denominator2 = factorial(row - column);
        // result = numberator / (denominator1 * denominator2);
        // return result;

        // Here for computing above this we are taking almost O(R+C+(R_C));
        // So we can able reduce them
        // for example (5,2)
        // it would (5*4*3*2*1) /(2*1)*(3*2*1);
        // for all any inputs the (n-r)! are canceled by numberator elements so we can
        // simply right this as
        // (5*4)/(2*1) which simplifies all calculations
        // for this we can use simple for loop to compute them
        // TC N(C)

        int result = 1;
        for (int i = 0; i < column; i++) {
            result = result * (row - i);
            result = result / (i + 1);
        }

        return result;

    }

    // public static void pascalTriangle(int n) {
    // for(

    // int i = 0;i<n;i++)
    // {
    // for (int j = n - 2; j >= i; j--) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j <= i; j++) {
    // System.out.print(getElement(i, j) + " ");
    // }
    // System.out.println();

    // }
    // }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(generateRow(i));

        }
        return result;

    }

    public static List<Integer> generateRow(int row) {

        // Here we can use generateElement to get each element ,but there is even more
        // better solution for this
        // for (5th row) the calculations would we with generateElement are
        // 5/1 5*4/1*2 5*4*3/1*2*3 5*4*3*2/1*2*3*4 5*4*3*2*1/1*2*3*4*5
        // Here on each colValye the extra element,but remaining are previously computed
        // value so,if we found any trick to add them based on col value its simple

        List<Integer> result = new ArrayList<>();
        int colValue = 1;
        result.add(colValue);
        for (int i = 0; i < row; i++) {
            colValue *= row - i;
            colValue /= (i + 1);
            result.add(colValue);
        }
        return result;

    }
    // Optimal
}
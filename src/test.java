import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0}, {0,1,0,1}, {1,0,0,0}};
        int[] row = new int[100];
        int[] col = new int[100];
        int n = 0;
        for(int i = 0; i < grid.length; i++){

            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    row[i] += 1;
                    col[j] += 1;
                }
            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    n += (row[i] - 1) * (col[j] - 1);
                }
            }
        }
        System.out.println(n);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[][] variables = {{55,19,87,22}};
        int target = 34, n = 1, p = target;
        while(p >= 10){
            p = p / 10;
            n += 1;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<variables.length; i++){
            variables[i][0] = variables[i][0] % (10*n);
            if(Math.pow(Math.pow(variables[i][0], variables[i][1]) % 10, variables[i][2]) % variables[i][3] == target){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}

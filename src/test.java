import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[][] variables = {{528,818,733,438}};
        List<Integer> result = new ArrayList<>();
        int target = 256;
        long sum = 1, a = 0;
        for(int i = 0;i<variables.length; i++){
            sum = 1;
            for(int n = 0; n < variables[i][1]; n++){
                sum = (sum * variables[i][0])%1000;
            }
            a = sum % 10;
            sum = 1;
            for(int n = 0; n < variables[i][2]; n++){
                sum = (sum * a)% variables[i][3];
            }
            if(sum == target){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}

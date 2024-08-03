import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] cards = {1,2,8,9};
        int cnt = 3, max = 0, sum = 0, s = -1, max2 = 0, fmin = 0, fmin2 = 0;
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            max = 0;
            for(int j = 0; j < cards.length; j++){
                if(cards[j] > max){
                    if(max != 0){
                        cards[s] = max;
                    }
                    s = j;
                    max = cards[j];
                    cards[j] = 0;
                }
            }
            arr[i] = max;
        }
        max = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
        }
        if(sum % 2 == 0){
            System.out.println(sum);
        }else{
            for(int j = 0; j < cards.length; j++){
                if(cards[j] > max && cards[j] % 2 == 0){
                    max = cards[j];
                }else if(cards[j] > max2 &&cards[j] % 2 == 1){
                    max2 = cards[j];
                }
            }
            boolean flag = true, flag2 = true;
            for(int j = cnt - 1; j >= 0; j--){
                if(flag && arr[j] % 2 == 0){
                     fmin = arr[j];
                     flag = false;
                }
                if(flag2 && arr[j] % 2 == 1){
                    fmin2 = arr[j];
                    flag2 = false;
                }
                if(flag == false && flag2 == false){
                    break;
                }
            }
            if((max == 0 || fmin2 == 0 ) && (max2 == 0 || fmin == 0)){
                System.out.println(0);
            } else if(max == 0 || fmin2 == 0) {
                System.out.println(sum + max2 - fmin);
            }else if(max2 == 0 || fmin == 0){
                System.out.println(sum + max - fmin2);
            }else {
                System.out.println((sum + max - fmin2) > (sum + max2 - fmin)?(sum + max - fmin2) : (sum + max2 - fmin));
            }
        }

    }
}

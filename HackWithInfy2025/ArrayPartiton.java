
import java.util.*;
public class ArrayPartiton{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        int[] nums = new int[total];
        for(int i=0; i<total; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int sum = 0;

        for(int i =0; i<total; i+=2){
            
                sum +=nums[i];
        }
        
        System.out.println(sum);
    }
}

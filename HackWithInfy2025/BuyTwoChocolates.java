import java.util.*;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int money = sc.nextInt(); 

        Arrays.sort(prices);
        int cost = prices[0] + prices[1];

        if (cost <= money) {
            System.out.println(money - cost);
        } else {
            System.out.println(money);
        }
    }
}


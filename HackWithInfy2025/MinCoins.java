import java.util.*;

 class MinCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        List<Integer> coins = new ArrayList<>();
        while (sc.hasNextInt()) {
            coins.add(sc.nextInt());
        }

        int count = 0;
        for (int coin : coins) {
            if (amount >= coin) {
                int used = amount / coin;  
                count += used;
                amount -= used * coin;     
            }
        }

        System.out.println(count);
    }
}

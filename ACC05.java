import java.util.*;
public class ACC05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        int maxToys = getMaxToys(prices, money);
        System.out.println(maxToys);
    }

    public static int getMaxToys(int[] prices, int money) {
        int left = 0;
        int currentSum = 0;
        int maxToys = 0;

        for (int right = 0; right < prices.length; right++) {
            currentSum += prices[right];

            while (currentSum > money) {
                currentSum -= prices[left];
                left++;
            }
            maxToys = Math.max(maxToys, right - left + 1);
        }

        return maxToys;
    }


}



import java.util.Scanner;
import java.util.HashSet;



public class ACC02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(sc.nextLine());
        }
        String s = sc.nextLine();
        int result = wordBreak(s, dictionary) ? 1 : 0;
        System.out.println(result);
    }

    public static boolean wordBreak(String s, HashSet<String> dictionary) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[length];
    }
}
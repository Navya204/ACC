import java.util.Scanner;

public class ACC04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ticketPrice = sc.nextLine();
        int k = sc.nextInt();
        String finalPrice = reducePrice(ticketPrice, k);
        System.out.println(finalPrice);
    }

    public static String reducePrice(String price, int k) {
        StringBuilder result = new StringBuilder();
        int length = price.length();
        for (int i = 0; i < length; i++) {
            while (k > 0 && result.length() > 0 && result.charAt(result.length() - 1) > price.charAt(i)) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            result.append(price.charAt(i));
        }
        while (k > 0 && result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
            k--;
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.length() == 0 ? "0" : result.toString();


    }
}
